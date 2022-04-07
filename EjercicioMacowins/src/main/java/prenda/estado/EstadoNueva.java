package prenda.estado;

public class EstadoNueva implements EstadoPrenda
{
    @Override
    public Double calcularPrecio(Double precioInicial)
    {
        return precioInicial;
    }

}
