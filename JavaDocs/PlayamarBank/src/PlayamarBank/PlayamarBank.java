/*
 * 	El  identificador de la cuenta tendrá el formato: AAAA-NNNN, donde AAAA es el año de la creación de la cuenta y 
 * 	NNNN es un número consecutivo a partir de 0 que cada año se resetea.

	Embargo: será una cantidad que quedará bloqueada y, por lo tanto, no se podrá disponer de ella.

	Extraer: tendrá en cuenta el embargo.

	Una cuenta embargada no podrá tener saldo negativo.
 */

package PlayamarBank;

import java.time.LocalDate;

public class PlayamarBank {

	//Atributos inmutables de la clase
	public static final double DEFAULT_MAX_DESCUBIERTO = 0.0;
	public static final double DEFAULT_SALDO = 0.0;
	public static final double MAX_DESCUBIERTO = -2000.0;
	public static final double MAX_SALDO = 5.0E7;
	public static final double MIN_EMBARGO = 0;
	public static final int MIN_YEAR = 1900;

	
	//Atributos mutables de la clase
	
	public static double saldo_global;
	public static int cuentas_embargadas;
	public static LocalDate cuenta_mas_moderna;
	public static LocalDate default_fecha_actual = LocalDate.now();
	private static int contador = 0;
	private static int anioUltimoContador = LocalDate.now().getYear();

	
	//Atributos inmutables de objetos
	
	private final LocalDate fechaCreacion; //En el constrcutor se le va el fallo cuando le demos valor en el 
	
	//Atributos mutables de los objetos
	
	private String identificador;
	private double embargo;
	private double saldoActual;
	private double saldoMaximo;
	private double ingresosTotales;
	private double limiteDescubierto;
	private double saldoInicial;
	
	
	public PlayamarBank (double saldoInicial, LocalDate fechaCreacion, double limiteDescubierto) throws IllegalArgumentException { 
		//Constructor principal que se encarga de validar los valores de los parametros que entran al constructor. Tiene 3 parametros
																														
		if(saldoInicial < 0) {
			throw new IllegalArgumentException("El saldo inicial no puede ser menor que cero");
		}
		
		if(fechaCreacion.getYear() < MIN_YEAR) {
			throw new IllegalArgumentException("La fecha de creación de la cuenta no puede ser anterior a 1900");
		}
		
		if(limiteDescubierto < MAX_DESCUBIERTO) {
			throw new IllegalArgumentException("El limite descubierto máximo es de -2000€");
		}
		
		this.saldoInicial = saldoInicial;
		this.fechaCreacion = fechaCreacion;
		this.limiteDescubierto = limiteDescubierto;
		this.identificador = generarIdentificador();
	}
	
	public PlayamarBank (double saldoInicial, LocalDate fechaCreacion) {	//Constructor con dos parametros que usa el principal para validar y asigna al valor 
																			//del limite descubierto un valor por defecto
		this(saldoInicial, fechaCreacion, DEFAULT_MAX_DESCUBIERTO);
		
	}
	
	public PlayamarBank (double saldoInicial) {								//Constructor con un parametro que usa el principal para validar y asigna al valor 
																			//del limite descubierto y de la fecha de creacion valores por defecto
		this(saldoInicial, default_fecha_actual, DEFAULT_MAX_DESCUBIERTO);
	}
	
	public PlayamarBank () {												//Constructor sin parametros que usa el principal para validar y asignar valores por defecto 
																			//al saldo inicial, la fecha de crecion y el limite descubierto
		this(DEFAULT_SALDO, default_fecha_actual, DEFAULT_MAX_DESCUBIERTO);
	}
	
	
	private String generarIdentificador () {		//Metodo que genera el identificador mediante el año actual y un contador externo que se reinicia cada vez
													//que se cambia de cuenta
		int fechaCuenta = fechaCreacion.getYear();
		
		if (fechaCuenta != anioUltimoContador) {
			contador = 0;
			anioUltimoContador = fechaCuenta;
		}
		
		String id = String.format("%04d- %04d", fechaCuenta, contador);
		contador++;
		
		return id;
	}
	
	//Metodos (acciones)
	
	public void embargar (double cantidad_a_embargar) throws IllegalArgumentException, IllegalStateException{		//Se embarga una cantidad de una cuenta
		
		if (cantidad_a_embargar < 0) {
			throw new IllegalArgumentException("La cantidad a embargar no puede ser menor de 0 euros");
			
		}else if (cantidad_a_embargar > saldoActual) {
			throw new IllegalArgumentException("La cantidad a embargar no puede ser mayor a tu saldo actual. Actualmente tienes "
					+ saldoActual + "€ y has intentado embargar " + cantidad_a_embargar + "€");
		}
		
		if (saldoActual - cantidad_a_embargar < limiteDescubierto) {
	        throw new IllegalStateException("No se puede embargar esa cantidad porque dejaría la cuenta en descubierto");
	    }
		
		this.embargo = cantidad_a_embargar;
	}
	
	public boolean desembargar (double cantidad_a_desembargar){			//Se desembarga al completo una cuenta
		
		boolean decision = false;
		
		if (embargo != 0) {
			decision = true;
			embargo = 0;
			
		}else {
			decision = false;
		}
		
		return decision;
	}
	
	public void ingresar (double cantidad) throws IllegalArgumentException, IllegalStateException {		//Se ingresan dinero en una cuenta
		
		if(cantidad < 0) {
			throw new IllegalArgumentException("No se puede ingresar una cantidad de dinero negativa");
		}
		
		if (cantidad > MAX_SALDO) {
			throw new IllegalStateException("No se puede ingresar una cantidad de dinero superior a la máxima permitida en una cuenta");
		}
		
		if (cantidad + saldoActual > MAX_SALDO) {
			throw new IllegalStateException("No se puede ingresar una cantidad de dinero que junto al dinero presente en la cuenta " +
					"supere al dinero máximo permitido en una cuenta");
		}
		
		this.saldoActual = saldoActual + cantidad;
	}
	
	
	
	//Getters
	
	public static double getSaldo_global() {
		return saldo_global;
	}

	public static int getCuentas_embargadas() {
		return cuentas_embargadas;
	}

	public static LocalDate getCuenta_mas_moderna() {
		return cuenta_mas_moderna;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public String getIdentificador() {
		return identificador;
	}

	public double getSaldoActual() {
		return saldoActual;
	}

	public double getSaldoMaximo() {
		return saldoMaximo;
	}

	public double getIngresosTotales() {
		return ingresosTotales;
	}

	public double getLimiteDescubierto() {
		return limiteDescubierto;
	}

	public double getSaldoInicial() {
		return saldoInicial;
	}
	
	
}
