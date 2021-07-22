import java.util.Scanner;

public class CheckNguyenAm {
    public static void main(String[] args){
        boolean isVowel = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kí tự cần kiểm tra: ");
        char ch = sc.next().charAt(0);
        sc.close();
        switch(ch){
            case 'a':
            case 'o':
            case 'i':
            case 'e':
            case 'u':
            case 'A':
            case 'I':
            case 'O':
            case 'U':
            case 'E': isVowel = true;
        }
        if(isVowel == true){
            System.out.println(ch+" Là nguyên âm");
        }else{
            if((ch>='a' && ch <= 'z') || (ch >= 'A' && ch<= 'Z')){
                System.out.println(ch+" Không phải là nguyên âm");
            }
            System.out.println("Không nằm trong bảng chữ cái");
        }
    }

}
