package fie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileExistOrNot {

	public static void main(String[] args) throws Exception {
		String path = "./src/fruit.txt";
		doesFileExist(path);
		
		try {
			File f = new File(path);
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line;
			while ((line = br.readLine()) != null) {
				String[] words = line.split("-|\\,");
				for (int i = 0; i < words.length; i++) {
					System.out.println(words[i]);
				}
			}
			br.close();
		} catch (FileNotFoundException ex) {
			System.out.println("File does not exists");
		}
	}
	
	private static void doesFileExist(String path) {
		File f = new File(path);
		if (f.exists()) {
			System.out.println("File exists");
		} else {
			System.out.println("File does not exists");
		}
		
	}
}
