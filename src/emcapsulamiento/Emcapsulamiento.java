/*
Realizar un logaritmo que me permita ingresar por teclado el sistema, el mosdulo,
la clase de objeto, sus atributos y sus servicios.
 */
package emcapsulamiento;

/**
 *
 * @author Aguaiza Quimbita Jonathan Fabricio
 */
import java.util.Scanner;
public class Emcapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner(System.in);
                //new, reserva espacio de memoria
        
        System.out.println("Ingrese el sistema:");
        String sis=objeto.nextLine();
        /*
        Predicción de la serie de tiempo de velocidad del vehículo usando red neuronal
        */
        System.out.println("Ingrese modulo:");
        String mod=objeto.nextLine();
        /*
        Velocidad del vehículo
        */
        System.out.println("Ingrese clase de objeto:");
        String cla=objeto.nextLine();
        /*
        velocidad_salida
        */
        System.out.println("Ingrese primer atributo:");
        String atr1=objeto.nextLine();
        /*
        aceleracion
        */
        System.out.println("Ingrese segundo atributo:");
        String atr2=objeto.nextLine();
        /*
        rpm bajas
        */
        System.out.println("Ingrese tercer atributo:");
        String atr3=objeto.nextLine();
        /*
        rpm altas
        */
        System.out.println("Ingrese cuarto atributo:");
        String atr4=objeto.nextLine();
        /*
        tiempo velocidad
        */
        System.out.println("Ingrese quinto atributo:");
        String atr5=objeto.nextLine();
        /*
        serie tiempo 
        */
        System.out.println("Ingrese primer servicio:");
        String ser1=objeto.nextLine();
        /*
        aceleracion fuerte
        */
        System.out.println("Ingrese segundo servicio:");
        String ser2=objeto.nextLine();
        /*
        1000 rpm
        */
        System.out.println("Ingrese tercer servicio:");
        String ser3=objeto.nextLine();
        /*
        4000 rpm
        */
        System.out.println("Ingrese cuarto servicio:");
        String ser4=objeto.nextLine();
        /*
        de 0 a 100 en 5 segundos
        */
        System.out.println("Ingrese quinto servicio:");
        String ser5=objeto.nextLine();
        /*
        de 10 segundos
        */
        
        System.out.println("            UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("NOMBRE: AGUAIZA JONATHAN                   Carrera: Ing Automotriz");
        System.out.println("");
        System.out.println("Sistema");
        System.out.println(""+sis);
        System.out.println("Modulo");
        System.out.println(""+mod);
        System.out.println("Clase de objeto");
        System.out.println(""+cla);
        System.out.println("");
        System.out.println("Atributos");
        System.out.println("1.-"+atr1);
        System.out.println("2.-"+atr2);
        System.out.println("3.-"+atr3);
        System.out.println("4.-"+atr4);
        System.out.println("5.-"+atr5);
        System.out.println("");
        System.out.println("Servicio:");
        System.out.println("1.- DEterminar aceleracion:");
        System.out.println(""+ser1);
        System.out.println("2.- Identificar rpm bajas");
        System.out.println(""+ser2);
        System.out.println("3.- Identificar rpm altas");
        System.out.println(""+ser3);
        System.out.println("2.- Describir tiempo velocidad");
        System.out.println(""+ser4);
        System.out.println("3.- Verificar serie tiempo");
        System.out.println(""+ser5);
    }
    
}
