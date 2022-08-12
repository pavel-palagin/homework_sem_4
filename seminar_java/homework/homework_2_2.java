// Закончить задачу под номером '5' из общего списка: Задача: Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет. Входящие строки могут иметь любое количество символов, например, 2? + 1? = ??.


package seminar_java.homework;

import java.util.Arrays;

public class homework_2_2 {

    public static void main(String[] args) {

        String s = "2? + 1? = ??";

        int questionCount;
        questionCount = s.length() - s.replace("?", "").length();
        int k = 10;
        int[] nums = new int[questionCount];
//        int[] numbers = generate(nums, 0, k);
//        String equation = s.replace("?", numbers[i]);
    }


    private static void generate(int[] arrays, int index, int k) {
        if (index == arrays.length) {
            System.out.println(Arrays.toString(arrays));
            return;
        }

        for (int i = 0; i < k; i++) {
            arrays[index] = i;
            generate(arrays, index + 1, k);
        }
    }
}
