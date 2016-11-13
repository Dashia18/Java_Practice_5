package authorbook;
import java.util.Arrays;

/**
 * Created by Daria Serebryakova on 12.10.2016.
 */
public class Book {
    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int gty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.gty = gty;

    }

    public String getName() {
        return name;
    }
    public Author[] getAuthors(){
        for(int i = 0; i <authors.length; i ++){
            System.out.println(authors[i] + "\n");
        }
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return gty;
    }

    public void setQty(int qty) {
        this.gty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", gty=" + gty +
                '}';
    }
    public String getAuthorNames(){
        String strForoutput = "\"";
        for(int i = 0; i <authors.length; i ++){
            strForoutput = strForoutput + authors[i].getName();
            if(i<authors.length-1){
                strForoutput = strForoutput + ", ";
            }
        }
        strForoutput = strForoutput + "\"";
        return  strForoutput;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){return  true;}
        if((obj instanceof Book)==false){return false;}
        Book book = (Book) obj;
        return (this.name == book.name) && (this.authors ==book.authors)
                &&(this.price == book.price) && (this.gty == book.gty);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + name.hashCode();
        result = result * 31 + authors.hashCode();
        result = result * 31 + (int)price;
        result = result * 31 + gty;
        return result;
    }

    private String name;
    private Author[] authors;
    private double price;
    private int gty = 0;
}
