import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("sayi giriniz"); 

            int number = scanner.nextInt();
            boolean isPrime = true;

            if(number==1){
                System.out.println("sayi asal degildir");
            }

            else if(number < 1){
                System.out.println("gecersiz sayi");
            }

            else{
                for(int i=2; i<number; i++){
                    if(number%i == 0){
                        isPrime=false;
                        break;
                    }
                }
                
                if(isPrime){
                    System.out.println("sayi asaldir");
                }
                else{
                    System.out.println("sayi asal degildir");
                }

            }
        }


    }
}
