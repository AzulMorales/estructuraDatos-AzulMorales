/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EstructuraDeDatos2026.Listas;

/**
 *
 * @author alumnog
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEnlazada listaAlumnos = new ListaEnlazada();
        
        listaAlumnos.agregarInicio("Juanito");
        listaAlumnos.agregarInicio("Maria");
        listaAlumnos.agregarFinal("Lupita");
        listaAlumnos.agregarFinal("Carlos");
        
        System.out.println("tamaño: "+ listaAlumnos.cantidadNodos());
        listaAlumnos.mostrarLista();
    }
    
}
