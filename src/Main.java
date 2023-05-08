import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Erzhigit",19,1000,"Bag yes");
        System.out.println(student.getName()+ "  "+student.getAge());
        student.getMethod();

        Teacher teacher = new Teacher("Ulan",26,"Kol","IPhone");
        System.out.println(teacher.getName()+" "+teacher.getAge());
        teacher.getMethod();

    }
}