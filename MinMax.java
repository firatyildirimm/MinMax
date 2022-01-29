import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,currentNumber;
        int max = 0, min = 0;

        System.out.println("How many numbers will you enter?");
        number = input.nextInt();

        for(int i=1;i<=number;i++){
            System.out.println(i + ". number");
            currentNumber = input.nextInt();
            if(i == 1 ) {
                min = currentNumber;
                max = currentNumber;
            }
            if(i!=1){
                if(currentNumber>max){
                    max=currentNumber;
                }
                if(currentNumber<min){
                    min=currentNumber;
                }

            }
        }
        System.out.println("Min = "+min);
        System.out.println("Max = "+max);


    }
}
