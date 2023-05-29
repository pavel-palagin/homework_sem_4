public class sorts {


    public static void main(String[] args) {

        int[] array = {23, 6, 28, 56, 4, 14, 18, 89, 4, 205, 3, 7, 10, 132, 102, 2, 36, 72, 19, 42, 67, 106, 207, 159, 64};
        long start = System.nanoTime();

//        bubbleSorted(array);
//        choiceSorted(array);
//        insertSorted(array);

//        System.out.println("Время" + " - " + (System.nanoTime() - start));
//
//        start = System.nanoTime();
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }


        System.out.println(findIndex(4, array));

        System.out.println("Время" + " - " + (System.nanoTime() - start));

    }

    // Сортировка пузырьком
    public static void bubbleSorted(int[] array) {
        boolean needSort;
        do {
            needSort = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    needSort = false;
                }
            }
        } while (!needSort);
    }

    // Сортировка выбором
    public static void choiceSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPossition = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minPossition]) {
                    minPossition = j;
                }
            }
            if (i != minPossition) {
                int temp = array[i];
                array[i] = array[minPossition];
                array[minPossition] = temp;
            }

        }

    }

    // Сортировка вставками
    public static void insertSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

            }

        }

    }

    // Алгоритмы поиска

    public static int findIndex(int value, int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == value) {
                return i;
            }

        }

        return -1;
    }

    public static int findIndex(int value, int[] array) {
        
    }

}
