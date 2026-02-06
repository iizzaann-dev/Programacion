/**
 * Clase que representa una cuenta bancaria del banco PlayamarBank.
 * <p>
 * El identificador de la cuenta tiene el formato AAAA-NNNN, donde AAAA es el año
 * de creación de la cuenta y NNNN es un número consecutivo que se reinicia cada año.
 * </p>
 * <p>
 * La cuenta puede tener un embargo, que representa una cantidad bloqueada del saldo
 * disponible. Una cuenta embargada no puede quedar en saldo negativo.
 * </p>
 */
package PlayamarBank;

import java.time.LocalDate;

public class PlayamarBank {

	/**
	 * Límite de descubierto por defecto.
	 */
	public static final double DEFAULT_MAX_DESCUBIERTO = 0.0;

	/**
	 * Saldo inicial por defecto.
	 */
	public static final double DEFAULT_SALDO = 0.0;

	/**
	 * Límite máximo de descubierto permitido.
	 */
	public static final double MAX_DESCUBIERTO = -2000.0;

	/**
	 * Saldo máximo permitido en una cuenta.
	 */
	public static final double MAX_SALDO = 5.0E7;

	/**
	 * Valor mínimo permitido para un embargo.
	 */
	public static final double MIN_EMBARGO = 0;

	/**
	 * Año mínimo permitido para la creación de una cuenta.
	 */
	public static final int MIN_YEAR = 1900;

	/**
	 * Saldo global del banco.
	 */
	public static double saldo_global;

	/**
	 * Número total de cuentas embargadas.
	 */
	public static int cuentas_embargadas;

	/**
	 * Fecha de creación de la cuenta más moderna.
	 */
	public static LocalDate cuenta_mas_moderna;

	/**
	 * Fecha actual por defecto.
	 */
	public static LocalDate default_fecha_actual = LocalDate.now();

	/**
	 * Contador interno para generar identificadores.
	 */
	private static int contador = 0;

	/**
	 * Año del último contador utilizado.
	 */
	private static int anioUltimoContador = LocalDate.now().getYear();

	/**
	 * Fecha de creación de la cuenta.
	 */
	private final LocalDate fechaCreacion;

	/**
	 * Identificador único de la cuenta.
	 */
	private String identificador;

	/**
	 * Cantidad embargada de la cuenta.
	 */
	private double embargo;

	/**
	 * Saldo actual de la cuenta.
	 */
	private double saldoActual;

	/**
	 * Saldo máximo alcanzado por la cuenta.
	 */
	private double saldoMaximo;

	/**
	 * Total de ingresos realizados en la cuenta.
	 */
	private double ingresosTotales;

	/**
	 * Límite de descubierto permitido en la cuenta.
	 */
	private double limiteDescubierto;

	/**
	 * Saldo inicial con el que se creó la cuenta.
	 */
	private double saldoInicial;

	/**
	 * Constructor principal de la cuenta.
	 *
	 * @param saldoInicial saldo inicial de la cuenta
	 * @param fechaCreacion fecha de creación de la cuenta
	 * @param limiteDescubierto límite de descubierto permitido
	 * @throws IllegalArgumentException si alguno de los parámetros no es válido
	 */
	public PlayamarBank(double saldoInicial, LocalDate fechaCreacion, double limiteDescubierto)
			throws IllegalArgumentException {

		if (saldoInicial < 0) {
			throw new IllegalArgumentException("El saldo inicial no puede ser menor que cero");
		}

		if (fechaCreacion.getYear() < MIN_YEAR) {
			throw new IllegalArgumentException("La fecha de creación de la cuenta no puede ser anterior a 1900");
		}

		if (limiteDescubierto < MAX_DESCUBIERTO) {
			throw new IllegalArgumentException("El limite descubierto máximo es de -2000€");
		}

		this.saldoInicial = saldoInicial;
		this.fechaCreacion = fechaCreacion;
		this.limiteDescubierto = limiteDescubierto;
		this.identificador = generarIdentificador();
	}

	/**
	 * Constructor de la cuenta con saldo inicial y fecha de creación.
	 *
	 * @param saldoInicial saldo inicial de la cuenta
	 * @param fechaCreacion fecha de creación de la cuenta
	 */
	public PlayamarBank(double saldoInicial, LocalDate fechaCreacion) {
		this(saldoInicial, fechaCreacion, DEFAULT_MAX_DESCUBIERTO);
	}

