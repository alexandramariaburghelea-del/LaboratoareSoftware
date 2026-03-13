public class Main {
    public static void main(String[] args) {
        String alfabet = "";
        for (char i = 'a'; i <= 'z'; i++)
            alfabet += i;
        System.out.println(alfabet.toLowerCase());
        System.out.println(alfabet.toUpperCase());
        String vocale = "aeiou";
        String[] r = new String[5];
        int index = 0;
        for (int i = 0; i < alfabet.length(); i++) {
            char curent = alfabet.charAt(i);
            if (vocale.indexOf(curent) != -1) {
                String temp = "" + curent;
                int j = i + 1;
                while (j < alfabet.length() && vocale.indexOf(alfabet.charAt(j)) == -1) {
                    temp += alfabet.charAt(j);
                    j++;
                }
                r[index++] = temp;
            }
        }
        for (int i = 0; i < r.length; i++) {
            System.out.println("array[" + i + "]=" + r[i]);
        }
    }
}












