/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoDeEstudioAFP;

public class AFP {

    private int NumeroDeAfiliacion;
    private int AportesRealizados;
    private double EstadoDeCuenta;

    public AFP() {

    }

    public AFP(int NumeroDeAfiliacion, int AportesRealizados,double EstadoDeCuenta) {
        setNumeroDeAfiliacion(NumeroDeAfiliacion);
        setAportesRealizados(AportesRealizados);
        setEstadoDeCuenta(EstadoDeCuenta);
    }

    public double getEstadoDeCuenta() {
        return EstadoDeCuenta;
    }

    public void setEstadoDeCuenta(double EstadoDeCuenta) {
        this.EstadoDeCuenta = EstadoDeCuenta;
    }
    
    

    
    
    

    public int getNumeroDeAfiliacion() {
        return NumeroDeAfiliacion;
    }

    public void setNumeroDeAfiliacion(int NumeroDeAfiliacion) {
        String num;
        num = "" + NumeroDeAfiliacion;
        if (num.length() == 9) {
            this.NumeroDeAfiliacion = NumeroDeAfiliacion;

        }else{
            System.out.println("El numero de afiliacion debe contener 9 digitos");
        }

    }

    public int getAportesRealizados() {
        return AportesRealizados;
    }

    public void setAportesRealizados(int AportesRealizados) {
        this.AportesRealizados = AportesRealizados;
    }

    @Override
    public String toString() {
        return "AFP{" + "NumeroDeAfiliacion=" + getNumeroDeAfiliacion() + ", AportesRealizados=" + getAportesRealizados() + ", EstadoDeCuenta=" + getEstadoDeCuenta();
    }

}
