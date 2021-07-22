import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args){
        int year;
        System.out.print("Nhập số năm: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        sc.close();
        boolean isLeap = false;
        if(year %4 == 0){ // Nếu chia hết cho 4 là năm nhuận
            if(year %100 == 0){
                // Nếu vừa chia hết cho 4 và vừa chia hết cho 100 thì không phải là năm nhuận
                if(year % 400 == 0){//Nếu chia hết cho 400 là năm nhuận
                    isLeap = true;
                }else{
                    isLeap = false;
                }
            }
            else{
                isLeap = true;
            }
        }
        else{ 
            isLeap = false;
        }

        if(isLeap == true){
            System.out.println("LÀ NĂM NHUẬN");
        }
        else{
            System.out.println("KHÔNG PHẢI LÀ NĂM NHUẬN");
        }
    }
}
