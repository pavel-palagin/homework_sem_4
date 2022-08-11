//Сделать программу, в рамках которой необходимо определить какой символ сколько раз встречается в строке.
// Например: входящая строка вида - "aaaaabbbbcddd" мы должны получить - "a5b4c1d3".


package seminar_java.homework;

public class homework_2_1 {
    public static void main(String[] args) {
        String code = "";
        String s = "aaaaabbbbcddd";
        for (int i = 0; i < s.length(); i++){
            int count = 1;
            while (i+1 < s.length() && s.charAt(i) == s.charAt(i+1)) {
                count++;
                i++;
            }
            String str = Integer.toString(count);
            code += str + s.charAt(i);
        }
        System.out.print(code);
    }
}




