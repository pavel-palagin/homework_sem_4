import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class algo_task {

    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger(0);

//        System.out.println(sum(100));
//        System.out.println(findSim(10));
//        System.out.println(method().size());
        long start = System.nanoTime();
        System.out.println("Результат" + " - " + fib(45, counter));
        System.out.println("Время" + " - " + (System.nanoTime() - start));
        System.out.println("Количество операций" + " - " + counter);

        counter = new AtomicInteger(0);
        start = System.nanoTime();

        System.out.println("Результат" + " - " + fib2(45, counter));
        System.out.println("Время" + " - " + (System.nanoTime() - start));
        System.out.println("Количество операций" + " - " + counter);

    }

    public static int sum(int N) {
        int sum = 0;
//        for (int i=0; i<=N; i++){
//            sum = sum + i;
//        }

        for (int i = 0; i<N; i++, sum+=i);

        return sum;
    }

    public static List<Integer> findSim (int num) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= num; i++){
            boolean simple = true;
            for (int j = 2; j < num; j++){
                if (i % j == 0 && i!=j){
                    simple = false;
                }
            }
            if (simple){
                result.add(i);
            }
        }
        return result;
    }

    public static List<String> method(){
        List<String> result = new ArrayList<>();
        for(int i=1; i<=6; i++){
            for(int j=1; j<=6; j++){
                for(int k=1; k<=6; k++){
                    for(int m=1; m<=6; m++){
                        result.add(Integer.toString(i) +
                                Integer.toString(j) +
                                Integer.toString(k) +
                                Integer.toString(m));

                    }
                }
            }
        }
        return result;
    }

    public static int fib(int pos, AtomicInteger counter){
        if (pos == 1 || pos == 2){
            return 1;
        }
        counter.incrementAndGet();
        return fib(pos - 1, counter) + fib(pos - 2, counter);
    }

    public static int fib2(int n, AtomicInteger counter){
        int a = 1;
        int b = 1;
        for (int i = 3; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
            counter.incrementAndGet();
        }
        return b;
    }

}



