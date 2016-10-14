package lt.vcs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //------------------------------------------
        Scanner scan = new Scanner(System.in);
        System.out.println("iveskite zodi: ");
        String zodis = scan.next(); //laukia userio ivedimo i programa
        int kiekis = 0;
        for (char raide: zodis.toCharArray()) { //kiekvienas char bus identifikuotas
        if (raide == 'a'){
            kiekis++;
        }
        }
        String str2 = zodis.replaceAll("a", "z"); //pakeitimo funkcija; visas a pakeis z

        System.out.println("zodis " + zodis);
        System.out.println("pakeitem raides a i tarpa: \"" + str2 + "\"");
        System.out.println("a raidziu skaicius: " + kiekis);
        System.out.println("zodzio raidziu skaicius: " + zodis.length());
//        System.out.println("trim() metodo rezultatas: '".concat(str2.trim()).concat("'")); //concat= +
//        String str3 = str2.replaceAll(" ", "");
//        System.out.println("ivestas zodis turi numeri simbolio be tarpo: " + str3.trim().length());

        //-------------------------------------------
    } //Main end

}
