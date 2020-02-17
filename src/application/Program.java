package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String[] lines =  new String[] {"Good morning", "Good afternoon", "good night"};
		
		String path = "C:\\Users\\ramon\\Desktop\\WS\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for (String string : lines) {
				bw.write(string);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
