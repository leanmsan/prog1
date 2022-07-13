public class Triangulo {
    private double lado1, lado2, base;
    private double altura;
    public Triangulo () {
        lado1 = 0;
        lado2 = 0;
        base = 0;
        altura = 0;
    }
    public Triangulo (double lado1, double lado2, double base) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
    }
    public void setLado (double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public void setBase (double base) {
        this.base = base;
    }
    public void setAltura (double altura) {
        this.altura = altura;
    }
    public double CalcularPerimetro () {
        double perimetro = lado1 + lado2 + base;
        return (perimetro);
    }
    public double CalcularArea () {
        double area = (base * altura)/2;
        return (area);
    }
}