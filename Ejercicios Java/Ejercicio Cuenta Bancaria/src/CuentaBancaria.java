public class CuentaBancaria {
    private boolean EsCuentaCorriente;
    private int NroCuenta, Dni;
    private String Apellido, Nombre;
    private double Saldo;

    public CuentaBancaria() {
        this.NroCuenta = 0;
        this.Dni = 0;
        this.Apellido = "";
        this.Nombre = "";
        this.Saldo = 0;
        this.EsCuentaCorriente = false;
    }

    public CuentaBancaria(int NroCuenta, int Dni, String Apellido, String Nombre, double Saldo, boolean EsCuentaCorriente) {
        this.NroCuenta = NroCuenta;
        this.Dni = Dni;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.Saldo = Saldo;
        this.EsCuentaCorriente = EsCuentaCorriente;
    }

    public boolean isEsCuentaCorriente() {
        return EsCuentaCorriente;
    }

    public void setEsCuentaCorriente(boolean EsCuentaCorriente) {
        this.EsCuentaCorriente = EsCuentaCorriente;
    }

    public int getNroCuenta() {
        return NroCuenta;
    }

    public void setNroCuenta(int NroCuenta) {
        this.NroCuenta = NroCuenta;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public String DatosTitular() {
        return "Apellido: " + Apellido + ", Nombre: " + Nombre + ". Dni: " + Dni;
    }

    public String DatosCuenta() {
        String tipoCuenta;
        if (EsCuentaCorriente == false) {
            tipoCuenta = "Caja de Ahorro";
        } else {
            tipoCuenta = "Cuenta Corriente";
        }
        return "Numero de cuenta: " + NroCuenta + ". Tipo de Cuenta: " + tipoCuenta
                + "\n" + "Apellido y Nombre del Titular: " + Apellido + ", " + Nombre + ". Dni: " + Dni;
    }

    public void Deposito(double MontoDeposito) {
        Saldo = Saldo + MontoDeposito;
    }

    public boolean Extraccion(double MontoExtraccion) {
        boolean ExtraccionExitosa;
        if (EsCuentaCorriente == true) {
            if ((Saldo - MontoExtraccion) > -10000) {
                Saldo = Saldo - MontoExtraccion;
                ExtraccionExitosa = true;
            } else {
                ExtraccionExitosa = false;
            }
        } else {
            if ((Saldo - MontoExtraccion) > 0) {
                Saldo = Saldo - MontoExtraccion;
                ExtraccionExitosa = true;
            } else {
                ExtraccionExitosa = false;
            }
        }
        return ExtraccionExitosa;
    }
}