	/**
	 * Constructor de la cuenta con saldo inicial.
	 *
	 * @param saldoInicial saldo inicial de la cuenta
	 */
	public PlayamarBank(double saldoInicial) {
		this(saldoInicial, default_fecha_actual, DEFAULT_MAX_DESCUBIERTO);
	}

	/**
	 * Constructor por defecto de la cuenta.
	 */
	public PlayamarBank() {
		this(DEFAULT_SALDO, default_fecha_actual, DEFAULT_MAX_DESCUBIERTO);
	}

	/**
	 * Genera el identificador único de la cuenta.
	 *
	 * @return identificador generado
	 */
	private String generarIdentificador() {

		int fechaCuenta = fechaCreacion.getYear();

		if (fechaCuenta != anioUltimoContador) {
			contador = 0;
			anioUltimoContador = fechaCuenta;
		}

		String id = String.format("%04d- %04d", fechaCuenta, contador);
		contador++;

		return id;
	}

	/**
	 * Embarga una cantidad del saldo de la cuenta.
	 *
	 * @param cantidad_a_embargar cantidad a embargar
	 * @throws IllegalArgumentException si la cantidad no es válida
	 * @throws IllegalStateException si el embargo deja la cuenta en descubierto
	 */
	public void embargar(double cantidad_a_embargar)
			throws IllegalArgumentException, IllegalStateException {

		if (cantidad_a_embargar < 0) {
			throw new IllegalArgumentException("La cantidad a embargar no puede ser menor de 0 euros");

		} else if (cantidad_a_embargar > saldoActual) {
			throw new IllegalArgumentException(
					"La cantidad a embargar no puede ser mayor a tu saldo actual. Actualmente tienes "
							+ saldoActual + "€ y has intentado embargar " + cantidad_a_embargar + "€");
		}

		if (saldoActual - cantidad_a_embargar < limiteDescubierto) {
			throw new IllegalStateException("No se puede embargar esa cantidad porque dejaría la cuenta en descubierto");
		}

		this.embargo = cantidad_a_embargar;
	}

	/**
	 * Elimina el embargo de la cuenta.
	 *
	 * @param cantidad_a_desembargar cantidad a desembargar
	 * @return true si se desembarga la cuenta, false en caso contrario
	 */
	public boolean desembargar(double cantidad_a_desembargar) {

		boolean decision = false;

		if (embargo != 0) {
			decision = true;
			embargo = 0;
		} else {
			decision = false;
		}

		return decision;
	}

	/**
	 * Ingresa una cantidad de dinero en la cuenta.
	 *
	 * @param cantidad Cantidad a ingresar
	 * @throws IllegalArgumentException Si la cantidad es negativa
	 * @throws IllegalStateException Si la suma de saldo, ingreso y embargo supera el saldo máximo permitido
	 */
	public void ingresar(double cantidad) throws IllegalArgumentException, IllegalStateException {
	    if (cantidad < 0) {
	        throw new IllegalArgumentException("No se puede ingresar una cantidad negativa");
	    }

	    if (saldoActual + cantidad + embargo > MAX_SALDO) {
	        throw new IllegalStateException(
	            "No se puede ingresar esa cantidad, superaría el saldo máximo permitido"
	        );
	    }

	    saldoActual = saldoActual + cantidad;

	    if (saldoActual > saldoMaximo) {
	        saldoMaximo = saldoActual;
	    }

	    ingresosTotales = ingresosTotales + cantidad;
	}
	
	/**
	 * Extrae una cantidad de dinero de la cuenta.
	 *
	 * @param cantidad Cantidad a extraer
	 * @throws IllegalArgumentException Si la cantidad es negativa
	 * @throws IllegalStateException Si se supera el límite de descubierto o se intenta dejar el saldo por debajo del embargo
	 */
	public void extraer(double cantidad) throws IllegalArgumentException, IllegalStateException {
	    if (cantidad < 0) {
	        throw new IllegalArgumentException("No se puede extraer una cantidad negativa");
	    }

	    if (saldoActual - cantidad < limiteDescubierto) {
	        throw new IllegalStateException("No se puede extraer esa cantidad, se superaría el límite de descubierto");
	    }

	    if (saldoActual - cantidad < embargo) {
	        throw new IllegalStateException("No se puede extraer esa cantidad, dejaría el saldo por debajo del embargo");
	    }

	    saldoActual = saldoActual - cantidad;
	}

