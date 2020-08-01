package HomeWork_Lesson2;

import javax.rmi.CORBA.Util;

public class hw21 {

    public static void main(String[] args){
        int[] nums={1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int i;
        for(i=0; i<=nums.length-1;i++){
            nums[i]=(nums[i] == 0)?1:0;
            System.out.println(nums[i]);
        }
    }
}
