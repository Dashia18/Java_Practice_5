package person;

/**
 * Created by Daria Serebryakova on 01.11.2016.
 */
public class Person {

    public Person() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==this){return true;}
        if (!(obj instanceof Person)){return false;}
        Person person = (Person) obj;

        return (this.name == person.name)&&(this.address == person.address);
    }

    @Override
    public int hashCode() {
        int hashcodeResult = 17;
        hashcodeResult = hashcodeResult * 31 + name.hashCode();
        hashcodeResult = hashcodeResult * 31 + address.hashCode();
        return  hashcodeResult;
    }

    //data
    private String name;
    private String address;

}
