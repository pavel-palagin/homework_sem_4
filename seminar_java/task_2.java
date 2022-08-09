//На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть
// две команды
//        - команда 1 (к1): увеличить в с раза, а умножается на c
//        - команда 2 (к2): увеличить на d ( +2 ), к a прибавляется d
//        написать программу, которая выдаёт набор команд, позволяющий
//        число a превратить в число b или сообщить, что это невозможно
//        Пример 1: а = 1, b = 7, c = 2, d = 1
//        ответ: к1, к1, к1, к1, к1, к1 или к1, к2, к1, к1, к1 или к1, к1, к2, к1.
//        Пример 2: а = 11, b = 7, c = 2, d = 1
//        ответ: нет решения.
//        *Подумать над тем, как сделать минимальное количество команд

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a = ");
        int a = sc.nextInt();
        System.out.print("want b = ");
        int b = sc.nextInt();
        System.out.print("multiply on c = ");
        int c = sc.nextInt();
        System.out.print("add on d = ");
        int d = sc.nextInt();
        k(a,b,c,d,"");
    }

    public static void k(int a, int b, int c, int d, String str) {
        if (a > b){
//            System.out.println("no answer");
            return;
        }
        if (a == b){
            System.out.println("a" + str + " = " + b);
            return;
        }
        if (a < b){
            k(a * c, b, c, d, str + "*" + c);
            k(a + d, b, c, d, str + "+" + d);
        }
    }
}
