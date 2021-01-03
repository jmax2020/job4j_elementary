package ru.job4j.loop;

public class Symmetry {

    public static boolean check(int i) {
        boolean sim = true;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        String str = sb.toString();

       int kol = str.length() / 2;
        for (int ind = 0; ind <= kol; ind++) {
            if (str.charAt(ind) != str.charAt(str.length() - ind - 1)) {
                sim = false;
                break;
            }
        }
        return sim;
    }

    public static void main(String[] args) {
        System.out.println(check(123321));
    }

}
