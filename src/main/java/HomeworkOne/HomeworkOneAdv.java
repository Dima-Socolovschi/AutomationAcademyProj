package HomeworkOne;

public class HomeworkOneAdv {
    public static void main(String[] args) {
        comm();

        cake(2, 4);

        money(5);
    }

    public static void comm(){
        // \u000d System.out.println("I've been searching this for ages.");
    }

    public static void cake(int m, int n){
//        Variant 1
//        if(n%m == 0 || m%n == 0){
//            System.out.println(Math.max(m, n));
//        }
//        else{
//            System.out.println(n*m);
//        }

//        Variant 2
        int num = n;
        while (true){
            if(n%m == 0 || m%n == 0){
                System.out.println(Math.max(m, n));
                break;
            }
            else{
                if(num%m == 0){
                    System.out.println(num);
                    break;
                }
                else{
                    num++;
                }
            }
        }
    }

    public static void money(int x){
        System.out.println(x % 2 != 0 ? "2 " + (x + 2) : "0 0");
    }
}
