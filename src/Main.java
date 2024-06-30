
public class  Main <T extends Comparable<T>>{
    private T str1;
    private T str2;
    private T str3;
    Main(T str1, T str2, T str3) {
        this.str1 = str1;
        this.str2 = str2;
        this.str3 = str3;
    }
    public void testMaximum(){
        maximum(str1, str2, str3);
    }
    public static <T extends Comparable<T>> void maximum(T str1, T str2, T  str3){
        T max = str1;
        if(str2.compareTo(max) > 0){
            max = str2;
        }
        if(str3.compareTo(max) > 0){
            max = str3;
        }
        System.out.println(max);

    }
    public static void main(String[] args) {
        //test case 1
        Main<Integer> obj1 = new Main<>(45, 56, 11);
        obj1.testMaximum();

        Main<Float> obj2 = new Main<>(23f, 45f, 99f);
        obj2.testMaximum();

        // Test case 3
        Main<String> obj3 = new Main<>("Peach", "Banana", "Apple");
        obj3.testMaximum();
    }
}