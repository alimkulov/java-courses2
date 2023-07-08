package annotation_examples;

import java.lang.annotation.*;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomiClass=Class.forName("annotation_examples.Xiaomi");
        Annotation annotation1=xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone  sm1= (SmartPhone) annotation1;
        System.out.println("Annotation info from Xiaomi class: "+sm1.OS()+", "+sm1.yearOfCreationCompany());

    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
    String OS() default "Android";
    int yearOfCreationCompany() default 2010;
}

@SmartPhone
class Xiaomi{
    String model;
    double price;
}


@SmartPhone(OS="IOS", yearOfCreationCompany = 1976)
class Iphone{
    String model;
    double price;
}