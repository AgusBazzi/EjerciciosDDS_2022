package venta.metodoPago;

import venta.Sistema;

public class PagoTarjeta implements MetodoPago
{
    private Integer cantidadCuotas;

    public PagoTarjeta(Integer cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    @Override
    public Double calcularPrecio(Double precioInicial)
    {
        Double recargo;
        recargo = this.cantidadCuotas.doubleValue() * Sistema.getInstance().getCoeficienteTarjeta() + precioInicial * 0.01d;

        return precioInicial + recargo;
    }
}
