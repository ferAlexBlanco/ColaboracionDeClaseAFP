/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoDeEstudioAFP;


public class Prueba {
    
    
    public static void main(String[] args) {
        AFP afp1=new AFP(123456789,123,1230.50);
        AFP afp2=new AFP(147852369,5060,1300.85);
        AFP afp3=new AFP(159236478,560,1580.45);
        
        CuentaAFP afiliado1=new CuentaAFP("Fernando",20,"123456789",'F',afp1);
        CuentaAFP afiliado2=new CuentaAFP("Luis",20,"123456789",'M',afp2);
        CuentaAFP afiliado3=new CuentaAFP("Antonio",20,"123456789",'M',afp3);
        ReporteAfiliadosAlmacenados reportes=new ReporteAfiliadosAlmacenados(3);
        reportes.agregarAfiliado(afiliado1);
        reportes.agregarAfiliado(afiliado2);
        reportes.agregarAfiliado(afiliado3);
        reportes.listarAfiliados();
        
        System.out.println("----------------------------------");
        System.out.println("Numero de hombres y mujeres afiliadas");
        System.out.println("Mujeres " + reportes.obtenerGeneroMujer());
        System.out.println("Hombres " + reportes.obtenerGeneroHombre() );
        
    }
    
}
