public class XoaKhoangTrong{
    public static void main(String[] args){
        String sentence = "F   re et     u  t  s.n et";
        System.out.print("Chuỗi ban đầu: "+sentence);
        sentence = sentence.replaceAll(" ", "");
        System.out.println();
        System.out.print("Chuỗi sau khi xóa: "+sentence);
    }
}