package KEIONG;

import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class Zoo {
    private ArrayList<animal>listanimal=new ArrayList<animal>();

    public void Add(animal node)
    {
        listanimal.add(node);
    }
    public void List()
    {
        for(animal node :listanimal)
        {
            node.print();
        }
    }
    public animal get(int index)
    {
        return listanimal.get(index);
    }
    public void modifyAge(String str,int x)
    {
        for(int i=0;i<listanimal.size();i++)
        {
            animal tmp = listanimal.get(i);
            if(tmp.getName().equals(str))
            {
                tmp.setAge(x);
                listanimal.set(i,tmp);
            }
        }
    }
    public void modifyKind(String str,String x)
    {
        for(int i=0;i<listanimal.size();i++)
        {
            animal tmp = listanimal.get(i);
            if(tmp.getName().equals(str))
            {
                tmp.setKind(x);
                listanimal.set(i,tmp);
            }
        }
    }

    public int Size()
    {

        return listanimal.size();
    }
    public void Sort(){
        Collections.sort(listanimal, new Comparator<animal>() {

            @Override
            public int compare(animal o1, animal o2) {

                return o1.getAge()-o2.getAge();
            }
        });
    }


    public static void main(String arg[]) {

        Scanner cin = new Scanner(System.in);
        System.out.println("Welcome to use this database");
        System.out.println("operation 1 infers to Add");
        System.out.println("operation 2 infers to modify the age of the animal");
        System.out.println("operation 3 infers to modify the kind of the animal");
        System.out.println("operation 4 infers to demonstrate");
        System.out.println("operation 5 infers to sort in an ascending order ");
        System.out.println("operation 0 exit ");
        int oper;

        Zoo Z = new Zoo();
        Z.Add(new animal("lou xi wen yang", "author", 0));



        while (true) {
            oper = cin.nextInt();
            if (oper == 1) {
                System.out.println("tips:if you dont know which kind or how old it is input '0' instead");
                System.out.println("input the name:");

                String Name;
                String Kind;
                int Age;
                Name=cin.next();
                System.out.println("input the kind:");
                Kind=cin.next();
                if(Kind.equals("0"))
                    Kind = "unknown";
                System.out.println("input the age:");
                Age=cin.nextInt();

                Z.Add(new animal(Name,Kind,Age));
                Z.List();

            } else if (oper == 2) {
                System.out.println("input the name of who you want to modify");
                String str = cin.next();
                System.out.println("input the age:");
                int x = cin.nextInt();

                Z.modifyAge(str, x);
                Z.List();

            } else if (oper == 3) {
                System.out.println("input the name of who you want to modify");
                String str2 = cin.next();
                System.out.println("input the kind:");
                String str3 = cin.next();

                Z.modifyKind(str2,str3);
                Z.List();

            } else if (oper == 4) {
                Z.List();
            }
            else if(oper==5)
            {
                Z.Sort();
                Z.List();
            }
            else
            {
                break;
            }

        }



    }
}
