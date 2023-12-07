package examen2;

public class Vehiculo {
    private String marca;
    private int ruedas;
}
// constructor
public Vehiculo(String marca, int ruedas){
    this.marca = marca;
    this.ruedas = ruedas;
}

public String getMarca(){
    return marca;
}

public String getRuedas(){
    return ruedas;
}

@Override
public String toString(){
    return String.format("Marca: %s%nRuedas: %d", getMarca(), getRuedas());
}