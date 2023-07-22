import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile{
    public static void main(String[] args) {
        try{
            File file = new File("Messages.txt");
            FileWriter myWriter = new FileWriter("Messages.txt");
            // enables reading of files.
            Scanner myReader = new Scanner(file);

            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

            //write into the file created.
            myWriter.write("My name is Emmanuel");
            myWriter.write("Java is actually interesting");
            myWriter.close();
            if(file.createNewFile()){
                System.out.println("File has been created"+ file.getName());
            }else{
                System.out.println("File exists and cannot be created again");
            }
        }catch(IOException e){
            System.out.println("An error has occurred");
            e.printStackTrace();
        }

        //get file information.
        File file = new File("Messages.txt");
        if(file.exists()){
            System.out.println("The file name is :" + file.getName());
            System.out.println("The file Absolute path :" + file.getAbsolutePath());
            System.out.println("The file is writable :" + file.canWrite());
            System.out.println("The file is readable :" + file.canRead());
            System.out.println("The file size :" + file.length());
        }else{
            System.out.println("The file does not exist :");
        }
    }
}