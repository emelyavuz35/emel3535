package day15_MethodCreatıon;

import java.util.Scanner;

public class C02_MethodCreatıon {
    public static void main(String[] args) {


        //kullanıcıdan bır kelıme ısteyın
        //eger kelıme 3 harften kısa ıse "kelıme cok kısa"yazdırın
        //eger kelıme 3-4 veya 5 harflı ıse harf sayısını ve kelımenın tersten yazılısını yazdırın
        //eger 5 harften uzunsa "kelıme cok uzun "yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bır kelıme gırınız");
        String kelime=scan.next();
        String terskelime="";

        if (kelime.length()<3) {
            System.out.println("kelıme cok kısa");

        } else  if (kelime.length()<=5) {
            if (kelime.length()==3){
                terskelime=kelime.substring(2)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);

            }else if (kelime.length()==4){
                terskelime=kelime.substring(3)+
                        kelime.substring(2,3)+
                        kelime.substring(1,2);
                           kelime.substring(0,1);

            }else{
                terskelime=kelime.substring(4)+
                        kelime.substring(3,4)+
                        kelime.substring(2,3);
                kelime.substring(1,2);
                kelime.substring(0,1);

            }
            System.out.println("girdiginiz kelimedeki harf sayısı:"+kelime.length());
            System.out.println("kelimenin tersen yazılısı:"+ terskelime);



        } else{
            System.out.println("kelime cok uzun");


                }
            }
        }


