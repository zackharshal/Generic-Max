
public class Main {
    public static Float maxInt(Float num1, Float num2, Float num3){
        Float max = num1;
        if(num2.compareTo(max) > 0){
            max = num2;
        }
        if(num3.compareTo(max) > 0){
            max = num3;
        }
        return max;

    }
    public static void main(String[] args) {
        //test case 1
        System.out.println(maxInt(45.32f, 12.45f, 34.89f));
        //test case 2
        System.out.println(maxInt(23.23f, 89.23f, 34.45f));
        //test case 3
        System.out.println(maxInt(31.1f, 56f, 99.78f));
    }
}