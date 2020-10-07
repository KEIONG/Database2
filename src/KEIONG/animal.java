package KEIONG;

import java.util.*;
import java.io.*;
import java.util.ArrayList;
public class animal {
    private String Name;
    private int Age;
    private String Kind;

    public animal(String name,String kind,int age)
    {
        //super();
        this.Age = age;
        this.Kind = kind;
        this.Name = name;

    }

    public void setAge(int age) {
        this.Age = age;
    }

    public void setKind(String kind) {
        this.Kind = kind;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return Age;
    }

    public String getKind() {
        return Kind;
    }

    public String getName() {
        return Name;
    }
    public int compareTo(animal o) {
        if(this.Age < o.Age){
            return -1;
        }else if(this.Age == o.Age){
            return 0;
        }else{
            return 1;
        }
    }

    public void print() {
        if(this.Age>0)
            System.out.println(Name+"："+Kind+" "+Age);
        else
            System.out.println(Name+"："+Kind+" "+"unknown");


    }
}
