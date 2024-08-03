import java.util.Scanner ;
public class Main{
    static int ch;
    static int a;
    static int b;
    public static void main(String[] args){
        System.out.print("Calculator\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulas\nType your choice:-");
        Scanner Si = new Scanner(System.in);
        ch = Si.nextInt();
        System.out.print("Enter your 1st number:-");
        a = Si.nextInt();
        System.out.print("Enter your 2nd number:-");
        b = Si.nextInt();
        switch (ch) {
            case 1:
                Addition();
                break;
            case 2:
                Subtraction();
            case 3:
                Multiplication();
            case 4:
                Division();
            case 5:
                Modulas();
            default:
                System.out.println("You have picked up the wrong choice");;
        }
    }
    static void Addition(){
        System.out.println(a+b);
    }
    static void Subtraction(){
        System.out.println(a-b);
    }
    static void Multiplication(){
        System.out.println(a*b);
    }
    static void Division(){
        System.out.println(a/b);
    }
    static void Modulas(){
        System.out.println(a%b);
    }
}