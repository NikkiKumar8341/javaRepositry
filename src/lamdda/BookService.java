package lamdda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    public List<Book> getBooksInSort(){
        List<Book> books=new BookDao().getBooks();
        //we should pass object of myComparator
//        MyComparator ab=new MyComparator();
//        Collections.sort(books,ab);

        Collections.sort(books,(o1,o2)->o1.getName().compareTo(o2.getName()));

        Collections.sort(books,(o1,o2)->o1.getPages()-o2.getPages());

//       Collections.sort(books, (o1, o2) -> o1.getPages().compareTo(o2.getPages()));
        return books;
    }

    public static void main(String[] args) {

        System.out.println(new BookService().getBooksInSort());
//        System.out.println(new BookDao().getBooks());
    }
}

//class MyComparator implements Comparator<Book>{
//
//    @Override
//    public int compare(Book o1, Book o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
//}
