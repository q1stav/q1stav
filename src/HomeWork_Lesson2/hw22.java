package HomeWork_Lesson2;

public class hw22 {

    public static void main(String[] args){
        int[] arr=new int[8];
        int i;
        arr[0]=0;
        System.out.println(arr[0]); // по приколу хотел сделать через сумму
        for(i=1; i<=arr.length-1;i++){
            arr[i]=arr[i-1]+3;
            System.out.println(arr[i]);
        }

    }
}