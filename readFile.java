import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class readFile {
    public static void main(String[] args)
{
    try {
        File file=new File("practical/javatest/File1.txt");
        FileReader reader=new FileReader(file);
        FileWriter writer=new FileWriter(new File("practical/javatest/File2.txt"));
        int i;
        System.out.println("reading started from the file");
        while ((i=reader.read())!=-1) {
            writer.write(i);

        }
        System.out.println("DATA TRASFERED FROM FILE 1 TO FILE2 IS SUCCESFUL");
        reader.close();;
        writer.close();
    } catch (Exception e) {
        System.out.println("transforming failed :Error occured-"+e.getMessage());
    }
}    
}
