public class ComplexNumber {
    double real, img;
    ComplexNumber(double r, double i){
        this.img = i;
        this.real = r;
    }
    public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2){
        ComplexNumber tmp = new ComplexNumber(0,0);
        tmp.real = c1.real + c2.real;
        tmp.img = c1.img + c2.img;
        return tmp;
    }
    public static void main(String[] args){
        ComplexNumber c1 = new ComplexNumber(5.2, 4.4);
        ComplexNumber c2 = new ComplexNumber(2.0, 7.3);
        ComplexNumber tmp = sum(c1, c2);
        System.out.println("Ket qua " + tmp.real+ " + " + tmp.img + "i");
    }
}
