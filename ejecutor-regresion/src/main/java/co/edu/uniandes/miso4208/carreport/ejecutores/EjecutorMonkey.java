package co.edu.uniandes.miso4208.carreport.ejecutores;

import co.edu.uniandes.miso4208.carreport.commandrunner.CommandRunner;
import co.edu.uniandes.miso4208.carreport.util.Comandos;
import co.edu.uniandes.miso4208.carreport.util.Constantes;

public class EjecutorMonkey {
	public static void run(String apk){
		String comandoInstall = String.format(Comandos.INSTALL, apk);
		String comandoMonkey = String.format(Comandos.MONKEY, Constantes.PAQUETE_APK);
		CommandRunner.getRunner().runCommand(comandoInstall);
		CommandRunner.getRunner().runCommand(comandoMonkey);
	}
}
