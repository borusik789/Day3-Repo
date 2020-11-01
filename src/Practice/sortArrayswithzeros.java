package Practice;

import java.util.Arrays;
public class sortArrayswithzeros {
    public static void main(String[] args) {
        int arr [] = {1,5,0,0,4,7,0,8};
        int arr2[] = new int [arr.length];
        int j=0;
        for (int i=0;i<arr.length; i++){
            if (arr[i]>0){
                arr2[j] = arr[i];
                j++;
            }

        }
        System.out.println(Arrays.toString(arr2));
    }
}






