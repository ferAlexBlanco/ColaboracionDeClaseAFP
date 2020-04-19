
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoDeEstudioAFP;

/**
 *
 * @author Fernando
 */
public class ReporteAfiliadosAlmacenados {
    private String nombre;
    private CuentaAFP[] cuentaAFP;
    private int cantidad=0;
    private int maximo;
    
    
    public ReporteAfiliadosAlmacenados(int largo){
        cuentaAFP=new CuentaAFP[largo];
        this.maximo=largo;
    }

    public String getNombre() {
        return nombre;
    }

    public CuentaAFP[] getCuentaAFP() {
        return cuentaAFP;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCuentaAFP(CuentaAFP[] cuentaAFP) {
        this.cuentaAFP = cuentaAFP;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }
    
    public void agregarAfiliado(CuentaAFP nuevoAfiliado){
        if(cantidad<maximo){
            cuentaAFP[cantidad]=nuevoAfiliado;
            cantidad=cantidad+1;
        }else{
            System.out.println("No hay capacidad");
        }
    }
    
    
    
    public void listarAfiliados(){
        for(CuentaAFP afiliados: cuentaAFP){
            System.out.println("-------------------------------");
            System.out.println("Nombre : " + afiliados.getNombre());
            System.out.println("Codigo de empleado : " + afiliados.getNumeroDeIdentificacion());
            System.out.println("Aportes Realizados " + afiliados.getAfp().getAportesRealizados());
            System.out.println("Estado de Cuenta " +afiliados.getAfp().getEstadoDeCuenta());
        }
    }
    
    public int obtenerGeneroMujer(){
        int contador=0;
        for(CuentaAFP tmpCuenta:cuentaAFP){
            if(tmpCuenta.getGenero()=='F'){
                contador=contador+1;
            }
        }
        return contador;
    }
    
    public int obtenerGeneroHombre(){
        int contador=0;
        for(CuentaAFP tmpCuenta:cuentaAFP){
            if(tmpCuenta.getGenero()=='M'){
                contador=contador+1;
            }
        }
        return contador;
    }
    
    
    
}
