//Реализовать алгоритм сортировки слиянием
//Пример сортировки слиянием. Сначала делим список на кусочки (по 1 элементу), затем сравниваем каждый элемент с соседним,
//сортируем и объединяем. В итоге, все элементы отсортированы и объединены вместе.


package seminar_java.homework;

public class homework_4_1 {
    public static void main(String[] args) {

        int [] array = {3,1,6,2,0,4};
        sortArray(array);

        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }

    }
    public static int[] sortArray(int[] firstArray){
        if(firstArray == null) {
            return null;
        }
        if(firstArray.length < 2){
            return firstArray;
        }

        int [] secondArray = new int [firstArray.length/2];
        System.arraycopy(firstArray, 0, secondArray, 0, firstArray.length/2);

        int [] thirdArray = new int [firstArray.length - firstArray.length/2];
        System.arraycopy(firstArray, firstArray.length/2, thirdArray, 0, firstArray.length - firstArray.length/2);

        secondArray = sortArray(secondArray);
        thirdArray = sortArray(thirdArray);

        return mergeArray(secondArray, thirdArray);
    }

    public static int[] mergeArray(int[] firstArray, int[] secondArray) {
        int [] resultArray = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < resultArray.length; i++) {
            if((firstArray[i]) < (secondArray[i])){
                resultArray[i] = firstArray[i];
            }else{
                resultArray[i] = secondArray[i];
            }
        }
        return resultArray;
    }
}
