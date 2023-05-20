//package seminar_java.out.production.seminar_java;
//
//public class task_6 {
//    static int[][] steps = {
//            {-2, -1},
//            {-2, 1},
//            {-1, -2},
//            {-1, 2},
//            {1, -2},
//            {1, 2},
//            {2, -1},
//            {2, 1},
//    };
//
//    public static void main(String[] args) {
//
//
//        public static boolean solveHorse(int[][] board, int count, int row, int col) {
//
//
//            System.out.println(count);
//            if (count == 25) {
//                printBoard(board);
//                return true;
//            }
//
//            for (int i = 0; i < steps.length; i++) {
//
//                int newRow = row + steps[i][0];
//                int newCol = col + steps[i][1];
//
//                if(checkStep(board, newRow, newCol)) {
//                    board[newRow][newCol] = ++count;
//                    if (!solveHorse(board, count, newRow, newCol)) {
//                        board[newRow][newCol] = 0;
//                        count--;
//                    } else return true;
//                }
//
//            }
//
//            return false;
//
//        }
//        public static boolean checkStep(int[][] board, int row, int col) {
//
//            if(row >= size || row < 0) return false;
//            if(col >= size || col < 0) return false;
//            if(board[row][col] != 0) return false;
//
//            return true;
//
//        }
//        public static void printBoard(int[][] arr) {
//
//            for (int[] line : arr) {
//                System.out.println(Arrays.toString(line));
//            }
//
//        }
//
//    }
//}
//
//
//    public static void hanoi(int n, int from, int to, int add) {
//
//        if (n == 1) {
//            System.out.println("Переместите диск " + n + " из " + from + " на " + to);
//            return;
//        }
//
//        hanoi(n - 1, from, add, to);
//        System.out.println("Переместите диск " + n + " из " + from + " на " + to);
//
//        hanoi(n - 1, add, to, from);
//
//    }
