package lab2;

import java.util.*;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        List<Integer> xPlusY = new ArrayList<>(); //a
        Set<Integer> zSet = new TreeSet<>(); //b
        List<Integer> xMinusY = new ArrayList<>();//c
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList<>(); //d
        Random rand=new Random();
       for(int i=0;i<5;i++)
       {
           x.add(rand.nextInt(11));
       }
        for(int i=0;i<7;i++)
        {
            y.add(rand.nextInt(11));
        }
        Collections.sort(x);
        Collections.sort(y);

        xPlusY.addAll(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);

        for (Integer elem : x) {
            if (y.contains(elem)) {
                zSet.add(elem);
            }
        }

        for (Integer elem : x) {
            if (!y.contains(elem)) {
                xMinusY.add(elem);
            }
        }
        Collections.sort(xMinusY);

        for(Integer elem:x){
            if(elem <= p && !xPlusYLimitedByP.contains(elem))
                xPlusYLimitedByP.add(elem);

        }
        for(Integer elem:y){
            if(elem <= p && !xPlusYLimitedByP.contains(elem))
                xPlusYLimitedByP.add(elem);

        }
        Collections.sort(xPlusYLimitedByP);
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("xPlusY="+xPlusY);
        System.out.println("zSet"+zSet);
        System.out.println("xMinusY"+xMinusY);
        System.out.println("xPlusYLimitedByP"+xPlusYLimitedByP);


    }
}
