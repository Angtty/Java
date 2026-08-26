package org.example;

public class Venta {

    Cliente cliente;
    Productos productos;
    int cantidad;

    public Venta(Cliente cliente, Productos productos, int cantidad) {

        this.cliente = cliente;
        this.productos = productos;
        this.cantidad = cantidad;
    }

    public double calcularTotal() {
        double total = productos.precioProducto * cantidad;

        if (total > 5000){
            total = total -( total * 0.10);
        }
        return total;
        }

    public void mostrarDetalle (){
        System.out.println("-----VENTAS------");
        System.out.println("Nombre:" + cliente.nombreCliente);
        System.out.println("Producto:" + productos.nombreProducto);
        System.out.println("Precio individual:" + productos.precioProducto);
        System.out.println("Total a pagar:" + calcularTotal());

        }
    }





