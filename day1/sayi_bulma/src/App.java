import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int[] sayilar = new int[]{1,2,5,7,9,0};

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("aradigin sayiyi gir:");
            int aranacak = scanner.nextInt();

            boolean varMi = false;

            for(int sayi : sayilar){
                if(sayi == aranacak){
                    varMi = true;
                    break;
                }
            }

            if(varMi){
                System.out.println("sayi mevcuttur");
            }
            else{
                System.out.println("sayi mevcut degildir");
            }
        }

    }
}
