package HomeWork_Lesson2;

public class hw24 {

    public static void main(String[] args){
        int d=5;
        int[][] arr = new int[d][d];
        int i=0;
        int j=0;
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr.length;j++){
                if ((i==j)||(i==arr.length-j-1)){
                    arr[i][j]=1;
                }
                else {
                    arr[i][j]=0;
                }
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
