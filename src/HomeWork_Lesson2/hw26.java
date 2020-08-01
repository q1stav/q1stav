package HomeWork_Lesson2;

import com.sun.org.apache.xpath.internal.objects.XBoolean;

public class hw26 {

    public static void main(String[] args) {
        int[] arr = {1,1,4,2,4};
        System.out.println(checkMid(arr));
    }

    private static boolean checkMid(int[] arrayToCheck) {
        int left = 0;
        int right = 0;
        int summ=0;
        int mid=0;
        boolean result = false;

        for (int i = 0; i < arrayToCheck.length; i++) {
            summ += arrayToCheck[i];
        }
        right=summ;
        for (int i = 0; i < arrayToCheck.length; i++) {
            left = left+arrayToCheck[i];
            right = right-arrayToCheck[i];
            if (left == right) {
                mid=i;
                result = true;
                printArray(arrayToCheck,mid);
                break;
            }
            if (left > (summ - left)) {
                result=false;
                break;
            }
        }
        return result;
    }
    static void printArray(int[] arrayToPrint, int mid){
        for (int i=0;i<arrayToPrint.length;i++){
            System.out.print(arrayToPrint[i]+" ");

            if(i==mid){
                System.out.print("|| ");
            }
        }
    }
}