import java.util.Scanner;

public class string_ques {
    public static int getseries(int n ) {
        int a=1;
        int b=1;

        for (int i = 1; i <n; i++) {
            if(n%2!=0){
                if(i==1){
                    a=1;
                }
                a = a*2;
            }
            else {
                if(i==2)
                    b=1;
                b = b*3;
            }


        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    }
}
