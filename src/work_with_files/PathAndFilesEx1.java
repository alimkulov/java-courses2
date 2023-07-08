package work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class PathAndFilesEx1 {

    public static void main(String[] args) throws IOException {
        Path filePath= Paths.get("test15.txt");
        Path dirPath=Paths.get("D:\\MyLABS\\JaBa\\java-courses2\\A");

        System.out.println("filePath.getFileName():"+filePath.getFileName());
        System.out.println("dirPath.getFileName():"+dirPath.getFileName());
        System.out.println("____________________________");

        System.out.println("filePath.getParent():"+filePath.getParent());
        System.out.println("dirPath.getParent():"+dirPath.getParent());
        System.out.println("________________________________");
        System.out.println("filePath.getRoot():"+filePath.getRoot());
        System.out.println("dirPath.getRoot():"+dirPath.getRoot());
        System.out.println("________________________________");

        System.out.println("filePath.isAbsolute():"+filePath.isAbsolute());
        System.out.println("dirPath.isAbsolute():"+dirPath.isAbsolute());
        System.out.println("________________________________");

        System.out.println("filePath.toAbsolutePath():"+filePath.toAbsolutePath());
        System.out.println("dirPath.toAbsolutePath():"+dirPath.toAbsolutePath());
        System.out.println("________________________________");

        System.out.println("filePath.toAbsolutePath().getParent():"+filePath.toAbsolutePath().getParent());
        System.out.println("filePath.toAbsolutePath().getRoot():"+filePath.toAbsolutePath().getRoot());
        System.out.println("________________________________");

        System.out.println("dirPath.resolve(filePath):"+dirPath.resolve(filePath));
        Path anotherPath=Paths.get("D:\\MyLABS\\JaBa\\java-courses2\\A\\M\\F\\test20.txt");
        System.out.println("dirPath.relativize(anotherPath):"+dirPath.relativize(anotherPath));
        System.out.println("________________________________");

        if(!Files.exists(filePath)){
            Files.createFile(filePath);
        }

        if(!Files.exists(dirPath)){
            Files.createDirectory(dirPath);
        }

        System.out.println("Files.isReadable(filePath):"+Files.isReadable(filePath));
        System.out.println("Files.isWritable(filePath):"+Files.isWritable(filePath));
        System.out.println("Files.isExecutable(filePath):"+Files.isExecutable(filePath));
        System.out.println("________________________________");


        System.out.println(Files.size(filePath));
        System.out.println("________________________________");

        System.out.println("Files.getAttribute(filePath,\"creationTime\"):"+Files.getAttribute(filePath,"creationTime"));
        System.out.println("________________________________");

        Map<String,Object> attr=Files.readAttributes(filePath,"*");
        for(Map.Entry<String,Object> entry: attr.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}
