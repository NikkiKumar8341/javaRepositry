package Stream_api;

import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie>{

    private double rating;
    private String name;
    private int year;

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

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

    public Movie(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    public int compareTo(Movie m)
    {
        return this.year - m.year;
    }
}

class Main{
    public static void main(String[] args) {

        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie(8.3, "Force Awakens", 2015));
        list.add(new Movie(8.7, "Star Wars", 1977));
        list.add(new Movie(8.8, "Empire Strikes Back", 1980));
        list.add(new Movie(8.4, "Return of the Jedi", 1983));

        System.out.println("----------movie list before sorting-----");

        for (Movie movie:list){
            System.out.println(movie.getName()+"   "+movie.getRating()+"   "+movie.getYear());
        }

        Collections.sort(list);

        System.out.println("--------Movies after sorting------ : ");
        for (Movie movie: list)
        {
            System.out.println(movie.getRating() + "  " +
                    movie.getName() + "  " +
                    movie.getYear());
        }
    }
}
