package collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Book {
    String bname;
    double bprice;

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", bprice=" + bprice +
                ", bpages=" + bpages +
                ", nbooks=" + nbooks +
                '}';
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public double getBprice() {
        return bprice;
    }

    public void setBprice(double bprice) {
        this.bprice = bprice;
    }

    public long getBpages() {
        return bpages;
    }

    public void setBpages(long bpages) {
        this.bpages = bpages;
    }

    public int getNbooks() {
        return nbooks;
    }

    public Book(String bname, double bprice, long bpages, int nbooks) {
        this.bname = bname;
        this.bprice = bprice;
        this.bpages = bpages;
        this.nbooks = nbooks;
    }

    public void setNbooks(int nbooks) {
        this.nbooks = nbooks;
    }

    long bpages;
    int nbooks;

}
class Test{
    public static void main(String[] args) {

        Book b1=new Book("core java",250.00,300,3);
        Book b2=new Book("advancedjava",300.00,400,5);
        Book b3=new Book("oracle",550.00,200,2);
        Book b4=new Book("html",150.00,100,8);
        Book b5=new Book("aws",520.00,200,1);

        List<Book> li=new ArrayList<>();
        li.add(b1);
        li.add(b2);
        li.add(b3);
        li.add(b4);
        li.add(b5);

        System.out.println("li :"+li);

        Long nob=li.stream().collect(Collectors.counting());
        System.out.println("type of books: "+nob);

        int tb=li.stream().collect(Collectors.summingInt((p)->p.nbooks));

        System.out.println("number of books: "+tb);

//        double amount=li.stream().collect(Collectors.summarizingDouble((p->p.bprice)));

        long pages=li.stream().collect(Collectors.summingLong((p->p.bpages)));

        System.out.println("total no of pages: "+pages);
    }
}
