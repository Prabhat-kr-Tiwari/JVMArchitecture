import java.util.stream.Stream;

public class hi {
    public static void main(String[] args) {
        Integer i= Stream.of(3,5,6).reduce(2,(a, b)->a*b);
        System.out.println(i);
    }
}
