
public class Main {
    public <T extends Comparable> void maximum(T str1, T str2, T  str3){
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
        Main obj1 = new Main();
        obj1.maximum(45, 56, 11);
//        //test case 2
        obj1.maximum(23f, 45f, 99f);
//        //test case 3
        obj1.maximum("Peach", "Banana", "Apple");
    }
}