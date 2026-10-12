/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructuraDatos2026;

/**
 *
 * @author alumnog
 */
public class Producto2 {
    private String nombre;
    private double precio;
    private String marca;
    private int stock;

    public Producto2(){
        
    }
    
    public Producto2(String nombre, double precio, String marcas, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marcas;
        this.stock = stock;
    }
    
    @Override
    public String toString() {
        return "Producto2{" + "nombre=" + nombre + ", precio=" + precio + ", marcas=" + marca + ", stock=" + stock + '}';
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarcas() {
        return marca;
    }

    public void setMarcas(String marcas) {
        this.marca = marcas;
    }   
    
}
