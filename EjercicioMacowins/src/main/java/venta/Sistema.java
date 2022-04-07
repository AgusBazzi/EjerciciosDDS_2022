package venta;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class Sistema
{
    private List<Venta> ventas;
    private Double coeficienteTarjeta;

    // --- Singleton --- //
    private static Sistema instance = null;

    public static Sistema getInstance()
    {
        if(instance == null)
        {
            instance = new Sistema();
            instance.ventas = new ArrayList<>();
        }
        return instance;
    }
    // --- Fin Singleton --- //

    public Double calcularGananciasDeFecha(Date unaFecha)
    {
        Stream<Venta> ventasDeLaFecha =
                this
                .ventas
                .stream()
                .filter(venta -> venta.getFecha().equals(unaFecha));

        return ventasDeLaFecha.mapToDouble(Venta::calcularPrecio).sum();
    }

    public Double getCoeficienteTarjeta() {
        return coeficienteTarjeta;
    }

}
