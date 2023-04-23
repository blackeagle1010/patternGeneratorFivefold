import java.util.Scanner;
public class patternGenerator {
    public static void pattern1(int number, int temp) {
        if (number > 0) {
            System.out.print(number + " ");
            pattern1(number - 5, temp);
        }else if (number <= 0) {
            pattern2(number, temp);
        }
    }
    public static void pattern2(int number, int temp) {
        if (temp >= number) {
            System.out.print(number + " ");
            pattern2(number + 5, temp);
        }
    }
    public static void main(String[] args) {
        int number, temp;
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number: ");
        number = input.nextInt();
        temp = number;
        pattern1(number, temp);
    }
}
