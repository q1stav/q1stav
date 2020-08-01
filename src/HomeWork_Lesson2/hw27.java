package HomeWork_Lesson2;

public class hw27 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 2, 9, 13, 42};
        int delta = -10;
        int buffer = 0;
        int step= 0;
        if (delta>0){
            delta=(delta%(arr.length));
        }
        if (delta<0){
            delta=arr.length+(delta%(arr.length));
        }
        for(step=1;step<=delta;step++) {
            for (int i = 0; i < arr.length - 1; i++) {
                buffer = arr[0]+arr[i + 1];
                arr[0] = buffer-arr[0];
                arr[i + 1] = buffer-arr[i+1];
            }
        }
        printArray(arr);
    }
    private static void printArray ( int[] arrayToPrint){
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i] + " ");
        }
    }
}

