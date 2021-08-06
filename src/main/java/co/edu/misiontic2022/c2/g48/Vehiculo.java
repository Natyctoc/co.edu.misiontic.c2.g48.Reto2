package co.edu.misiontic2022.c2.g48;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Vehiculo {

    protected String marca;

    protected String modelo;

    protected Double precioBase;

    public Vehiculo(String marca, String modelo, Double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    public abstract Double calcularPrecio();

    public abstract Double calcularPorcentajeImpuesto();

    public Double calcularDescuento(Date fecha) {
        Double descuento = 0d;
        var cal = GregorianCalendar.getInstance();
        cal.setTime(fecha);
        var mes = cal.get(Calendar.MONTH);
        switch (mes) {
            case Calendar.MAY:
            if (marca == "Mazda") {
                descuento += calcularPrecio() * 0.10;
            } break;
            case Calendar.JUNE:
            if (marca == "BMW") {
                if (this instanceof Automovil) {
                    descuento += calcularPrecio() * 0.05;
                } else {
                    descuento += calcularPrecio() * 0.10;
                } break;
            }
        }
        return descuento;
    }
}
