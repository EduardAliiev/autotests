package lessonworks;

public class CountHowManyEven {
    public static void main(String[] args){
        int evenNumbers = 0;
        for (int i = 0; i < 21; i++) {
            System.out.print(" " + i);
            if (i% 2 == 0) evenNumbers++;
        }
        System.out.println("\n" + "Total in an array of " + evenNumbers + " even numbers!");
    }
}
