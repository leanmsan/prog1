public class Persona {
    private String Nombre;
    private int Edad;
    private int Documento;
    private String Sexo;
    private double Peso;
    private double Altura;
    boolean mayedad = false;

    public Persona() {
        Nombre = "";
        Edad = 0;
        Documento = 0;
        Sexo = "H";
        Peso = 0;
        Altura = 0;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public int getDocumento() {
        return Documento;
    }

    public void setDocumento(int documento) {
        Documento = documento;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    public double calcularIMC() {
        double imc = 0;
        return imc;
    }

    public boolean esMayorDeEdad() {
        if (Edad >= 18) {
            mayedad = true;
        } else {
            mayedad = false;
        }
        return mayedad;
    }
}