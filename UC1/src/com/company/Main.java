package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Введи буквы: ");
        String confession = in.nextLine();
        int count = getCount(confession);
        System.out.print("Кол-во букв: "+ count);



    }


    public static int getCount (String str) {
        int vowelsCount = 0;

        char a = 'a';
        char e = 'e';
        char i = 'i';
        char o = 'o';
        char u = 'u';

        //char[] cats = {'a', 'e', 'i', 'o', 'u'};

        for (int z=0; z <str.length(); z++ ){
            if (str.charAt(z)==a||str.charAt(z)==e||str.charAt(z)==i||str.charAt(z)==o||str.charAt(z)==u){
            //if (str.charAt(z)==cats){
                vowelsCount = vowelsCount + 1;
            }
            else {
                System.out.print("");
            }
        }

        return  vowelsCount;
    }


}


