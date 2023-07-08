package work_with_files;

import java.io.*;

public class CopyEx {

    public static void main(String[] args) {
        try(BufferedReader reader=new BufferedReader(new FileReader("Test_File2.txt"));
            BufferedWriter writer=new BufferedWriter(new FileWriter("File3.txt"));) {
//            int character;
//            while((character=reader.read())!=-1){
//                 writer.write(character);
//            }
            String line;
            while ((line= reader.readLine())!=null){
                writer.write(line);
                writer.write('\n');
            }
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
