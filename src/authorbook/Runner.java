package authorbook;

/**
 * Created by Daria Serebryakova on 08.11.2016.
 */
public class Runner {
    public static void main(String[] args) {

        Author author1 = new Author("Mike B.","mikeb@gail.com",'m');
        System.out.println("author1 = " + author1);
        Author author2 = new Author("Mike B.", "mikeb@gail.com", 'm');
        System.out.println("author2 = " + author2);

        System.out.println(author1 == author2);
        System.out.println(author1.equals(author2));


        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode() + "\n");

        Author[] authors = {author1, author2};

        Book book1 =new Book("Java",authors,356.0, 0);
        Book book2 =new Book("Java",authors,356.0, 0);
        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
        System.out.println(book1 == book2);
        System.out.println(book1.equals(book2));

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode() +"\n");



        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        String s3 = s1;
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));






    }

}
