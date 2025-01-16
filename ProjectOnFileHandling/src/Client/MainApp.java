package Client;

import java.util.Scanner;

import Controller.FileHandlingOp;

public class MainApp {

	 public static void main(String[] args) {
	        FileHandlingOp fileHandlingApp = new FileHandlingOp();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nFile Handling Menu:");
	            System.out.println("____________________________");
	            System.out.println("1. Create a File :");
	            System.out.println("2. Read from File :");
	            System.out.println("3. Write into File :");
	            System.out.println("4. Append into File :");
	            System.out.println("5. Delete File :");
	            System.out.println("6. Exit :");
	            System.out.println("____________________________");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter file name: ");
	                    String createFileName = scanner.nextLine();
	                    fileHandlingApp.createFile(createFileName);
	                 
	                    break;
	                case 2:
	                    System.out.print("Enter file name: ");
	                    String readFileName = scanner.nextLine();
	                    fileHandlingApp.readFile(readFileName);
	                    break;
	                    
	                case 3:
	                    System.out.print("Enter file name: ");
	                    String writeFileName = scanner.nextLine();
	                    System.out.print("Enter content to write: ");
	                    String writeContent = scanner.nextLine();
	                    fileHandlingApp.writeToFile(writeFileName, writeContent);

	                    break;
	                case 4:
	                    System.out.print("Enter file name: ");
	                    String appendFileName = scanner.nextLine();
	                    System.out.print("Enter content to append: ");
	                    String appendContent = scanner.nextLine();
	                    fileHandlingApp.appendToFile(appendFileName, appendContent);
	                     break;
	                     
	                case 5:
	                    System.out.print("Enter file name: ");
	                    String deleteFileName = scanner.nextLine();
	                    fileHandlingApp.deleteFile(deleteFileName);
	                    break;
	                    
	                case 6:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
}
