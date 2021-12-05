import java.util.*;

  class Book{
      int id;
      String name, author;
      public Book(int id, String name, String author){
            this.id = id;
            this.name = name;
            this.author = author;
      }
  }

public class ArrayListBooks{
    public static void main(String[] args) {
        
        //creating list of books

        List<Book> list = new ArrayList<Book> ();

        //creating books

        Book b1 = new Book(101, "Let us C", "Yashwant");
        Book b2 = new Book(102, "Rich dad poor dad", "Robert kiosaki");
        Book b3 = new Book(103, "Operating System", "Galwin");

        //adding books in the list

        list.add(b1);
        list.add(b2);
        list.add(b3);

        for(Book b:list){
            System.out.println(b.id + " " + b.name + " " + b.author );
        }

    }
}