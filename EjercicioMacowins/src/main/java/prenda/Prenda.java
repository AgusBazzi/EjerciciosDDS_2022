package prenda;

import prenda.estado.EstadoPrenda;

public class Prenda
{
    private TipoPrenda tipoPrenda;
    private Double precioInicial;
    private EstadoPrenda estadoPrenda;

    public Double calcularPrecio()
    {
        return this.estadoPrenda.calcularPrecio(this.precioInicial);
    }

   // Fingir que existen Getters, Setters y Constructor :)
}
