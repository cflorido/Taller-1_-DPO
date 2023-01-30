package uniandes.dpoo.taller0.modificacion;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion {
	
	public static void main(String[] args) throws FileNotFoundException, IOException
	
	{
		System.out.println("Hola, mundo!");
		
		CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		Map<String, Integer> Mapa = calc.paisConMasMedallistas();

		for (String i : Mapa.keySet()) { 
			
			Integer n = Mapa.get(i);
            System.out.println("El pais con mas medallistas es " + i + " con " + n); 
          
            
        } 
		
	}
}
