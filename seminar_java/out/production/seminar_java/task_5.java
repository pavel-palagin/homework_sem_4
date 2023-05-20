package seminar_java.out.production.seminar_java;

import java.util.Arrays;

public class task_5 {
    static  int queenCount = 4;
    static int size = 4;
    static int [][] field = new int[size][size];

    public static void main(String[] args) {
        putQueen(1,1);
        for (int[] line: field){
            System.out.println(Arrays.toString(line));
        }

        System.out.println();

        delQueen(1,1);
        for (int[] line: field){
            System.out.println(Arrays.toString(line));
        }


        for (int i = 0; i < size; i++) {
            enumQueen(i);
        }

//        System.out.println(Arrays.deepToString(field));
//        for (int[] line: field){
//            System.out.println(Arrays.toString(line));
//        }
    }

    private static void enumQueen(int row) {

        for (int i = 0; i < size; i++) {
            if(field[row][i] == 0){
                putQueen(row,i);
            }
        }
    }

    private static void putQueen(int row, int col){
        for (int i = 0; i < size; i++) {
            field[i][col] += 1;
            field[row][i] += 1;
            if(row+col-i < size && row+col-i >=0){
                field[row+col-i][i] += 1;
            }
            if(row-col+i < size && row-col+i >=0){
                field[i][row-col+i] += 1;
            }

        }
    }
    private static void delQueen(int row, int col){
        for (int i = 0; i < size; i++) {
            field[i][col] -= 1;
            field[row][i] -= 1;
            if(row+col-i < size && row+col-i >=0){
                field[row+col-i][i] -= 1;
            }
            if(row-col+i < size && row-col+i >=0){
                field[i][row-col+i] -= 1;
            }

        }
    }
}
