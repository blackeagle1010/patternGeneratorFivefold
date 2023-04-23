import java.util.Scanner;
public class exponentialCountRecursiveMethod {
    static void exponentialCount(){
        int result=1;
        Scanner Inp=new Scanner(System.in);
        System.out.println("enter base number:");
        int base=Inp.nextInt();
        System.out.println("enter power number:");
        int expo=Inp.nextInt();

        for (int i=1; i<=expo; i++) {
            result *= base;
        }
        System.out.println("result is:" +result);
    }
    public static void main (String[] args){
        exponentialCount();
    }
}



