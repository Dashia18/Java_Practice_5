package person;

/**
 * Created by Daria Serebryakova on 01.11.2016.
 */
public class Student extends Person{

    public Student(){

    }

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString()+
                " program='" + program + '\'' +
                ", year=" + year +
                ", fee=" + fee +
                "} " ;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj==this){return true;}
        if (!(obj instanceof Student)) {return false;}
        Student student = (Student) obj;
        return (this.getName() == student.getName())
                && (this.getAddress() == student.getAddress())
                &&(this.program == student.program)
                &&(this.year == student.year)
                &&(this.fee == student.fee);
    }

    @Override
    public int hashCode() {
        int hashResult = super.hashCode();
        hashResult = hashResult * 31 + program.hashCode();
        hashResult = hashResult * 31 + year;
        hashResult = hashResult * 31 + (int)fee;
        return  hashResult;
    }
    //data
    private String program;
    private int year;
    private double fee;
}
