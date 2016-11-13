package person;

/**
 * Created by Daria Serebryakova on 01.11.2016.
 * Changed by Daria Serebryakova on 13.11.2016
 */
public class Runner {
    public static void main(String[] args) {


    //Person
        Person person1 = new Person("Maria","Minina");
        Person person2 = new Person("Maria","Minina");
        System.out.println("person1 = " + person1);
        System.out.println("person2 = " + person2);

        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode() + "\n");


    //Student
        Student student1 = new Student("Daria","Minina","master",1,2349.00);
        Student student2 = new Student("Daria","Minina","master",1,2349.00);
        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);

        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode() + "\n");


    //Staff
        Staff staff1 = new Staff("Maria","Minina","457",2345.4);
        Staff staff2 = new Staff("Maria","Minina","457",2345.4);
        System.out.println("staff1 = " + staff1);
        System.out.println("staff1 = " + staff1);



        System.out.println(staff1 == staff2);
        System.out.println(staff1.equals(staff2));
        System.out.println(staff1.hashCode());
        System.out.println(staff2.hashCode());



    }
}
