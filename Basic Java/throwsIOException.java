import java.io.*;
public class throwsIOException {
    public static void main(String[] args) throws IOException {
        File f = new File("logFile.txt");
        f.createNewFile();
        System.out.println("File created successfully");
    }
}