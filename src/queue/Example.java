package queue;

import java.util.PriorityQueue;

public class Example {

    public static void main(String[] args) {

        PriorityQueue<Customer> data=new PriorityQueue<>();
        data.add(new Customer("nikhil","mobile",Priority.valueOf("high")));
        data.add(new Customer("akhil","mobile",Priority.valueOf("high")));
        data.add(new Customer("ram","shirt",Priority.valueOf("low")));
        data.add(new Customer("charan","shoes",Priority.valueOf("medium")));
        data.add(new Customer("pavan","mobile",Priority.valueOf("medium")));
        data.add(new Customer("kalyan","charger",Priority.valueOf("low")));
        data.add(new Customer("og","pc",Priority.valueOf("high")));



        while (!data.isEmpty()) {
            Customer task = data.poll();
            System.out.println("Task: " + task.getName() +  " , item: "+task.getItem() + ", Priority: " + task.getPriority());
        }

       System.out.println("high: "+data.stream().spliterator());


    }
}
