package co.edu.uniandes.miso4208.carreport.ejecutores;

import co.edu.uniandes.miso4208.carreport.commandrunner.CommandRunner;
import co.edu.uniandes.miso4208.carreport.util.Comandos;

public class EjecutorCalabash {
	
	public static void run (String apk){
		String comando = String.format(Comandos.CALABASH, apk);
		CommandRunner.getRunner().runCommand(comando);
	}
}
