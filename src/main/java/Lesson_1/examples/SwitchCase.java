package Lesson_1.examples;

public class SwitchCase {
    public static void main(String[] args){
        int x = 4;
        int y = 0;
        char t= '/';
        switch (t) {
            case '+':
                System.out.println("Monday");
                break;
            case '-':
                System.out.println("Tuesday");
                break;
            case '*':
                System.out.println("Wednesday");
                break;
            case '/':
                if(y != 0){System.out.println(x/y);}
                else System.out.println("на ноль делить нельзя");
                break;
        }
    }
}
