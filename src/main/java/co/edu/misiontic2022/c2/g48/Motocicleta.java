package co.edu.misiontic2022.c2.g48;

public class Motocicleta extends Vehiculo {
    
    private Integer cilindraje;

    public Motocicleta(String marca, String modelo, Double precioBase, int cilindraje) {
        super(marca, modelo, precioBase);
        this.cilindraje = cilindraje;
    }

    public Double calcularPrecio() {
        
        Double precio = precioBase;
        if ((cilindraje >= 150) && (cilindraje <= 300)) {
            precio = precioBase + 400000d;
        } else if ((cilindraje > 300) && (cilindraje <= 600)) {
            precio = precioBase + 800000d;
        } else if (cilindraje > 600) {
            precio = precioBase + 1200000d;
        }
        return precio;
    }

    public Double calcularPorcentajeImpuesto() {
        Double precio = calcularPrecio();
        Double impuesto = 0d;
        if (precio > 6_100_000d) {
            impuesto = 19d;
        }
        return impuesto;
    }

    public void adicionarVehiculo(Reserva reserva) {
    }
}
