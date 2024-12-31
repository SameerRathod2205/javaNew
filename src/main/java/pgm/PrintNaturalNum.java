package pgm;

public class PrintNaturalNum {

    public static void printNaturalNumbers(int a){

        if(a==10){
            System.out.println(a);
            return;

        }

        System.out.println(a);
        a++;

        printNaturalNumbers(a);
    }

    public static void main(String[] args) {
        int a = 1;
        printNaturalNumbers(a);
    }
}
