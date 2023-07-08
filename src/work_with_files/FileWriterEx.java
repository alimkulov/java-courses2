package work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

    public static void main(String[] args) throws IOException {
        String text="Text 1\n"+
                "Text 2\n" +
                "text 3\n" +
                "Text 4\n";
        String s="Hello";
      FileWriter writer=null;

        try {
             //writer=new FileWriter("D:\\MyLABS\\JaBa\\Test_File1.txt");
            writer=new FileWriter("Test_File2.txt",true);
//            for(int i=0;i<text.length();i++){
//                writer.write(text.charAt(i));
//            }
          // writer.write(text);
           writer.write(s);
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
         finally {
            writer.close();
        }

    }
}
