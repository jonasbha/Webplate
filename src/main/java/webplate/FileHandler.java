package webplate;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    public FileHandler() { }

    public void create(String content, int index) {

        try{
            File file = new File(Webplate.Pages.get(index).Metadata.getTitle() + ".html");
            if(file.createNewFile()){
                System.out.println("File created: " + file.getName());
            }
            else {
                System.out.println("File already exists");
            }

            FileWriter filskriver = new FileWriter(file.getName());
            filskriver.write(content);
            filskriver.close();
            System.out.println("content written into file");

        } catch (IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
