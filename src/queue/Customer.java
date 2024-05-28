package queue;

import java.util.Comparator;

public class Customer implements Comparable<Customer> {

    private String name;
    private String item;
    private Priority priority;

    public Customer(String name, String item, Priority priority) {
        this.name = name;
        this.item = item;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", item='" + item + '\'' +
                ", priority=" + priority +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        return priority.compareTo(o.getPriority());
    }
}

