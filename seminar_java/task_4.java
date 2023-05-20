package seminar_java;//Задано уравнение вида q + w = e, q, w, e >= 0.
//        Некоторые цифры могут быть заменены знаком вопроса,
//        например 2? + ?5 = 69. Требуется восстановить выражение
//        до верного равенства. Предложить хотя бы одно решение или
//        сообщить, что его нет.
import java.util.Arrays;

public class task_4 {
    public static void main(String[] args) {
        int N  = 3;
        int k  = 2;
        int[] nums = new int[N];
        generate(nums, 0, k);
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
