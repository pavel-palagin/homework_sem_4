//Реализовать алгоритм сортировки слиянием
//Пример сортировки слиянием. Сначала делим список на кусочки (по 1 элементу), затем сравниваем каждый элемент с соседним,
//сортируем и объединяем. В итоге, все элементы отсортированы и объединены вместе.


package seminar_java.homework;

import java.util.Arrays;

public class homework_4_1 {
    public static void main(String[] args) {

        int [] array = {33,31,26,2,16,14,22,0, -15};

        System.out.println(Arrays.toString(arraySort(array, 0, array.length-1)));


    }
//    public static int[] sortArray(int[] array){
//        if(array == null) {
//            return null;
//        }
//        if(array.length < 2){
//            return array;
//        }
//
//        int [] leftArray = new int [array.length/2];
//        System.arraycopy(array, 0, leftArray, 0, array.length/2);
//
//        int [] rightArray = new int [array.length - array.length/2];
//        System.arraycopy(array, array.length/2, rightArray, 0, array.length - array.length/2);
//
//
//        sortArray(leftArray);
//        sortArray(rightArray);
//
//        int [] finishArray = mergeArray(leftArray, rightArray);
//
//        return finishArray;
//    }

    public static int[] arraySort(int[] array, int leftPointer, int rightPointer) {
        if (leftPointer == rightPointer) {
            return new int[]{array[leftPointer]};
        }
        int mediumPointer = leftPointer + (rightPointer - leftPointer) / 2;

        int[] leftPart = arraySort(array, leftPointer, mediumPointer);
        int[] rightPart = arraySort(array, mediumPointer + 1, rightPointer);
        int[] finishArray = mergeArray(leftPart, rightPart);

        return finishArray;
    }

    public static int[] mergeArray(int[] leftArray, int[] rightArray) {

        int indexLeft = 0;
        int indexRight = 0;
        int indexResult = 0;

        int [] resultArray = new int[rightArray.length + leftArray.length];
        while(indexLeft < leftArray.length && indexRight < rightArray.length) {
            if(leftArray[indexLeft] < rightArray[indexRight]){
                resultArray[indexResult] = leftArray[indexLeft];
                indexLeft++;
                indexResult++;

            }else{
                resultArray[indexResult] = rightArray[indexRight];
                indexResult++;
                indexRight++;
            }
        }

        while(indexLeft < leftArray.length) {
            resultArray[indexResult] = leftArray[indexLeft];
            indexLeft++;
            indexResult++;
        }

        while(indexRight < rightArray.length) {
            resultArray[indexResult] = rightArray[indexRight];
            indexRight++;
            indexResult++;
        }

        return resultArray;
    }
}
