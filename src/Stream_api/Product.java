package Stream_api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Product {

    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }


}
class  LambdaExpression{

    public static void main(String[] args) {

        List<Product> list=new ArrayList<Product>();

        //Adding Products
        list.add(new Product(1,"HP Laptop",25000f));
        list.add(new Product(3,"Keyboard",300855f));
        list.add(new Product(2,"Dell Mouse",15075f));

        System.out.println("Sorting on the basis of name...");

        List<Product> list1=new ArrayList<Product>();
        list1.add(new Product(1,"Samsung A5",17000f));
        list1.add(new Product(3,"Iphone 6S",65000f));
        list1.add(new Product(2,"Sony Xperia",25000f));
        list1.add(new Product(4,"Nokia Lumia",15000f));
        list1.add(new Product(5,"Redmi4 ",26000f));
        list1.add(new Product(6,"Lenevo Vibe",19000f));

        // using lambda to filter data


        // implementing lambda expression
        Collections.sort(list,(p1, p2)->{
            return p1.name.compareTo(p2.name);
        });


        for(Product p:list){
            System.out.println(p.id+" "+p.name+" "+p.price);
        }

        System.out.println("sort by price");
        Collections.sort(list, (p1,p2)->{
            return (int) p2.price- (int)p1.price;
        });

        System.out.println("id  " +"price "+" name");
        for (Product p:list){

            System.out.println(p.id+"  "+p.price +"  "+p.name);
        }

//        Collections.sort(list,(i1,i2)->{
//            return i1.price.compareTo(i2.id);
//        });

//        Collections.sort(list1,(p1,p2)->{
//            return p1.id- p2.id;
//        });

        System.out.println("id  " +"price "+" name");
        for (Product p:list){

            System.out.println(p.id+"  "+p.price +"  "+p.name);
        }


        System.out.println("sorted id value greater than 2000");
        Stream<Product> filtered_data = list1.stream().filter(p -> p.price > 20000).sorted((e1,e2)->(e1.name.compareTo(e2.name)));

        // using lambda to iterate through collection
        filtered_data.forEach(
                product -> System.out.println(product.id+": " + product.name+": "+product.price)
        );
    }

//    private static int compare(Product p1, Product p2) {
//        return p1.price.compareTo(p2.price);
//    }
}
