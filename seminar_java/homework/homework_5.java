/*Необходимо определить, является ли последовательность скобок в строке правильной.
        Существует 3 вида скобок (), [], {} - из них мы составляем последовательно вида:
        "()[]{}" -> true,

        "()" -> true,
        "}]{[" -> false,
        "(]" -> false.
        Определить, какая из этих последовательность правильная - каждая открытая скобка должна закрывать скобкой того же вида.
        Для решения необходимо использовать Stack и Map.
*/

package seminar_java.homework;

import java.util.Arrays;
import java.util.Map;
import java.util.Stack;

public class homework_5 {
    public static void main(String[] args) {

        String someOrderBrackets = "([]}{)"; //"([]})"

        System.out.println(checkBracket(someOrderBrackets));
    }

    public static boolean checkBracket(String someOrderBrackets) {

        Stack<Character> stackBracket = new Stack<>();

        Map<String, Integer> openBrackets = Map.of("(", 0,
                                                    "[", 1,
                                                    "{", 2);

        Map<String, Integer> closeBrackets = Map.of(")", 0,
                                                    "]", 1,
                                                    "}", 2);

        for (int i = 0; i < someOrderBrackets.length(); i++) {

            char brt = someOrderBrackets.charAt(i);

            if (openBrackets.containsKey(String.valueOf(brt))) {
                stackBracket.push(brt);
            }
            if (closeBrackets.containsKey(String.valueOf(brt))) {
                if (stackBracket.isEmpty()) {
                    return false;
                }
                char s = stackBracket.peek();

                if ((brt == ')' && s == '(') || (brt == '}' && s == '{') || (brt == ']' && s == '[')) {
                    stackBracket.pop();
                } else {
                    return false;
                }
            }
        }

        if (!stackBracket.isEmpty()) {
            return false;
        }

        return true;
    }




//    public static boolean checkBracket(String str) {
//
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < str.length(); i++) {
//            char bracket = str.charAt(i);
//
//            if (bracket == '(' || bracket == '{' || bracket == '[') {
//                stack.push(bracket);
//            }
//
//            if (bracket == ')' || bracket == '}' || bracket == ']') {
//                if (stack.isEmpty()) {
//                    return false;
//                }
//                char top = stack.peek();
//                if ((bracket == ')' && top == '(') || (bracket == '}' && top == '{') || (bracket == ']' && top == '[')) {
//                    stack.pop();
//                } else {
//                    return false;
//                }
//            }
//        }
//
//        if (!stack.isEmpty()) {
//            return false;
//        }
//
//        return true;
//
//    }
}



