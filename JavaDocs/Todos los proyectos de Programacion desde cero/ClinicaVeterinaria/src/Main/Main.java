package Main;

import java.util.ArrayList;

import ClasesConcretas.AnimalDomestico;
import ClasesConcretas.AnimalExotico;
import ClasesConcretas.Consulta;
import ClasesConcretas.Tratamiento;

public class Main {

	public static void main(String[] args) {

		ArrayList<Tratamiento> tratamientos = new ArrayList <> ();
		
		AnimalDomestico animalD1 = new AnimalDomestico("Mia", "Perro", 3, "Izan");
		AnimalDomestico animalD2 = new AnimalDomestico("Lola", "Gato", 5, "Raquel");
		AnimalExotico animalE2 = new AnimalExotico("Chanel", "Gato", 7, "Raquel");
		
		Tratamiento tratamiento1 = new Tratamiento ("Ibuprofeno", 10, 15.99);
				
		//Consulta consulta1 = new Consulta("2026", animalD1, tratamientos);
	}

}
