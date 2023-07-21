import java.io.File;
import java.io.IOException;

public class CreateFile{
    public static void main(String[] args) {
        try{
            File file = new File("Messages.txt");
            if(file.createNewFile()){
                System.out.println("File has been created"+ file.getName());
            }else{
                System.out.println("File exists but cannot be created");
            }
        }catch(IOException e){
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
    }
}