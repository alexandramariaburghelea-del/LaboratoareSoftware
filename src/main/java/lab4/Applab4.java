package lab4;


import java.util.HashMap;
import java.util.Map;

public class Applab4 {
    static void main() {
        HashMap<String, Integer> varste = new HashMap<>();
        varste.put("Ioan", 21);
        varste.put("Maria", 22);
        varste.put("Victor", 20);
        varste.put("Simina", 20);
        varste.put("Marius", 21);
        varste.put("Mihai", 21);
        varste.put("Daniela", 23);

        Map<String, String> adrese = Map.of("Ioan", "Sibiu", "Maria", "Bucuresti", "Victor",
                "Cluj","Simina", "Alba-Iulia","Marius", "Medias", "Mihai", "Cisnadie","Daniela", "Sibiu");

        System.out.println("Initial: ");
        for( Object value: varste.values()){
            System.out.println(value);
        }

        varste.put("Vlad", 19);
        varste.put("Iulia", 19);
        System.out.println("Dupa adaugare: ");
        for( Object value: varste.values()){
            System.out.println(value);
        }
        HashMap<String, Tanar> tineri = new HashMap<>();

        for (String nume : varste.keySet()) {
            int varsta = varste.get(nume);

            String adresa;
            if (adrese.containsKey(nume)) {
                adresa = adrese.get(nume);
            } else {
                adresa = "Necunoscut";
            }

            Tanar t = new Tanar(nume, adresa, varsta);
            tineri.put(nume, t);
        }
        System.out.println("\nTineri:");

        for(Object entryObj : tineri.entrySet()) {
            Map.Entry entry = (Map.Entry) entryObj;
            Object key = entry.getKey();
            Object value = entry.getValue();

            System.out.println(key + " -> " + value);
        }
    }
}



