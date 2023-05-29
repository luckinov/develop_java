package week10;
import week9.*;
import java.util.ArrayList;


public class testArryList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("L");
        list.add("D");
        list.add("p");
        list.add("m");
        list.add("s");
        list.add("T");

        System.out.println("list size : " + list.size());
        System.out.println("m inside list? " + list.contains("m"));
        System.out.println("D's index: " + list.indexOf("D"));
        System.out.println("is list is empty? " + list.isEmpty());
       
        
        for (int i = 0; i <= list.size() - 1; i++) {
            System.out.println(list.get(i));
        }
        ArrayList<Circle> cList = new ArrayList<>();
        cList.add(new Circle(5));
        cList.add(new Circle(4));
        System.out.println(cList);
        System.out.println(list);

    }

}