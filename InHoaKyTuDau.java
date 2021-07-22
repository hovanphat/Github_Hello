public class InHoaKyTuDau {
    public static void main(String[] args){
        // Cách đã có sẵn chuỗi
        String name = "freetuts.net";
        System.out.println("------------------------------");
        System.out.println("Chuỗi ban đầu: "+name);
        //chuỗi firstLetter chứa chữ cái đầu tiên của  name
        String fistLetter = name.substring(0, 1);
        //chuỗi remainingLetters chứa phần còn lại của name
        String remainingLetter = name.substring(1, name.length());

        //sử dụng phương thức toUpperCase() để chuyển đổi firstLetter thành chữ in hoa
        fistLetter = fistLetter.toUpperCase();

        //sau khi chuyển đổi thì gộp chúng lại
        name = fistLetter + remainingLetter;
        System.out.println("Chuỗi sau khi đổi: "+name);
        System.out.println("------------------------------");


        // Cách có tham số truyền vào từ bàn phím
        // sử dụng class Scanner để nhận dữ liệu từ bàn phím
        // Scanner sc = new Scanner(System.in);
        // String message;
        // System.out.println("\n\nNhập vào chuỗi cần in hoa ký tự đầu: ");
        // message = sc.nextLine();
        // //khai báo một mảng, sau đó sử dụng phương thức toCharArray() 
        // //để chuyển đổi message thành một mảng kiểu char
        // char[] charArray = message.toCharArray();
        // boolean foundSpace = true;
        // //sử dụng vòng lặp for để duyệt các phần tử trong charArray
        // for(int i = 0; i < charArray.length; i++) {
        // // nếu phần tử trong mảng là một chữ cái
        // if(Character.isLetter(charArray[i])) {
        //     // kiểm tra khoảng trắng có trước chữ cái
        //     if(foundSpace) {
        //     //đổi chữ cái thành chữ in hoa bằng phương thức toUpperCase()
        //     charArray[i] = Character.toUpperCase(charArray[i]);
        //     foundSpace = false;
        //     }
        // }
        // else {
        //     foundSpace = true;
        // }
        // }
        // // chuyển đổi mảng char thành string
        // message = String.valueOf(charArray);
        // System.out.println("Chuỗi sau khi đổi: \n" + message);
    
        // System.out.println("\n---------------------------------");
    }
}
