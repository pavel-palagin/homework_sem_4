public class program {
    public static void main(String[] arg) {
        int f = 5;
        int a = --f - f--;
        int b = ++f - f--;
        int c = --f - f++;
        int d = ++f - f++;
        System.out.println(++f);
        System.out.println(f++);
        System.out.println(--f);
        System.out.println(f--);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}