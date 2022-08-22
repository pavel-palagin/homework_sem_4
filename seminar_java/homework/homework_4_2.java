//Реализовать алгоритм пирамидальной сортировки (HeapSort)
//Пирамидальная сортировка (или сортировка кучей, HeapSort) — это метод сортировки сравнением,
// основанный на такой структуре данных как двоичная куча.
//Поскольку двоичная куча — это законченное двоичное дерево, ее можно легко представить в виде массива,
//а представление на основе массива является эффективным с точки зрения расхода памяти.
//Если родительский узел хранится в индексе I, левый дочерний элемент может быть вычислен как 2 I + 1,
//а правый дочерний элемент — как 2 I + 2



package seminar_java.homework;

public class homework_4_2 {
    public static void main(String args[])
    {
        int[] sourceArray = {0, 1, 60, 5, 16, 7};
        sortedArray(sourceArray);
        System.out.println("Sorted array is");
        for (int i = 0; i < sourceArray.length ; i++) {
            System.out.print(sourceArray[i] + " ");
        }
    }

    public static void sortedArray(int[] array){
        int size = array.length;
        for (int i = size/2 - 1; i >= 0; i--)
            theHeap(array, size, i);

        for (int i = size - 1; i>=0; i--)
        {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            theHeap(array, i, 0);
        }
    }

    public static void theHeap(int[] array, int size, int i)
    {
        int maxValue = i;
        int leftEdge = 2*i + 1;
        int rightEdge = 2*i + 2;

        if (leftEdge < size && array[leftEdge] > array[maxValue])
            maxValue = leftEdge;

        if (rightEdge < size && array[rightEdge] > array[maxValue])
            maxValue = rightEdge;

        if (maxValue != i)
        {
            int temp = array[i];
            array[i] = array[maxValue];
            array[maxValue] = temp;

            theHeap(array, size, i);
        }
    }
}



