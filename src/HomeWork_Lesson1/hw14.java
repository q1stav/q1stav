package HomeWork_Lesson1;

import sun.font.DelegatingShape;

import java.util.Scanner;

public class hw14 {

    public static void  main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Введите а ");
        double argument1 = userInput.nextDouble();
        System.out.print("Введите b ");
        double argument2 = userInput.nextDouble();
        double summ=argument1+argument2;
        System.out.println(summ);

        if (10<summ && summ<=20){
            System.out.println("все ок");
        }
        else {
            System.out.println("все 3.14зда");
        }
    }
}