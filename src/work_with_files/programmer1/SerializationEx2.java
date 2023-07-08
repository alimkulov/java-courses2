package work_with_files.programmer1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Car car=new Car("Nissan Tiida","white");
//        Employee employee=new Employee("John",
//                  "Smith",
//                "IT",
//                   // 28,
//                  200.45, car);
//        try(ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("employees2.bin"))){
//             outputStream.writeObject(employee);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
