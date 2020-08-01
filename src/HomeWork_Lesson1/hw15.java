package HomeWork_Lesson1;

public class hw15 {

    public static void main(String[] args){
           System.out.println(getPositiveorNegative(0));
    }
    private static String getPositiveorNegative(int getNumber){
        return (getNumber>=0) ? "положительное" : "отрицателное";
    }
}
