package Threads;

import java.util.HashSet;
import java.util.Set;

public class Developer {

    private  String name;
    private Set<String> language;

    public Developer(String name){
        this.language=new HashSet<>();
        this.name=name;
    }

    public void add(String language){
        this.language.add(language);
    }

    public Set<String> getLanguage(){
        return language;
    }
}
