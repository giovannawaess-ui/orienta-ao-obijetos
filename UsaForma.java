public class UsaForma{
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(15, 9);
        Circunferencia circunferencia = new Circunferencia(9);
        Triangulo triangulo = new Triangulo(19.0, 4.0, 7.0);
        
        System.out.println("triangulo:" + triangulo.area());
        System.out.println("retangulo:" + retangulo.area() + ", perimero retangulo:" + retangulo.perimetro());
        System.out.println("circunferencia:" + circunferencia.area());
    }
}