package venta;

import prenda.Prenda;

public class PrendaVendida
{
    private Prenda prendaAsociada;
    private Integer cantidadVendida;

    // Fingir que existen Getters, Setters y Constructor

    public Double calcularPrecio()
    {
        return this.prendaAsociada.calcularPrecio() * this.cantidadVendida.doubleValue();
    }
}
