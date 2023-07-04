public class second_largest_element {
 static   int secondlargest(int arr [],int n ) {
        int largest = 0;int res = -1;
        for (int i = 0; i <n ; i++) {
            if(arr[i]>arr[largest]) {
                res = largest;
                largest = i;
            }
            else if (arr[i]!=arr[largest]){
                if(res ==-1 || arr[i]>arr[res])
                    res = i;
            }

        }
    return res;
    }

    public static void main(String[] args) {
        int a [] = {12 ,12 ,12 ,12 ,7 ,8 , 9 };
        System.out.println(secondlargest(a,a.length-1));


    }
}
