public class Cuadrado {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado() {
        lado = 0;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double CalcularPerimetro() {
        return (lado * 4);
    }

    public double CalcularArea() {
        return (lado * lado);
    }
}