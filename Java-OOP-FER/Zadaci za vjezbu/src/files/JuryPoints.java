package files;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class JuryPoints {
	public static void addPoints(int year, String countryName, String[] countries) {
		String data="";
		int i=12;
		for(String s:countries) {
			data=data+String.format("%2d %s%n",i,s);
			if(i>8) {
				i=i-2;
			}else {
				i--;
			}
		}
		
		String pathName=String.format("data\\%d\\voting\\%s-jury.txt",year,countryName);
		Path fp=Path.of(String.format("data\\%d\\voting",year));
		if(!Files.exists(fp)) {
			fp.toFile().mkdirs();
		}
		try(Writer fw = new BufferedWriter(
						new OutputStreamWriter(
								new BufferedOutputStream(
										new FileOutputStream(pathName)),"UTF-8"))){
			fw.write(data);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		int year;
		String countryName;
		String[] countries = new String[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Year:");
		year=Integer.parseInt(sc.nextLine());
		
		System.out.println("Country name:");
		countryName=sc.nextLine();

		System.out.println("Countries:");
		for(int i=0;i<10;i++) {
			countries[i]=sc.nextLine();
		}
		addPoints(year,countryName,countries);
		sc.close();
	}
}
