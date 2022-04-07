package venta;

import venta.metodoPago.MetodoPago;

import java.util.Date;
import java.util.List;

public class Venta
{
    private List<PrendaVendida> prendasVendidas;
    private Date fecha;
    private MetodoPago metodoPago;

    public Double calcularPrecio()
    {
        Double precioBase =
                prendasVendidas
                .stream()
                .mapToDouble(PrendaVendida::calcularPrecio).sum();

        return this.metodoPago.calcularPrecio(precioBase);
    }

    public Date getFecha() {
        return fecha;
    }
}
