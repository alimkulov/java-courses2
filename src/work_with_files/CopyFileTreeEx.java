package work_with_files;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTreeEx {
    public static void main(String[] args) throws IOException {
       Path source= Paths.get("D:\\MyLABS\\JaBa\\java-courses2\\X");
       Path dest=Paths.get("D:\\MyLABS\\JaBa\\java-courses2\\CopyHere");
       Files.walkFileTree(source, new MyFileVisitor2(source, dest));
        System.out.println("Done!");
    }
}


class MyFileVisitor2 extends SimpleFileVisitor<Path> {
    Path source;
    Path dest;

    public MyFileVisitor2(Path source, Path dest) {
        this.source = source;
        this.dest = dest;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path newDest=dest.resolve(source.relativize(dir));
        Files.copy(dir,newDest, StandardCopyOption.REPLACE_EXISTING);

        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newDest=dest.resolve(source.relativize(file));
        Files.copy(file,newDest, StandardCopyOption.REPLACE_EXISTING);

        return FileVisitResult.CONTINUE;
    }
}