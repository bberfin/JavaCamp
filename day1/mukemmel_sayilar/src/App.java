import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("sayi gir:");
            int number= scanner.nextInt();
            int total=0;

            for(int i=1; i<number; i++){
                if(number % i == 0){
                    total=total+i;
                }
            }

            if(total == number){
                System.out.println("mükemmel sayidir");
            }
            else{
                System.out.println("mükemmel sayi degildir");
            }
        }

    }
}
