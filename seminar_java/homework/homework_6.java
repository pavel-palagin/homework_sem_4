//Написать программу вычисляющую значение сложного арифметического выражения.
// Для простоты - выражение всегда вычисляемое
//        Пример: (2^3 * (10 / (5 - 3)))^(Sin(Pi)) ответ - 1

package seminar_java.homework;

import java.util.*;

import static java.lang.Math.pow;


public class homework_6 {
    private static final String OPEN_PARENTHESES = "(";
    private static final String CLOSE_PARENTHESES = ")";


    public static void main(String[] args) {

        String inputString = "12 + ( 9 + ( 23 - 3 ^ 2 ) )"; //"( 2 ^ 3 * ( 10 / ( 5 - 3 ) ) ) ^ ( Sin ( Pi ) ) ";
        String resPostfix = inPostfix(inputString);
        System.out.println(inputString + "\n" + resPostfix + "\n" + fromPostFix(resPostfix) + "\n" + solvePostfix(resPostfix));

    }

    private static String inPostfix(String inputString){

        Stack<String> operators = new Stack<>();
        StringBuilder resString = new StringBuilder();
        Map<String, Integer> operatorsPriority = Map.of("^", 3,"*", 2, "/",2, "+", 1, "-", 1, "(", 0);

        String[] expression = inputString.split("\\s+");

        int curPos = 0;

        while (curPos < expression.length){
            String curSym = expression[curPos];

            if (curSym.equals(OPEN_PARENTHESES)){
                operators.push(curSym);

            }else if(curSym.equals(CLOSE_PARENTHESES)) {
                while (!operators.peek().equals(OPEN_PARENTHESES)){
                    resString.append(operators.pop());
                    resString.append(" ");
                }
                operators.pop();

            }else if(operatorsPriority.containsKey(curSym)){
                int curPriority = operatorsPriority.get(curSym);
                while (!operators.isEmpty() && curPriority < operatorsPriority.get(operators.peek())){
                    resString.append(operators.pop());
                    resString.append(" ");
                }
                operators.push(curSym);

            }else{
                resString.append(curSym);
                resString.append(" ");
            }
            curPos++;
        }
        while (!operators.isEmpty()){
            resString.append(operators.pop());
            resString.append(" ");
        }
        return resString.toString().trim();
    }



    public static String fromPostFix(String originalString) {

        Set<String> operators = Set.of("+", "-", "*", "/", "^");
        Stack<String> operands = new Stack<>();
        String[] expression = originalString.split("\\s+");


        for (String sym : expression){
            if(operators.contains(sym) && !operands.isEmpty()){
                String x = operands.pop();
                String y = operands.pop();
                operands.push(OPEN_PARENTHESES + y + sym + x + CLOSE_PARENTHESES);
            }else {
                operands.push(sym);
            }
        }

        return operands.pop();
    }


    public static int solvePostfix(String expression) {

        if (expression.length() == 0) {
            System.out.println("No enter data");
        }

        Set<String> operators = Set.of("+", "-", "*", "/", "^");
        Stack<Integer> operands = new Stack<>();
        String[] exp = expression.split("\\s+");


        for (String sym : exp){
            if(sym == "+" && !operands.isEmpty()) {
                int x = operands.pop();
                int y = operands.pop();
                operands.push(Integer.valueOf(y + sym + x));
                if (sym == "-" && !operands.isEmpty()) {
                    operands.push(Integer.valueOf(y + sym + x));
                    if (sym == "*" && !operands.isEmpty()) {
                        operands.push(Integer.valueOf(y + sym + x));
                        if (sym == "/" && !operands.isEmpty()) {
                            operands.push(Integer.valueOf(y + sym + x));
                            if (sym == "^" && !operands.isEmpty()) {
                                operands.push(Integer.valueOf((int) pow(x, y)));

                            }
                        }
                    }
                }
            }else {
                operands.push(Integer.valueOf(sym));
            }
        }

//            if (sym == '+') {
//                operands.push(y + x);
//            }
//            else if (sym == '-') {
//                operands.push(y - x);
//            }
//            else if (sym == '*') {
//                operands.push(y * x);
//            }
//            else if (sym == '/') {
//                operands.push(y / x);
//            }

        return operands.pop();
    }
}

