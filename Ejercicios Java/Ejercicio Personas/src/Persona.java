public class Persona {
    private String Nombre, Sexo;
    private int Edad, Documento;
    private double Peso, Altura;

    public Persona() {
        this.Nombre = "";
        this.Edad = 0;
        this.Documento = 0;
        this.Sexo = "H";
        this.Peso = 0;
        this.Altura = 0;
    }

    public Persona(String Nombre, int Edad, int Documento, String Sexo, double Peso, double Altura) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Documento = Documento;
        this.Sexo = Sexo;
        this.Peso = Peso;
        this.Altura = Altura;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
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

    public int calcularIMC() {
        int retorno = 0;
        double imc = Peso / (Altura * Altura);
        if (imc < 20) {
            retorno = -1;
        }
        if (imc >= 20 && imc <= 25) {
            retorno = 0;
        }
        if (imc > 25) {
            retorno = 1;
        }
        return retorno;
    }

    public boolean esMayorDeEdad() {
        boolean mayedad = false;
        if (Edad >= 18) {
            mayedad = true;
        } else {
            mayedad = false;
        }
        return mayedad;
    }

    public boolean comprobarSexo(String Sexo) {
        boolean compSexo = false;
        if (this.Sexo.equals(Sexo)) {
            compSexo = true;
        } else {
            compSexo = false;
        }
        return compSexo;
    }

    public String toString() {
        return "Nombre: " + Nombre + ", Documento: " + Documento + ", Edad: " + Edad + ", Sexo: " + Sexo + ", Peso: "
                + Peso + ", Altura: " + Altura;
    }
}