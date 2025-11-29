package jaava8;
import java.util.function.*;

public class LambdaExper {

    public static void main(String[] args) {

        Runnable r = () -> System.out.println("hello");
        r.run();
        
        Runnable e = () -> System.out.println("hello guys aap kaise hain");
        e.run();
    }
}

