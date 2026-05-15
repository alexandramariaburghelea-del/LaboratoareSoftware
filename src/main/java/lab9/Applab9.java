package lab9;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class Applab9 {
    public static void lab9(String[] args) {
        Random rnd = new Random();
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int nr = rnd.nextInt(21) + 5;
            lista.add(nr);
        }
        System.out.println("Lista initiala " + lista);

        //a)
        int suma = lista.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Suma "+suma);

        //b)
        int max=lista.stream().max((x,y)->x>y?1:-1).get();
        System.out.println("max "+max);
        int min=lista.stream().min((x,y)->x>y?1:-1).get();
        System.out.println("min"+min);

        //c)
        List<Integer> Interval=lista.stream().filter(n->n>=10 && n<=20).collect(Collectors.toList());
        System.out.println("lista [10,20] "+Interval);

        //d)
        List<Double> listaDouble=lista.stream().map(x->x.doubleValue()).collect(Collectors.toList());
        System.out.println("list in double "+listaDouble);

        //e)
        Optional<Integer> valoare=lista.stream().filter(x->x==12).findFirst();
        if(valoare.isPresent()) {
            System.out.println("valoarea 12 exista");
        }
        else{
            System.out.println("valoarea 12 nu exista");
        }

    }
}
