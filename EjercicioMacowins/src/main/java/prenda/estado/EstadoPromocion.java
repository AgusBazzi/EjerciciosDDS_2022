package prenda.estado;

public class EstadoPromocion implements EstadoPrenda
{
    private Double dineroRestado;

    public EstadoPromocion(Double dineroRestado)
    {
        this.dineroRestado = dineroRestado;
    }

    @Override
    public Double calcularPrecio(Double precioInicial)
    {
        return precioInicial - this.dineroRestado;
    }

    // Fingir que existen el Getter y Setter
}
