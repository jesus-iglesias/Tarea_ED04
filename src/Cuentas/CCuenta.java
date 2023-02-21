package Cuentas;

/**
 * Clase que simula una cuenta bancaria
 * @author jeged
 */
public class CCuenta {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
/**
 * Atributos de la clase
 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

/**
 * Constructor vacío
 */
    public CCuenta() {
    }
/**
 * Constructor con parámetros
 * @param nom
 * @param cue
 * @param sal
 * @param tipo 
 */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
/**
 * 
 * @return saldo
 */
    public double estado() {
        return getSaldo();
    }
/**
 * 
 * @param cantidad
 * @throws Exception en caso de ingresar cantidad negativa
 */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }
/**
 * 
 * @param cantidad
 * @throws Exception en caso de retirar cantidad negativa o superior al saldo
 */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }
}
