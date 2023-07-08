package work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath= Paths.get("test15.txt");
        Path dirPath=Paths.get("D:\\MyLABS\\JaBa\\java-courses2\\A");
        Path dirBPath=Paths.get("D:\\MyLABS\\JaBa\\java-courses2\\B");

       // Files.copy(filePath, dirPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);

      //  Files.copy(filePath, dirPath.resolve("test16.txt"));
       // Files.copy(dirBPath, dirPath.resolve("B"));

      //  Files.move(filePath, dirPath.resolve("test15.txt"));

       // Files.move(Paths.get("test10.txt"),Paths.get("test11.txt"));
       // Files.delete(Paths.get("A\\test15.txt"));
        Files.delete(dirPath);
    }
}
