package co.edu.uniandes.miso4208.carreport;

import java.io.File;
import java.io.IOException;
import java.util.List;

import co.edu.uniandes.miso4208.carreport.ejecutores.EjecutorCalabash;
import co.edu.uniandes.miso4208.carreport.ejecutores.EjecutorMonkey;
import co.edu.uniandes.miso4208.carreport.ejecutores.EjecutorVisualRegresion;
import co.edu.uniandes.miso4208.carreport.util.BuscadorArchivos;
import co.edu.uniandes.miso4208.carreport.util.Constantes;

/**
 * Hello world!
 *
 */
public class App {
	
	private static final Integer NUM_PRUEBAS = 10;
	
	public static void main( String[] args ) throws IOException{
		File raiz = new File("D:\\uniandes\\pruebas automaticas\\parcial final\\aplicaciones");
		List<File> apks = BuscadorArchivos.encontrarArchivosSubfolders(raiz, Constantes.NOMBRE_APK);
		
		if (apks == null || 
				apks.size()==0){
			throw new RuntimeException("No se encontraron apks");
		}
		
		File apk;
		for (int i = 0; i < NUM_PRUEBAS; i++) {
			apk = apks.get(i);
			EjecutorCalabash.run(apk.getAbsolutePath());
			EjecutorMonkey.run(apk.getAbsolutePath());
			EjecutorVisualRegresion.run(apk.getAbsolutePath());
		}
	}
}
