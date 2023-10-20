package Sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;


public class FilesHandler {
	public File createFile(String location) throws IOException {
		File fileObj = new File(location);
		
		try {
			if (fileObj.createNewFile()) {
				System.out.println("New file crated!");
			}
			else {
				System.out.println("File already exists.");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return fileObj;
	}
	
	
	public void editFile(String location, String new_content) throws IOException {
		try {
			FileWriter fw = new FileWriter(location, true);
			fw.write(new_content);
			fw.close();
			
			System.out.println("File has been edited.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
