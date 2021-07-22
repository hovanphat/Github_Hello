import java.util.Scanner;

public class CongHaiSo {
    public static void main(String[] args){
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so num1: ");
        num1 = sc.nextInt();
        System.out.println();
        System.out.print("Nhap so num2: ");
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println();
        System.out.println("Tong la: " +sum);

    }
}
