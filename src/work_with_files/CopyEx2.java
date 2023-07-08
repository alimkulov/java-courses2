package work_with_files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx2 {

    public static void main(String[] args) {
        try(FileInputStream inputStream=new FileInputStream("D:\\Загрузки\\Picture\\2ba87db7bce64efd87ede1c94e9d4fa0.jpg");
            FileOutputStream outputStream=new FileOutputStream("FileImage.jpg");){
            int character;
            while ((character=inputStream.read())!=-1){
                outputStream.write(character);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
