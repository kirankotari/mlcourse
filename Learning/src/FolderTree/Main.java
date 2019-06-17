package FolderTree;
        import java.io.*;
        import java.nio.*;
        import java.nio.file.Files;
        import java.nio.file.Path;
        import java.nio.file.Paths;
import FolderTree.MyFileVisitor;

public class Main {
    public static void main(String[] args) {
        Path fileDir = Paths.get("C://");
        MyFileVisitor visitor = new MyFileVisitor();
        try {
            Files.walkFileTree(fileDir, visitor);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
