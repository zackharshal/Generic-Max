
public class Main {
    public static Integer maxInt(Integer num1, Integer num2, Integer num3){
        Integer max = num1;
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
        System.out.println(maxInt(45, 12, 34));
        //test case 2
        System.out.println(maxInt(23, 89, 34));
        //test case 3
        System.out.println(maxInt(31, 56, 99));
    }
}