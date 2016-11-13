package mydate;


/**
 * Created by Daria Serebryakova on 13.11.2016.
 */
public class MyDate {
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month-1;
        this.day = day;
    }
    public void setDate(int year, int month, int day){
        this.year = year;
        this.month = month -1;
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getDayOfWeek(int year, int month, int day){



        return 0;
    }



    @Override
    public String toString() {
        return "MyDate{" +
                //strDays[getDayOfWeek(year, month, day)]+
                " " + day +
                " " + srtMonths[month] +
                " " + year +


                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {return true;}
        if (!(obj instanceof MyDate)) {return false;}
        MyDate date = (MyDate) obj;
        return (this.year == date.year) && (this.month == date.month)&&(this.day == date.day);

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + year;
        result = 31 * result + month;
        result = 31 * result + day;

        return result;
    }

    //
    private int year;
    private int month;
    private int day;
    String[] srtMonths = {"Jan","Feb","Mar",
                          "Apr","May","Jun",
                          "Jul","Aug","Sep",
                          "Oct","Nov","Dec"};
    String[] strDays = {"Sunday","Monday","Tueasday",
                        "Wednesday","Thursday","Friday","Saturday"};
    int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};



}
