package mydate;

/**
 * Created by Daria Serebryakova on 13.11.2016.
 */
public class Runner {
    public static void main(String[] args) {

        MyDate date1 = new MyDate(2016, 12, 13);
        System.out.println("date1 = " + date1);
        MyDate date2 = new MyDate(2016, 11, 13);
        System.out.println("date2 = " + date2);

        System.out.println(date1 == date2);
        System.out.println(date1.equals(date2));

        System.out.println(date1.hashCode());
        System.out.println(date2.hashCode());


    }
}
