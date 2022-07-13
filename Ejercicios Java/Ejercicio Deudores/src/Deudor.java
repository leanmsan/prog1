public class Deudor {
    private String Apellido, Nombre, ApellidoCotitular, NombreCotitular;
    private int añoDeuda, ncuotas;
    private double Dni, DniCotitular, MontoAdeudado, deudaActual;

    public Deudor() {
        this.Dni = 0;
        this.Apellido = "";
        this.Nombre = "";
        this.DniCotitular = 0;
        this.ApellidoCotitular = "";
        this.NombreCotitular = "";
        this.MontoAdeudado = 0;
        this.añoDeuda = 0;
    }

    public Deudor(double Dni, String Apellido, String Nombre, double DniCotitular, String ApellidoCotitular,
            String NombreCotitular, double MontoAdeudado, int añoDeuda) {
        this.Dni = Dni;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.DniCotitular = DniCotitular;
        this.ApellidoCotitular = ApellidoCotitular;
        this.NombreCotitular = NombreCotitular;
        this.MontoAdeudado = MontoAdeudado;
        this.añoDeuda = añoDeuda;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidoCotitular() {
        return ApellidoCotitular;
    }

    public void setApellidoCotitular(String apellidoCotitular) {
        ApellidoCotitular = apellidoCotitular;
    }

    public String getNombreCotitular() {
        return NombreCotitular;
    }

    public void setNombreCotitular(String nombreCotitular) {
        NombreCotitular = nombreCotitular;
    }

    public int getAñoDeuda() {
        return añoDeuda;
    }

    public void setAñoDeuda(int añoDeuda) {
        this.añoDeuda = añoDeuda;
    }

    public double getDni() {
        return Dni;
    }

    public void setDni(double dni) {
        Dni = dni;
    }

    public double getDniCotitular() {
        return DniCotitular;
    }

    public void setDniCotitular(double dniCotitular) {
        DniCotitular = dniCotitular;
    }

    public double getMontoAdeudado() {
        return MontoAdeudado;
    }

    public void setMontoAdeudado(double montoAdeudado) {
        MontoAdeudado = montoAdeudado;
    }

    public double calcularDeudaActual() {
        int años = 2022 - añoDeuda;
        double deudaActual = MontoAdeudado;
        if (años != 0) {
            for (int i = 1; i <= años; i++) {
                deudaActual = MontoAdeudado * 1.21;
            }
        } else {
            deudaActual = MontoAdeudado;
        }
        return deudaActual;
    }

    public double getDeudaActual() {
        return deudaActual;
    }

    public void setDeudaActual(double deudaActual) {
        this.deudaActual = deudaActual;
    }

    public double calcularPlanDePagos(int ncuotas, double deudaActual) {
        this.ncuotas = ncuotas;
        this.deudaActual = deudaActual;
        double cuotas = 0;
        if (ncuotas < 3) {
            cuotas = deudaActual / ncuotas;
        }
        if (ncuotas <= 6 && ncuotas >= 4) {
            cuotas = (deudaActual * 1.10) / ncuotas;
        }
        if (ncuotas <= 12 && ncuotas >= 7) {
            cuotas = (deudaActual * 1.19) / ncuotas;
        }
        return cuotas;
    }

    public void CambiarCotitular(double DniCotitular, String ApellidoCotitular, String NombreCotitular) {
        this.DniCotitular = DniCotitular;
        this.ApellidoCotitular = ApellidoCotitular;
        this.NombreCotitular = NombreCotitular;
    }

    public String toStringDeudor() {
        return "Deudor Apellido: " + Apellido + ", Nombre: " + Nombre + ", Dni: " + Dni;
    }

    public String toStringCoDeudor() {
        return "Apellido del Cotitular: " + ApellidoCotitular + ", Nombre del Cotitular: " + NombreCotitular
                + ", Dni del Cotitular:" + DniCotitular;
    }

    public String toString() {
        return "Deudor Apellido: " + Apellido + ", Nombre: " + Nombre + ", Dni: " + Dni + ", ApellidoCotitular: "
                + ApellidoCotitular + ", DniCotitular: " + DniCotitular + ", NombreCotitular: " + NombreCotitular
                + ", añoDeuda:" + añoDeuda + ", MontoAdeudado:" + MontoAdeudado;
    }

}