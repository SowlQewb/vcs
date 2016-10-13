package lt.vcs;

import java.util.Scanner;

public class CCiklai {

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        System.out.println("Sveiki atvyke i VCS!!!");
        System.out.println("Iveskite skaiciu: ");
        int a = input.nextInt();

        int[] masyvas = {1, 2, 3, 4, 5, 7};

        for (int elementas : masyvas) {
            if (elementas == 2){
                System.out.println("buvo du");
            }
            System.out.println("prasisuko ciklas");
        }

        /*
         *   for ([type] [identifier] = [initial value]; [termination boolean]; [incrementation]){
         *       [body]
         *   }
         */
        for (int i = 0; i < a; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        /*
        *
        * while ([boolean]){
        *   [body]
        * }
        *
        * */
        do {
            System.out.print(a-- + " ");
        } while (a > 0);

    }
}
