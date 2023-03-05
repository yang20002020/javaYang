package it_007;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");

        Iterator<String> it= list.iterator();
        while(it.hasNext()){
            String s=it.next();
            if(s.equals("world")){
                list.add("javaee");
            }
        }
        System.out.println(list);
    }
}
