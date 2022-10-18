import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Zadanie2();
//Zadanie1();
        //Zadanie3();
        // Zadanie4();
//czyPalindrom("Ala");
        String a="ala",b="aleksander",c="KAJAK",d="12321";
        System.out.println("Czy palindrom "+a+" Czy palindrom "+ czyPalindrom(a));
        System.out.println("Czy palindrom "+b+" Czy palindrom "+ czyPalindrom(b));
        System.out.println("Czy palindrom "+c+" Czy palindrom "+ czyPalindrom(c));
        System.out.println("Czy palindrom "+d+" Czy palindrom "+ czyPalindrom(d));

    }//zadanie5
public static boolean czyPalindrom(String text){
   int end=text.length()-1;
   text.toLowerCase(Locale.ROOT);
   for (int i=0;i<text.length()/2;i++){
       if(text.charAt(i) !=text.charAt(end) )return false;
           end--;

   }
   return true;
}
//koniec main
//    public static double Input(){
//        Scanner Input=new Scanner(System.in);
//        System.out.println("Podaj n: ");
//     double n=Input.nextDouble();
//    return n;}
//    //zadanie 3
//    public static void Zadanie4(){
//        double n=Input();
//        int liczba,suma=0;
//        Random rand=new Random();
//        if(n>0){
//            while(n>0) {
//                liczba = rand.nextInt(56)-10;//-10;45
//                //System.out.println("wylosowana: "+liczba);
//                if (liczba % 2 == 0) suma += liczba;
//                n--;
//            }
//            System.out.println("Suma liczba parzystych: "+suma);
//        }else{
//            System.out.println("Ciag musi miec conajmniej jedna liczbe ");
//        }
//    }
//public static void Zadanie3(){
//        double n=Input();
//        double liczba,suma=0;
//        if(n>0){
//            while(n>0) {
//                liczba = Input();
//                if (liczba % 2 == 0) suma += liczba;
//n--;
//            }
//            System.out.println("Suma liczba parzystych: "+suma);
//        }else{
//            System.out.println("Ciag musi miec conajmniej jedna liczbe ");
//        }
//}
}
//0
//    }//zadanie1
//    public  static void Zadanie1() {
//        double ilStud = Input();
//        int a = 0, b = 40, ile = 0;
//        double pkt, suma = 0;
//        if (ilStud > 0) {
//            while (ilStud > 0) {
//                System.out.println("Podaj lp. pkt 0-40 ");
//                pkt = Input();
//                if (pkt >= a && pkt <= b) {
//                    suma += pkt;
//                    ile++;
//                    ilStud--;
//                }
//            }//koniec while
//            System.out.println("ile "+ile);
//            System.out.println("suma pkt= " + suma);
//            System.out.println("Srednia= " + suma / ile);
//        } else System.out.println("grupa musi liczyc co najmniej 1go studenta ");
//    }
    //zadanie 2
//    public static void Zadanie2(){
//        double sumad=0,sumau=0,iledot=0,ileu=0,liczba;
//        for(int i=0;i<10;i++){
//            liczba=Input();
//            if(liczba>=0){
//                sumad=liczba;
//                iledot++;
//
//            }else{
//                ileu++;
//                sumau+=liczba;
//            }
//            System.out.println("Suma liczba dodatnich= "+sumad+" ilosc liczba "+iledot);
//            System.out.println("Suma liczba ujemnych= "+sumau+" ilosc liczba "+ileu);
//
//
//        }
//    }}
