public class Homework {

    public static void main(String[] args) {
        System.out.println(checkSum(5, 15));
        positiveNum(-5);
        System.out.println(isNumNeg(80));
        repeat("Hello", 4);
        System.out.println(leapYear(2008));
    }

    static boolean checkSum(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static void positiveNum(int a) {
        if(a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    static boolean isNumNeg(int a){
        return a < 0;
    }

    static void repeat(String name, int n){
        for(int i = 0; i < n; i++){
            System.out.println(name);
        }
    }

    static boolean leapYear(int year) {
        return year % 100 != 0 || year % 4 == 0 && year % 400 == 0;
    }
}
