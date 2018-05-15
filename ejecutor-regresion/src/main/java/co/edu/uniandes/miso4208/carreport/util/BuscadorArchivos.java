package co.edu.uniandes.miso4208.carreport.util;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuscadorArchivos {

	public static List<File> encontrarArchivosSubfolders(File path, String nombre){
		List<File> archivosFolder = new ArrayList();
		for(File file: path.listFiles()){
			if(file.isDirectory()){
				archivosFolder.addAll(encontrarArchivosSubfolders(file, nombre));
			}
		}
		if(path.isDirectory()){
			archivosFolder.addAll(Arrays.asList(encontrarArchivosNombre(path, nombre)));
	    }
		
		return archivosFolder;
	}


	public static File[] encontrarArchivosNombre(
			final File  raiz, final String nombre){
		return raiz.listFiles( new FilenameFilter() {
			public boolean accept (File dir, String name) {
				return name.equals(nombre);
			}
		});
	}
}
