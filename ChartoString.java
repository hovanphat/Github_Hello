public class ChartoString {
    public static void main(String args[])
    {
        // Method 1: Using toString() method
        char ch = 'a';
        String str = Character.toString(ch);
        System.out.println("Chuỗi là: "+str);
        // Method 2: Using valueOf() method
        String str2 = String.valueOf(ch);
        System.out.println("Chuỗi là: "+str2);
    }
}
