import java.util.Scanner;

public class LaiXuat {
    public static void main(String[] args){
        float p ,t ,r, sinterest;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền gửi vào ngân hàng: ");
        p = sc.nextFloat();
        System.out.print("Nhập lãi xuất hàng năm (%): ");
        r = sc.nextFloat();
        System.out.print("Nhập vào thời gian gửi(năm): ");
        t= sc.nextFloat();
        sc.close();
        sinterest = (p*r*t)/100;
        System.out.println("Số tiền lãi là: " +sinterest);
    }
}
