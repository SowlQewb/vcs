package lt.vcs;

import java.util.Scanner;

public class Main {

    /**
     * Musu pasisveikinimo klase
     * kaip greitai keiciasi
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ivedimas = input.next();
        System.out.println("");
        if (ivedimas.equals("pabaiga")) {
            System.out.println("galas");
        } else {
            System.out.println("negeras");
        }
    }
    public static int getLuckyNumber(int metodoParam){
        System.out.println(metodoParam);
        return 777;
    }
}
