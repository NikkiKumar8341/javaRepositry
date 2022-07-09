package collections;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    public List<Book> getBooksinsort(){
        List<Book> books=new BookDao().getBooks();
        Collections.sort(books,new MyComparator());

        return books;
    }
}

class MyComparator implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
