package venta.metodoPago;

public class PagoEfectivo implements MetodoPago
{
    @Override
    public Double calcularPrecio(Double precioInicial)
    {
        return precioInicial;
    }
}
