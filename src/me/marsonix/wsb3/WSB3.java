package me.marsonix.wsb3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WSB3 {


     static int i;


    public static void main(String[] args) {

       // System.out.println(i);

//
//        Random random = new Random();
//        int number = 1 + random.nextInt(10);
//        switch (number){
//
//            case 1: System.out.println("Jeden"); break;
//            case 2: System.out.println("Dwa"); break;
//            case 3: System.out.println("Trzy");break;
//               case 4:
//                System.out.println("Cztery");
//                break;
//               case 5:
//                System.out.println("Pięć");
//                break;
//                case 6:
//                System.out.println("Sześć");
//                break;
//               case 7:
//                System.out.println("Siedem");
//                break;
//               case 8:
//                System.out.println("Osiem");
//                break;
//               case 9:
//                System.out.println("Dziewięć");
//                break;
//               case 10:
//                System.out.println("Dziesięć");
//                break;
//
//
//        }

//        Scanner sc = new Scanner(System.in);
//        String string = sc.nextLine();
//
//
//        if(string=="kot"){
//            System.out.println("Zgadłeś!");
//        }

//        String text = "test";
//        String text2 = text;
//        String string = null;
//        int[]tab = new int[5];
//        Arrays.fill(tab, 10);
//        System.out.println(tab[0]);
//        System.out.println(text.equals(text2));
//        double[] tablica = new double[3]; // 0 - 2
//
//        tablica[0] = 5;
//        tablica[1] = 1000;
//        tablica[2] = 55;
//
//
//        double[] tablica2 = new double[3]; // 0 - 2
//
//        tablica2[0] = 5;
//        tablica2[1] = 1000;
//        tablica2[2] = 55;
//
//        System.out.println(Arrays.equals(tablica, tablica2));
//        Arrays.sort(tablica);
//        int index = Arrays.binarySearch(tablica, 55);
//        System.out.println(index);

//        int a = 0;
//        int b = ++a;
//
//        System.out.println(b);
//        System.out.println(a);

//

        //int[] tab = new int[10];
       // System.out.println(tab.length);


        int[] znaki = new int[4];
        znaki[0]=116;
        znaki[1]='e';
        znaki[2]='s';
        znaki[3]='t';


//
//        for(int i = 0 ; i < znaki.length ; i ++){
//            System.out.println(znaki[i]+i);
//        }
//
//        for(int k : znaki){ // foreach
//            System.out.println(k);
//        }

//        String test = null;
//        if(test!=null) {
//            System.out.println(test.equals("434"));
//        }
//
//        String[]string = new String[]{ "test", "test2", "test3" };
//
//
//        System.out.println(string[0]);


        String s = "";
        String s2 = "123";

        String s3 = s+s2;


       for(int i = 0 ; i < 10 ; i++){

           char c = 65; // Wstawiona losowa liczba z przedziału od 65 do 90
           s += c;

       }
        System.out.println(s);

        //System.out.println(znaki[0]);



   //     test === >    't' 'e' 's' 't'

//        for(int i = 0 ; i < 10 ; i++ ){
//            System.out.println("Hello world! "+i);
//        }





    }


}
