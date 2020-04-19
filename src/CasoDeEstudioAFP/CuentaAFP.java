package CasoDeEstudioAFP;

public class CuentaAFP {

    private String nombre;
    private int edad;
    private String numeroDeIdentificacion;
    private char genero;
    private AFP afp;

    public CuentaAFP() {
        afp = new AFP();
    }

    public CuentaAFP(String nombre, int edad, String numeroDeIdentificacion, char genero, AFP afp) {
        setNombre(nombre);
        setEdad(edad);
        setNumeroDeIdentificacion(numeroDeIdentificacion);
        setGenero(genero);
        setAfp(afp);
    }

    public String getNumeroDeIdentificacion() {
        return numeroDeIdentificacion;
    }

    public void setNumeroDeIdentificacion(String numeroDeIdentificacion) {
        this.numeroDeIdentificacion = numeroDeIdentificacion;
    }
    

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    

    public char getGenero() {

        return genero;
    }

    public AFP getAfp() {
        return afp;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad >= 18) {
            this.edad = edad;
        } else {
            System.out.println("Debe de ser mayor de edad");
        }
    }

    

    public void setGenero(char genero) {
        if (genero == 'M' || genero == 'F') {
            this.genero = genero;
        } else {
            System.out.println("El genero debe de ser F o M");
        }
    }

    public void setAfp(AFP afp) {
        this.afp = afp;
    }

    @Override
    public String toString() {
        return "CuentaAFP{" + "nombre=" + getNombre() + ", edad=" + getEdad() + ", numeroDeIdentificacion=" + getNumeroDeIdentificacion() + ", genero=" + getGenero() + ", afp=" + afp.getAportesRealizados() + afp.getNumeroDeAfiliacion();
    }

}
