package co.edu.uniandes.miso4208.carreport.util;

public class Comandos {

	public static final String CALABASH = "calabash-android run \"%s\"";
	
	public static final String INSTALL = "adb install \"%s\"";
	
	public static final String MONKEY = "adb shell monkey -p %s -v 1000 ";
}