	/**
	 * Realiza una transferencia desde esta cuenta a otra, con la cantidad indicada.
	 *
	 * @param cantidad cantidad a transferir
	 * @param destino cuenta destino
	 * @throws IllegalArgumentException si la cantidad es negativa
	 * @throws IllegalStateException si se superan los límites permitidos
	 */
	public void transferir(double cantidad, PlayamarBank destino) throws IllegalArgumentException, IllegalStateException {

		if (cantidad < 0) {
	        throw new IllegalArgumentException("No se pueden hacer transferencias de valor negativo");
	    }

	    if (destino.getSaldoActual() + cantidad > MAX_SALDO) {
	        throw new IllegalStateException("No se puede transferir, se superaría el saldo máximo de la cuenta destino");
	    }

	    this.extraer(cantidad);
	    destino.ingresar(cantidad);
	}

	/**
	 * Realiza una transferencia desde esta cuenta a otra
	 * 
	 * @param destino cuenta destino
	 * @throws IllegalArgumentException si la cantidad es negativa
	 * @throws IllegalStateException si se superan los límites permitidos
	 */
	
	public void transferir (PlayamarBank destino) throws IllegalArgumentException, IllegalStateException {
		
		double cantidad = this.getSaldoActual() - this.embargo;
		
		if (cantidad < 0) {
	        throw new IllegalArgumentException("No se pueden hacer transferencias de valor negativo");
	    }

	    if (destino.getSaldoActual() + cantidad > MAX_SALDO) {
	        throw new IllegalStateException("No se puede transferir, se superaría el saldo máximo de la cuenta destino");
	    }
	    
	    this.extraer(cantidad);
	    destino.ingresar(cantidad);
	}
	
	/**
	 * @return saldo global del banco
	 */
	public static double getSaldo_global() {
		return saldo_global;
	}

	/**
	 * @return número de cuentas embargadas
	 */
	public static int getCuentas_embargadas() {
		return cuentas_embargadas;
	}

	/**
	 * @return fecha de la cuenta más moderna
	 */
	public static LocalDate getCuenta_mas_moderna() {
		return cuenta_mas_moderna;
	}

	/**
	 * @return fecha de creación de la cuenta
	 */
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @return identificador de la cuenta
	 */
	public String getIdentificador() {
		return identificador;
	}

	/**
	 * @return saldo actual de la cuenta
	 */
	public double getSaldoActual() {
		return saldoActual;
	}

	/**
	 * @return saldo máximo alcanzado
	 */
	public double getSaldoMaximo() {
		return saldoMaximo;
	}

	/**
	 * @return total de ingresos realizados
	 */
	public double getIngresosTotales() {
		return ingresosTotales;
	}

	/**
	 * @return límite de descubierto
	 */
	public double getLimiteDescubierto() {
		return limiteDescubierto;
	}

	/**
	 * @return saldo inicial de la cuenta
	 */
	public double getSaldoInicial() {
		return saldoInicial;
	}
	
	/**
	 * Devuelve una representación textual de la cuenta bancaria.
	 * 
	 * <p>El saldo se formatea con dos decimales, anchura de 12 caracteres y
	 * separador decimal en coma. La información de embargo muestra "sí" seguido
	 * del porcentaje formateado con dos decimales si existe embargo, o "no" en caso contrario.</p>
	 *
	 * <p>El formato resultante es:</p>
	 * <pre>
	 * Id: identificador - Saldo: saldo - Embargada: sí/no [porcentaje]
	 * </pre>
	 *
	 * @return una cadena que representa el estado actual de la cuenta.
	 */
	@Override
	public String toString() {

		String saldoFormat = String.format("%12.2f", saldoActual).replace('.', ',');

	    String emabrgoEscrito;
	    
	    if (embargo > 0) {
	        // Formateamos la cantidad embargada con dos decimales y separador coma
	        String embargoFormateado = String.format("%.2f", embargo).replace('.', ',');
	        emabrgoEscrito = "sí " + embargoFormateado;
	    } else {
	        emabrgoEscrito = "no";
	    }

	    return String.format("Id: %s - Saldo: %s - Embargada: %s", identificador, saldoFormat, emabrgoEscrito);
	}

}
