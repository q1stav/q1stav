package HomeWork_Lesson1;
import sun.awt.geom.AreaOp;

import java.util.Scanner;
public class hw18 {

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Введите год ");
        double year = userInput.nextDouble();
        if ((year % 4 == 0) && !(year%100==0) || (year%400==0)){
            System.out.println("Высокосный");
        }
        else{
            System.out.println("НЕ высокосный");
        }
    }
}
