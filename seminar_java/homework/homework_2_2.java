// Закончить задачу под номером '5' из общего списка: Задача: Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет. Входящие строки могут иметь любое количество символов, например, 2? + 1? = ??.


package seminar_java.homework;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class homework_2_2 {
    static char[] sGlobal;
    static ArrayList<Integer> singIndexesGlobal = new ArrayList<>();

    public static void main(String[] args) {

        String s = "2? + ?? = 3?";

        int questionCount;
        questionCount = s.length() - s.replace("?", "").length();
        int k = 10;
        int[] nums = new int[questionCount];
        ArrayList<Integer> singIndexes = new ArrayList<>();

//        System.out.println(Arrays.toString(nums));

        char[] equation = s.replaceAll(" ", "").toCharArray();
        for (int i = 0; i < equation.length; i++) {
            if(equation[i] == '+' || equation[i] == '=') {
                equation[i] = '-';
            }
            if(equation[i] == '?') {
                singIndexes.add(i);
            }
        }

        sGlobal = equation;
        singIndexesGlobal = singIndexes;

        generate(new int[singIndexes.size()], 0, k);

    }

    private static void generate(int[] arrays, int index, int k) {
        if (index == arrays.length) {
            check(arrays);
            return;
        }

        for (int i = 0; i < k; i++) {
            arrays[index] = i;
            generate(arrays, index + 1, k);
        }
    }
    private static void check(int[] arrays) {
       for (int i = 0; i < arrays.length; i++) {
           sGlobal[singIndexesGlobal.get(i)] = Character.forDigit(arrays[i], 10);
        }
       String[] str = String.valueOf(sGlobal).split("-");
       int a = Integer.parseInt(str[0]);
       int b = Integer.parseInt(str[1]);
       int c = Integer.parseInt(str[2]);

       if (a + b == c) {
            System.out.printf("%d + %d = %d", a, b, c);
           System.out.println();
        }
    }
}
