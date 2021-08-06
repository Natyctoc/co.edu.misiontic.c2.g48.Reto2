package co.edu.misiontic2022.c2.g48;

public class Automovil extends Vehiculo {


    private TipoTransmision transmision;
    
    private Boolean vidriosElectricos;

    private Boolean aireAcondicionado;

    public Automovil(String marca, String modelo, Double precioBase, 
    TipoTransmision transmision, Boolean vidriosElectricos, Boolean aireAcondicionado) {
        super(marca, modelo, precioBase);
        this.transmision = transmision;
        this.vidriosElectricos = vidriosElectricos;
        this.aireAcondicionado = aireAcondicionado;
    }

    public Boolean getAireAcondicionado() {
        return aireAcondicionado;
    }

    public Boolean setAireAcondicionado(Boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
        return aireAcondicionado;
    }

    public Boolean getVidriosElectricos() {
        return vidriosElectricos;
    }

    public Boolean setVidriosElectricos(Boolean vidriosElectricos) {
        this.vidriosElectricos = vidriosElectricos;
        return vidriosElectricos;
    }

    public Double calcularPrecio() {
        
        Double precioFinal = precioBase;

        if (transmision == TipoTransmision.AUTOMATICA) {
            precioFinal += (precioBase * 0.07d);
        } 
        if (vidriosElectricos == true) {
            precioFinal += 300_000d;
        } 
        if (aireAcondicionado == true) {
            precioFinal += 2_500_000d;
        }
        return precioFinal;
    }

    public Double calcularPorcentajeImpuesto() {
        Double precio = calcularPrecio();
        Double impuesto = 0d;
        if (precio > 80_000_000d) {
            impuesto = 19d;
        }
        return impuesto;
    }

    
}
