import java.util.Scanner;

public class ChuThuongThanhHoa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String message;
        System.out.println("-------------------------------");
        System.out.print("Nhập chuỗi cần in hoa: ");
        message = sc.nextLine();
        System.out.println("Chuỗi sau khi in hoa: "+message.toUpperCase());
        System.out.println("-------------------------------");
        
    }
}
