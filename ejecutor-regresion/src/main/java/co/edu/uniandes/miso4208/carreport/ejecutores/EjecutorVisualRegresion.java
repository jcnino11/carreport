package co.edu.uniandes.miso4208.carreport.ejecutores;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import co.edu.uniandes.miso4208.carreport.util.ImageUtil;

public class EjecutorVisualRegresion {
	public static void run(String apk) throws IOException{
		ImageIO.write(
				ImageUtil.getDifferenceImage(
						ImageIO.read(new File("a.png")),
						ImageIO.read(new File("b.png"))),
				"png",
				new File("output.png"));
	}
}
