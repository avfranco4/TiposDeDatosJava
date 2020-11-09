/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos.de.datos.java;

/**
 *
 * @author Asus
 */
public class TiposDeDatosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
            
        System.out.println("Progrma de tipo de datos, operadores y expresiones java");
        
        //Tipos operadores y expresiones - Enteros
        
        int num1 = 15;
        int num2 = 20;
        int num3 = num1 + num2;
        System.out.println("el valor de num3 es: " +num3);
        //Tipos operadores y expresiones - Decimal
        double dec1 = 0.10;
        double dec2 = 0.25;
        double dec3 = dec1 * dec2;
        System.out.println("el valor de dec3 es: " +dec3);
        
        char letra1 = 'A';
        char letra2 = 'B';
        System.out.println("el valor de letra3 es: " +letra1 + letra2);
        
        //Tipo, operadores y expresiones - String
        System.out.println("-----");
        
        String nombre, apellido, domicilio, telefono;
        
               
        //inicializar String
        nombre = "Anthony";
        apellido = "Franco";
        domicilio = "Catamyo";
        telefono = "073026992";    
        
        System.out.println("mi nombre es: " +nombre);
        System.out.println("mi apellido es: " +apellido);
        System.out.println("mi domicilio es: " +domicilio);
        System.out.println("mi telefono es: " +telefono);
        System.out.println("\n");
        System.out.println("Me llamo " +nombre+" "+apellido+", vivo en " +domicilio+", y mi telefono es " +telefono+"\n");
        
        System.out.println("**Presentar en una sola linea***");
        
        System.out.println("Me llamo" +nombre+" "+apellido+
                ", vivo en " +domicilio+ ", y mi telefono es " 
                +telefono+"\n");
        System.out.println("**Presentar contatenando variables de tipo string***\n");
        System.out.println("Me llamo". concat(nombre).concat(apellido).concat("y vivo en").concat(domicilio).concat("y mi telefono es").concat(telefono));
    }
    
}
