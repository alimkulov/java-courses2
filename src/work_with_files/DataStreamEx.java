package work_with_files;

import java.io.*;

public class DataStreamEx {
    public static void main(String[] args) {
        try(DataOutputStream outputStream=new DataOutputStream(new FileOutputStream("my_test.bin"));
            DataInputStream inputStream=new DataInputStream(new FileInputStream("my_test.bin"));){
            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeLong(1_000_000L);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readLong());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
