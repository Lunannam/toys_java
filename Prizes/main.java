package Prizes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;

public class main {
    
    public static void main(String[] args) {
        ArrayList<toys> data = new ArrayList<toys>();
        Queue<toys> toys = new PriorityQueue<>(new orderComparator());        
        toys toys1 = new toys(1, "doll", 3);
        data.add(toys1);
        toys.add(toys1);
        toys toys2 = new toys(2, "robot", 5);
        data.add(toys2);
        toys.add(toys2);
        toys toys3 = new toys(3, "car", 1);
        data.add(toys3);
        toys.add(toys3);
        toys toys4 = new toys(3, "car", 1);
        data.add(toys4);
        toys.add(toys4);
        toys toys5 = new toys(3, "car", 1);
        data.add(toys5);
        toys.add(toys5);
        toys toys6 = new toys(3, "car", 1);
        data.add(toys6);
        toys.add(toys6);
        toys toys7 = new toys(1, "doll", 3);
        data.add(toys7);
        toys.add(toys7);
        toys toys8 = new toys(1, "doll", 3);
        data.add(toys8);
        toys.add(toys8);
        System.out.println(data );
        // System.out.println( toys1);
        // System.out.println( toys2);
        // System.out.println( toys3);
        while (!toys.isEmpty()) {
            System.out.println(toys.poll());
        }
       
    }

    static class orderComparator implements Comparator<toys>{
    


        @Override
        public int compare(toys o1, toys o2) {
            // TODO Auto-generated method stub
            return o1.getValue() < o1.getValue() ? 1 : -1  ;
        }
    }



}  
