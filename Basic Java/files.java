import java.io.*;
public class files{
    public static void main(String[] args) throws IOException{
        File f1 = new File("./myFile.txt");
        FileInputStream fis = new FileInputStream(f1);
        System.out.println(f1.createNewFile()); //returns boolen, true if file is created, faslse if not created
        System.out.println(fis.read());//returns -1 because the file is empty
    }
}