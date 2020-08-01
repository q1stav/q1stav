package HomeWork_Lesson2;

public class hw25 {

    public static void main(String[] args){
        int[] arr={5, 3, 2, 11, 4, 5, 2, 4, 8, 9,1};
        int max=arr[0];
        int min=arr[0];
        int i=0;
        for(i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("MIN - "+ min);
        System.out.println("MAX - "+ max);
    }
}
