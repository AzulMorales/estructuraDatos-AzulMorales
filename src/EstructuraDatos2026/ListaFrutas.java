/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EstructuraDatos2026;
import java.util.ArrayList;

/**
 *
 * @author alumnog
 */
public class ListaFrutas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ArrayList se utiliza para< listas
        ArrayList<String> lista = new ArrayList<>();
        
        // add(valor): agregar un elemento al final
        lista.add("Manzana");
        lista.add("fresa");
        lista.add("Mango");
        lista.add("Durazno");
        //add(index, valor): agregar un elemnto en cualquier posicion
        lista.add(2, "Pera");
        
        // get(): obtener un elemnto segun su indice
        System.out.println("fruta: " + lista.get(1));
        
        //set():cambiar el valor de un elemento
        lista.set(2, "Mango Manila");
        
        // remove(): quita el elemento por indice o por objeto
        lista.remove(3);
        lista.remove("Pera");
        System.out.println(lista);
        
        if (lista.contains("fresa")){
            System.out.println("Si hay fresa!!!!!!");
        }else{
            System.out.println("No hay fresa....");
        }
        //size() tamaño del el arraylist
        System.out.println("Hay " + lista.size()+ " frutas");
        // empty(): hay elementos en el array list
        System.out.println(lista.isEmpty());
        
        //foreach
        for(String fruta : lista){
            System.out.println(fruta);
        }
        //foreach moderno
        lista.forEach((f)->{System.out.println(f);} );
        //for clasico
        for(int i=0; i< lista.size(); i++){
            System.out.println(lista.get(i));
        }
        // clear() limpia el arraylist
//        lista.clear();
        
        
        
        
    }
    
}
