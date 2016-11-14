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

    public static boolean isLeapYear(int year){
        boolean isLeap = false;
        int isL = (year%100)%4;

        if (isL == 0){isLeap = true;}
        return isLeap;
    }
    public static boolean isValidDate(int year, int month, int day){
        boolean isValid = true;

        if(month < 0 || month >= 12 || month/100 != 0) {
            isValid = false;
            System.out.println("date is not valid");
        }

        int maxDate = daysInMonth[month];
         if (month == 1 && isLeapYear(year) == true) {
            maxDate = 29;
        }

        if(day < 1 || day > maxDate|| month/100 != 0){
            isValid = false;
            System.out.println("date is not valid, max date in this month is " + maxDate );}

        return isValid;
    }

    public static int getDayOfWeek(int year, int month, int day){
        int dayOfWeek = -1;
        int yearIndex = (year%100)/12 + (year%100)%12 + ((year%100)%12)/4;

        int[] monthIndexes = {6,2,2,5,0,3,5,1,4,6,2,4};
        int monthIndex = monthIndexes[month];

        int centuaryIndex = 0;
        if(year/1000 == 1){ centuaryIndex = 1;}

        dayOfWeek = (yearIndex + monthIndex + day + centuaryIndex)%7 ;//0-Sunday, 1-Monday

        return dayOfWeek;
    }

    public MyDate nextDay(){
        if(isValidDate(year,month,day) == false) {
            System.out.println("date is not valid");
            return null;
        }
        int nDay = day;
        int nMonth = month;
        int nYear = year;

        if(day <  daysInMonth[month]){
            nDay = day + 1;
            System.out.println("nDay = " + nDay);
        }
        else if(day ==  daysInMonth[month] && month ==11){ //11-DEC
            nDay = 1;
            nMonth = 0;
            nYear = year + 1;
        }
        else if(day ==  daysInMonth[month] ){
            nDay = 1;
            nMonth = month + 1;
        }
        MyDate date = new MyDate(nYear, nMonth+1, nDay);
        return date;
    }

    public MyDate previousDay(){
        if(isValidDate(year,month,day) == false) {
            System.out.println("date is not valid");
            return null;
        }
        int nDay = day;
        int nMonth = month;
        int nYear = year;

        if(day > 1){
            nDay = day - 1;
            System.out.println("nDay = " + nDay);
        }
        else if(day ==  1 && month == 0){ //11-DEC 0 -Jan
            nMonth = 11;
            nDay = daysInMonth[month];

            nYear = year - 1;
        }
        else if(day ==  1 ){
            nMonth = month - 1;
            nDay = daysInMonth[month];

        }
        MyDate date = new MyDate(nYear, nMonth+1, nDay);
        return date;
    }
    public MyDate nextMonth(){
        if(isValidDate(year,month,day) == false) {
            return null;
        }
        int nDay = day;
        int nMonth = month;
        int nYear = year;

        if(month  < 11){ //11-DEC
            nMonth = month + 1;
        }
        else if(month  == 11 ){
            nMonth = 0;
            nYear = year + 1;
        }
        MyDate date = new MyDate(nYear, nMonth+1, nDay);
        return date;
    }
    public MyDate previousMonth(){
        if(isValidDate(year,month,day) == false) {
            return null;
        }
        int nDay = day;
        int nMonth = month;
        int nYear = year;

        if(month  > 0){ //11-DEC
            nMonth = month - 1;
        }
        else if(month  == 0 ){
            nMonth = 11;
            nYear = year - 1;
        }
        MyDate date = new MyDate(nYear, nMonth+1, nDay);
        return date;
    }

    public MyDate nexYear(){
        if(isValidDate(year,month,day) == false) {
            return null;
        }

        MyDate date = new MyDate(year + 1, month + 1, day);
        return date;
    }
    public MyDate previousYear(){
        if(isValidDate(year,month,day) == false) {
            return null;
        }

        MyDate date = new MyDate(year - 1, month + 1, day);
        return date;
    }



    @Override
    public String toString() {
        return "MyDate{" +
                strDays[getDayOfWeek(year, month, day)]+
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
    private  static String[] srtMonths = {"Jan","Feb","Mar", //0,1,2
                          "Apr","May","Jun",//3,4,5
                          "Jul","Aug","Sep",//6,7,8
                          "Oct","Nov","Dec"};//9,10,11
    private static String[] strDays = {"Sunday","Monday","Tueasday",
                        "Wednesday","Thursday","Friday","Saturday"};
    private static int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};



}
