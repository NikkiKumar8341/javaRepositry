package collections;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public List<Book> getBooks(){
        List<Book> books=new ArrayList<>();
        books.add(new Book(101,"core java",500));
        books.add(new Book(102,"hiberante",600));
        books.add(new Book(103,"spring",800));
        books.add(new Book(104,"java8",1000));
        return books;
    }
}
