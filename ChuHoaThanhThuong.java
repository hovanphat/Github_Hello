import java.util.Scanner;

public class ChuHoaThanhThuong {
    public static void main(String[] args){
        String message;
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.print("Nhập chuỗi: ");
        message = sc.nextLine();
        System.out.println("Chuỗi sau khi chuyển: "+message.toLowerCase());
        System.out.println("------------------------------------------");
    }
}
