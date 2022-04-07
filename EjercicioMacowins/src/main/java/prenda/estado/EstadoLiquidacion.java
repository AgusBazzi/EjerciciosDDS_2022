package prenda.estado;

public class EstadoLiquidacion implements EstadoPrenda
{
    private Double porcentajeFinal;

    public EstadoLiquidacion()
    {
        this.porcentajeFinal = 0.5d;
    }

    @Override
    public Double calcularPrecio(Double precioInicial)
    {
        return precioInicial * this.porcentajeFinal;
    }

}
