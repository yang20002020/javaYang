package it_007;

import java.util.ArrayList;
import java.util.List;

public class test2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");
        for(int i=0;i<list.size();i++){
               String s=list.get(i);
               if(s.equals("world")){
                   list.add("javaee");
               }

        }
        System.out.println(list);
    }
}
