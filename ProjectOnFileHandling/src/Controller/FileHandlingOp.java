package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingOp {

		
		public void createFile(String Filename) {
			try {
				File file=new File(Filename);
				if(file.createNewFile()) {
					System.out.println("_____________________________");
					System.out.println("File Created  Sussfully:"+file.getName());
					
				}
				else {
					System.out.println("File Is Alredy Exits");
				}
			}
			catch (IOException e) {
					System.out.println("An Error Occurred");
					e.printStackTrace();

			}
		}
		
		
		
		public void readFile(String fileName) {
			try (BufferedReader br=new BufferedReader(new FileReader(fileName))){
				String line;
				while ((line=br.readLine()) !=null) {
					System.out.println(line);
				}
				
				
			} catch (IOException e) {
				System.out.println("An error occured : ");
				e.printStackTrace();
			}
		}
		
		
		 public void writeToFile(String fileName, String content) {
		        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
		            bw.write(content);
		            System.out.println("Content written to file.");
		        } catch (IOException e) {
		            System.out.println("An error occurred.");
		            e.printStackTrace();
		        }
		    }

		    
		    public void appendToFile(String fileName, String content) {
		        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
		            bw.write(content);
		            System.out.println("Content appended to file.");
		        } catch (IOException e) {
		            System.out.println("An error occurred.");
		            e.printStackTrace();
		        }
		    }

		    
		    public void deleteFile(String fileName) {
		        File file = new File(fileName);
		        if (file.delete()) {
		            System.out.println("File deleted: " + file.getName());
		        } else {
		            System.out.println("Failed to delete the file.");
		        }
		    }
		
}
