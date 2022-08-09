//Написать программу вычисления n-ого треугольного числа

package seminar_java.homework;
import java.util.Scanner;


public class homework_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N => ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++){
            int T = (i*(i+1))/2;
            String s = "*".repeat(T);
            System.out.println(s);
        }

    }

/*    public static void triangle(int n) {
        if(n==1) {
            return;
        }
        else{
            return n - triangle(n-1);
        }

    }*/
}
