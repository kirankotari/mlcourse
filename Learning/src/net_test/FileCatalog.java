package net_test;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.Files;
import static java.nio.file.FileVisitResult.CONTINUE;
import static java.nio.file.Files.*;

public class FileCatalog extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path path, BasicFileAttributes fileAttributes) {
        System.out.println("file name:" + path.getFileName());
        return FileVisitResult.CONTINUE;
    }
    public FileVisitResult preVisitDirectory(Path path) {
        System.out.println("Directory name:" + path);
        return FileVisitResult.CONTINUE;
    }
    public static void checkWritableDirectory(Path path) throws FileSystemException
    {
        if ( !exists(path) )
        {
            throw new NoSuchFileException(path.toString());
        }
        if ( isRegularFile(path))
        {
            throw new FileSystemException(path.toString() + ": Not a directory" );
        }
        if ( !isWritable(path) )
        {
            throw new AccessDeniedException(path.toString());
        }
    }
    public static void main(String[] args) {
        Path file = Paths.get("java");
        FileCatalog filess = new FileCatalog();
        try {
            filess.checkWritableDirectory(file);
        } catch(FileSystemException e) {
            e.printStackTrace();
        }
//        try {
//            Files.walkFileTree(file, new FileCatalog().checkWritableDirectory("C:/"));
//        } catch(IOException e) {
//            e.printStackTrace();
//        }

    }

}
