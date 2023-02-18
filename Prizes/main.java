package Prizes;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class main {
    
    public static void main(String[] args) {
        ArrayList<toys> data = new ArrayList<toys>();
        toys toys1 = new toys(1, "doll", 3);
        data.add(toys1);
        toys toys2 = new toys(1, "robot", 5);
        data.add(toys2);
        toys toys3 = new toys(1, "car", 1);
        data.add(toys3);
        System.out.println( toys1);
        System.out.println( toys2);
        System.out.println( toys3);
        // toys.sayMeow();
        System.out.println(data);
    }


}  
