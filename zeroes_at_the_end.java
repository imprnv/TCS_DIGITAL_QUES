import java.util.Arrays;

public class zeroes_at_the_end {
    static void swap(int []arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void rearrange(int [] arr) {
        int nonzero = 0;
        for(int i = 0; i <arr.length ; i++) {
            if(arr[i]!=0){
                swap(arr,nonzero,i);
                nonzero+=1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int [] b = {10,0,0,9,7,0,0};
        rearrange(b);
    }

}
