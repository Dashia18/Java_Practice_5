package mydate;

/**
 * Created by Daria Serebryakova on 13.11.2016.
 */
public class Runner {
    public static void main(String[] args) {

        MyDate date1 = new MyDate(2016, 11, 14);
        System.out.println("date1 = " + date1);

        MyDate date2 = new MyDate(2016, 11, 14);
        System.out.println("date2 = " + date2);

        System.out.println(date1 == date2);
        System.out.println(date1.equals(date2));

        System.out.println(date1.hashCode());
        System.out.println(date2.hashCode() +"\n\n");



        boolean isValid = MyDate.isValidDate(2016, 2, 29);

        MyDate date3 = new MyDate(2016, 11, 1);
        System.out.println("date3 = " + date3);
        System.out.println("nextDay = " + date3.nextDay());
        System.out.println("previousDay = " + date3.previousDay());
        System.out.println("nextMonth = " + date3.nextMonth());
        System.out.println("previousMonth = " + date3.previousMonth());
        System.out.println("nextYear = " + date3.nexYear());
        System.out.println("previousYear = " + date3.previousYear());

        System.out.println();


    }
}
