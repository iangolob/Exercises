package files;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class DownloadFlags {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
	
			String country= sc.nextLine();
			if(country.equals("q"))
				break;
			downloadCountryFlag(country);
		}
		sc.close();
	}

	public static void downloadCountryFlag(String country) {
		Path flagDestination = Path.of("data\\flags\\" + country + ".png");
		String imageAddress= String.format("https://cdn.countryflags.com/thumbs/%s/flag-400.png", country);
		try (OutputStream os = new BufferedOutputStream(new FileOutputStream(flagDestination.toFile()));
			InputStream is = new BufferedInputStream(new URL(imageAddress).openStream())) {
				int r;
				byte[] bytes = new byte[1024];
				while((r= is.read(bytes))>0) {
					os.write(bytes,0,r);
				}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
