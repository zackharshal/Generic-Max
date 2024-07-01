import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class  Main <T extends Comparable<T>>{
    private T[] elements;

    @SafeVarargs
    Main(T... elements) {
        this.elements = elements;
    }
    public void testMaximum(){
        maximum(elements);
    }
    public static <T extends Comparable<T>> void maximum(T... elements){
        if (elements == null || elements.length == 0) {
            System.out.println("No elements provided");
            return;
        }
        List<T> list = Arrays.asList(elements);
        Collections.sort(list);
        T max = list.get(list.size() - 1);
        System.out.println("Maximum value: " + max);

    }
    public static void main(String[] args) {
        // Test case 1
        Main<Integer> obj1 = new Main<>(45, 56, 11, 99, 12);
        obj1.testMaximum();

        // Test case 2
        Main<Float> obj2 = new Main<>(23f, 45f, 99f, 12f, 66f);
        obj2.testMaximum();

        // Test case 3
        Main<String> obj3 = new Main<>("Peach", "Banana", "Apple", "Mango");
        obj3.testMaximum();
    }
}