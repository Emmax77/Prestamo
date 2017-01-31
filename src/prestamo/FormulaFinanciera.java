/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import static java.lang.Integer.parseInt;
import static prestamo.Interfaz.texto1;
import static prestamo.Interfaz.texto2;
import static prestamo.Interfaz.texto3;
import static prestamo.Interfaz.texto4;

/**
 *
 * @author Emmanuel GR
 */
public class FormulaFinanciera {

    private double monto;
    private double tasa;
    private int periodos;
    private int limite;
    private double cuota;


    public double generarCuota(double monto, double tasaInteres, int periodos, int limite) {
        this.monto= monto;
        this.tasa = tasaInteres;
        this.periodos = periodos;
        this.limite= limite;
        this.cuota= 0.0;
        cuota = monto * tasa / (12 * 100) + monto / periodos;
        cuota = calcularCuota(monto, cuota, 1, limite);
        imprimirCuota(limite, cuota, 1, tasaInteres, 0.0, 0.0);
        return cuota;

    }

    private void imprimirCuota( int profundidad,Double cuota,int periodo, Double intereses, Double amortizacion, Double nuevoSaldo) {
        String texto = "";
        texto += "Profundidad =" +( String.valueOf(profundidad)+"  ").substring(0,3);
        texto += " Periodo=" + ( String.valueOf(periodo)+"  ").substring(0,3);
        texto += " Cuota=" + String.valueOf(cuota).substring(0,6);
        texto += " Intereses=" + (String.valueOf(intereses)+"000000000").substring(0,6);
        texto += " Amortizacion=" + (String.valueOf(amortizacion)+"000000000").substring(0,8);
        texto += " NuevoSaldo=" + (String.valueOf(nuevoSaldo)+"000000000").substring(0,8);
        System.out.println(texto);
    }
    private void imprimirNuevaCuota ( int profundidad, Double nuevoSaldo, Double cuota, Double nuevaCuota) {
        String texto = "";
        String direccion = ">>>>";
        if ( nuevoSaldo < 0 ) {
            direccion = "<<<<";
        }
     texto += direccion + "Calculo de nueva cuota ";
     texto += " Profundidad =" +(String.valueOf(profundidad)+"  ").substring(0,3);
     texto += " Cuota="+ String.valueOf(cuota).substring(0,6);
     texto += " Nueva Cuota="+ String.valueOf(nuevaCuota).substring(0,6);
     texto += " Diferencia="+ String.valueOf( Math.abs(nuevaCuota-cuota)).substring(0,6);
     System.out.println(texto);
    }
    
    public Double calcularCuota (Double saldo, Double cuota, int periodo, int profundidad ){
        double intereses = saldo * tasa / 1200;
        double amortizacion = cuota - intereses;
        double nuevoSaldo = saldo - amortizacion;
        imprimirCuota(profundidad,cuota,periodo,intereses,amortizacion,nuevoSaldo);
        
        if (nuevoSaldo > 0 && periodo < this.periodos ){
           return calcularCuota(nuevoSaldo,cuota,periodo+1,profundidad);
        }
        return cuota;
    }
    
    public static void main(String[] args) {
        FormulaFinanciera fn = new FormulaFinanciera();
        fn.generarCuota(10000.0, 0.10, 12, 1);
    }
}
