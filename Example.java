import java.util.Scanner;

public class Example {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in); // scanner object

        String n;
        int a;
        String g;

        n = sc.nextLine();
        g = sc.nextLine();
        a = sc.nextInt();

        sc.close();

        Student s1 = new Student(n, a, g);
        s1.printing();
        // System.out.println("Name:" + n);
        // System.out.println("Age:" + a);
        // System.out.println("Grade:" + g);

        // Person student3 = new Person("Mike", 30);

        // Student student4 = new Student("Jeff", 28, "A");
        // Student student5 = new Student("Adam", 33, "B");
        // // Person student1 = new Person();

        // // student1.setName("Mike");
        // // student1.setAge(30);

        // // Person student2 = new Person();

        // // student2.setName("Ivan");
        // // student2.setAge(31);

        // // System.out.println(student1.getName() + student1.getAge());
        // student4.printing();
        // student5.printing();
        // // System.out.println(student2.getName() + student2.getAge());
        // System.out.println(student3.getName() + " " + student3.getAge());
        // // System.out.println(student4.getName() + student4.getAge() +
        // // student4.getGrade());

        // Animal a1 = new Animal("Lion");
        // a1.attack(student4.getName());

    }
}
