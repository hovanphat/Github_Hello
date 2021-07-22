import java.util.Scanner;

public class SoChanLe {
    public static void main(String[] args){
        int n;
        System.out.print("Nhap so n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n%2 == 0){
            System.out.println(n + " La so chan");
        }
        else{
            System.out.println(n + " La so le");
        }
    }
}
