
package Main;
import Objetos.Automovil;
public class Ejecutar {
        public static void main(String[] args) {
        
        Automovil carro_1 = new Automovil("Ford", 2018, 3.0, "Diesel", "Ejecutivo",
                5, 6, 250, "Negro", 100);
        System.out.println(carro_1.toString());    
        carro_1.acelerar(20);
        carro_1.desacelerar(50);
        carro_1.desacelerar(100);
        carro_1.frenar();
        
    }

    
    
}
