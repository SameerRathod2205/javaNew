package pgm;

public class PrintOddNumber {

    public static void printOddNumber(int odd){

        if(odd>10){
            return;
        }

        System.out.println(odd);
        odd=odd+2;

        printOddNumber(odd);

    }

    public static void main(String[] args) {
        printOddNumber(1);
    }
}
