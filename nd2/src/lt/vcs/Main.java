package lt.vcs;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //------------------------------------------
//        Scanner scan = new Scanner(System.in);
//        System.out.println("iveskite zodi: ");
//        String zodis = scan.next(); //laukia userio ivedimo i programa
//        int kiekis = 0;
//
//        char[] masyvas = zodis.toCharArray();
        String[] strMass = new String[3];
        strMass[0] = "nulis";
        strMass[1] = "vienas";
        strMass[2] = "du";
//        String[] mass = {"0", "1", "2"};
        for (int i = 0; i < strMass.length; i++){
            strMass[i] = "cia bus " + i;
        }

        for (String elementas : strMass) {
            VcsUtils.println(elementas);
        }

        for (Dydziai dydis : Dydziai.values()) {
            VcsUtils.println(dydis.name());
            VcsUtils.println(dydis.getLt());
            VcsUtils.println(dydis.getEn());

            switch (dydis) {
                case SMALL:
                    VcsUtils.println("cha cha");
                    break;
                case MEDIUM:
                    VcsUtils.println("dar paaugsi cha");
                    break;
                case LARGE:
                    VcsUtils.println("varai");
                    break;
            }
        }



        List<String> listas = Arrays.asList(strMass);



//        for (char raide: masyvas) { //kiekvienas char bus identifikuotas
//        if (raide == 'a'){
//            kiekis++;      // cia iteruojama, randa a raide ir keliauja toliau, skaiciuoja simbolius po viena
//        }
//        }
//        String str2 = zodis.replaceAll("a", "z"); //pakeitimo funkcija; visas a pakeis z !
//
//
//        System.out.println("zodis " + zodis);
//        System.out.println("pakeitem raides a i tarpa: \"" + str2 + "\"");
//        System.out.println("a raidziu skaicius: " + kiekis);
//        System.out.println("zodzio raidziu skaicius: " + zodis.length());
//        System.out.println("trim() metodo rezultatas: '".concat(str2.trim()).concat("'")); //.concat= +
//        String str3 = str2.replaceAll(" ", "");
//        System.out.println("ivestas zodis turi numeri simbolio be tarpo: " + str3.trim().length());

        //-------------------------------------------
    } //Main end

}
