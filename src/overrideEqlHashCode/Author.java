package overrideEqlHashCode;
/**
 * Created by Daria Serebryakova on 12.10.2016.
 */
public class Author {

    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    };

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }

    private String name;
    private String email;
    private char gender;
}
