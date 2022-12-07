/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package pooej4;

import Entidades.Rectangulo;

/**
 *
 * @author Mile
 */
public class POOEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangulo r1 = new Rectangulo();
        r1 = r1.crearRectangulo();
        
        int base = r1.getBase();
        int altura = r1.getAltura();
        
        int p = r1.perimetro();
        int s = r1.superficie();
        
        System.out.println(r1.toString() + "Superficie=" + s + "Perimetro=" + p);
        
        dibujarRec(base, altura);
        
    }
    
    public static void dibujarRec(int base, int altura){
        
        for (int i = 0; i < altura; i++){
            for (int j = 0; j < base; j++){
                
                System.out.print("*");                                     
            }
            
            System.out.println("");
        }
                  
    }
    
}
