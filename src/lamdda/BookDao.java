package lamdda;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public List<Book> getBooks(){
        List<Book> bookList=new ArrayList<>();
        bookList.add(new Book(101,"spring boot",600));
        bookList.add(new Book(102,"hiberante",600));
        bookList.add(new Book(103,"spring",800));
        bookList.add(new Book(104,"java8",1000));

        return  bookList;
    }
}
