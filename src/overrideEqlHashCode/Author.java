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

    @Override
    public boolean equals(Object obj) {
        if(obj==this){return  true;}
        if(!(obj instanceof  Author)){return false;} // obj == null, instance of return false
        Author author = (Author)obj;
        return (this.name == author.name) && (this.email == author.email) &&(this.gender == author.gender);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + name.hashCode();
        result = result * 31 + email.hashCode();
        result = result * 31 + (int)gender;
        return  result;
    }

    private String name;
    private String email;
    private char gender;
}
