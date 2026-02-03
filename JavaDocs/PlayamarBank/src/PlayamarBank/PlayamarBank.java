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
	
	//Atributos inmutables de objetos
	
	private final LocalDate fecha_creacion; //En el constrcutor se le va el fallo cuando le demos valor en el 
	
	//Atributos mutables de los objetos
	
	private String identificador;
	private double embargo;
	private double saldo_actual;
	private double saldo_maximo;
	private double ingresos_totales;
	
	
}
