package HomeworkOne;

public class HomeworkOne {
    public static void main(String[] args) {

        System.out.println(substract(0,3));
        System.out.println(tempConv(10));
        isOdd(4);

    }
    public static Integer substract(int num1, int num2){
        return num2 <= 0 ? null : num1/num2 ;
    }

    public static double tempConv(int temCel){
        return (temCel * 9.0/5.0) + 32;
    }

    public static void isOdd(double number){
        System.out.println(number%2 == 0 ? "Number is even" : "Number is odd.");
    }
}
