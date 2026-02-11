package Clases_hijas;

import java.time.LocalDate;
import clase_padre.Productos;

/*
 * el código del organismo de supervisión alimentaria.

temperatura mínima de conservación.

fecha consumo preferente.
 */

public class Refrigerado extends Productos{
	
	//Atributos inmutables del objeto
	public final int tempMinCons;
	public final LocalDate consumoPreferente;
	
	//Atributos mutables del objeto
	public String codOrganismoSprVsnAlimentaria;
	
	public Refrigerado (String nombre, LocalDate fecha_caducidad, int tempMinCons, LocalDate consumoPreferente, String codOrganismoSprVsnAlimentaria)
		throws IllegalArgumentException{
		
		super (nombre, fecha_caducidad);
		
		if(tempMinCons < -40) {
			throw new IllegalArgumentException("La temperatura es demasiado baja para ser conservada");
		}
		
		if(tempMinCons > 60) {
			throw new IllegalArgumentException("La temperatura es demasiado alta para ser conservada en un refrigerador");
		}
		
		this.tempMinCons = tempMinCons;
		this.consumoPreferente = consumoPreferente;
		this.codOrganismoSprVsnAlimentaria = codOrganismoSprVsnAlimentaria;
	}
	
}
