package Stream_api;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Movies implements Comparable<Movies>{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    private int year;
    private double rating;

    @Override
    public String toString() {
        return "Movies{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                '}';
    }

    public Movies(String name, int year, double rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    public int compareTo(Movies m)
    {
        return this.year - m.year;
    }



}

class RatingCompare implements Comparator<Movies>
{
    public int compare(Movies m1, Movies m2)
    {
        if (m1.getRating() < m2.getRating()) return -1;
        if (m1.getRating() > m2.getRating()) return 1;
        else return 0;
    }
}

class NameCompare implements Comparator<Movies>{

    public int compare(Movies m1,Movies m2 ){
        return m1.getName().compareTo(m2.getName());
    }
}

class Main1{
    public static void main(String[] args) {
        ArrayList<Movies> list = new ArrayList<>();
        list.add(new Movies("Force Awakens", 2015,8.3));
        list.add(new Movies("Star Wars", 1989,8.7));
        list.add(new Movies("Empire Strikes Back",  1977,8.8));
        list.add(new Movies("Return of the Jedi", 1990,8.8));

        // Sort by rating : (1) Create an object of ratingCompare
        //                  (2) Call Collections.sort
        //                  (3) Print Sorted list

        List<Movies> filtered_datalist=list.stream().filter(r->r.getRating()>8.5)
                .sorted((y1,y2)->(y1.getYear()- y2.getYear()))
                .sorted((n1,n2)->(n1.getName().compareTo(n2.getName())))
                .collect(Collectors.toList());

        System.out.println("specfic filter: "+filtered_datalist);
        

//        System.out.println("ghvhghg"+data);

        System.out.println("Sorted by rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        for (Movies movie: list)
            System.out.println(movie.getRating() + "  " +
                    movie.getName() + "  " +
                    movie.getYear());


        // Call overloaded sort method with RatingCompare
        // (Same three steps as above)
        System.out.println("\nSorted by name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        for (Movies movie: list)
            System.out.println(movie.getName() + "  " +
                    movie.getRating() + "  " +
                    movie.getYear());

        // Uses Comparable to sort by year
        System.out.println("\nSorted by year");
        Collections.sort(list);
        for (Movies movie: list)
            System.out.println(movie.getYear() + "  " +
                    movie.getRating() + "  " +
                    movie.getName()+"  ");


    }
}


