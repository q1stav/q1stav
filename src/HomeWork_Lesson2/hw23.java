package HomeWork_Lesson2;

public class hw23 {

    public static void main(String[] args){
        int[] arr={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int i=0;
        for(i=0;i<=arr.length-1;i++){
            if(arr[i]<6){
                arr[i]=arr[i]*2;
            }
            System.out.println(arr[i]);
        }
    }
}
