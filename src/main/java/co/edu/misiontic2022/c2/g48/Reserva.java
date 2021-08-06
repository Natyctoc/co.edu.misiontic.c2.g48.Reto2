package co.edu.misiontic2022.c2.g48;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reserva {

    private List<Vehiculo> vehiculos;

    private Date fecha;

    private String cliente;

    public Reserva(Date fecha, String cliente) {
        this.fecha = fecha;
        this.cliente = cliente;
        vehiculos = new ArrayList<>();
    }

    public String getCliente() {
        return cliente;
    }

    public void adicionarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public Object calcularCantidadVehiculos() {
        return vehiculos.size();
    }

    public Double calcularSubtotal() {
        Double subtotal = 0d;
        for (Vehiculo vehiculo : vehiculos) {
            subtotal += vehiculo.calcularPrecio();
        }
        return subtotal;
    }

    public Double calcularDescuentos() {
        Double descuento = 0d;
        for (Vehiculo vehiculo : vehiculos) {
            descuento += vehiculo.calcularDescuento(fecha);
        }
        return descuento;
    }

    public Double calcularImpuestos() {
        Double impuesto = 0d;
        for (Vehiculo vehiculo : vehiculos) {
            impuesto += (vehiculo.calcularPrecio() - vehiculo.calcularDescuento(fecha)) *
            (vehiculo.calcularPorcentajeImpuesto() /100);
        }
        return impuesto;
    }

    public Double calcularTotal() {
        return calcularSubtotal() -calcularDescuentos() +calcularImpuestos();
    }

}
