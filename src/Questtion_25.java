import java.util.Scanner;

public class Questtion_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        for(int i=0;i<n;i++){
            for(int space=0;space<n-i-1;space++){
                System.out.print("      ");
            }
            if(num>=10){
                for(int star=0;star<i*2+1;star++){
                    System.out.print(num++ +"    ");
                }
                System.out.println();
            }else{
                for(int star=0;star<i*2+1;star++){
                    System.out.print(num++ +"     ");
                }
                System.out.println();
            }

        }
    }
}