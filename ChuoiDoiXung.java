import java.util.Scanner;

public class ChuoiDoiXung {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi muốn kiểm tra: ");
        String inputString = sc.nextLine();
        String reverseString = "";
        int lenght = inputString.length();
        for(int i = lenght - 1; i >=0; i--){
            reverseString = reverseString + inputString.charAt(i);
        }
        if (inputString.equals(reverseString))
            System.out.println("Đây là chuỗi đối xứng!");
        else
            System.out.println("Đây không phải là chuỗi đối xứng!");


        // Sử dụng Stack
        /*System.out.print("Nhập vào chuỗi bạn muốn kiểm tra:");
        Scanner in=new Scanner(System.in);
        String inputString = in.nextLine();
        Stack stack = new Stack();
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }
        String reverseString = "";
    
        while (!stack.isEmpty()) {
            reverseString = reverseString+stack.pop();
        }
        if (inputString.equals(reverseString))
            System.out.println("Đây là chuỗi đối xứng.");
        else
            System.out.println("Đây không phải là chuỗi đối xứng.");*/




        //Sử dụng Queue
        /*System.out.print("Nhập vào chuỗi cần kiểm tra:");
        Scanner in=new Scanner(System.in);
        String inputString = in.nextLine();
        Queue queue = new LinkedList();
        for (int i = inputString.length()-1; i >=0; i--) {
            queue.add(inputString.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString = reverseString+queue.remove();
        }
        if (inputString.equals(reverseString))
            System.out.println("Đây là chuỗi đối xứng.");
        else
            System.out.println("Đây không phải là chuỗi đối xứng.");*/
    }


}
