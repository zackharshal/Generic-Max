
public class Main {
    public static String maxString(String str1, String str2, String str3){
        String max = str1;
        if(str2.compareTo(max) > 0){
            max = str2;
        }
        if(str3.compareTo(max) > 0){
            max = str3;
        }
        return max;

    }
    public static void main(String[] args) {
        //test case 1
        System.out.println(maxString("Banana", "Apple", "Peach"));
        //test case 2
        System.out.println(maxString("Peach", "Banana", "Apple"));
        //test case 3
        System.out.println(maxString("Apple", "Peach", "Banana"));
    }
}