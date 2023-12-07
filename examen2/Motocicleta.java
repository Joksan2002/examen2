package examen2;

public class Motocicleta extends Vehiculo {
    private int cilindrada;
    private String modelo;
}

public Motocicleta(String marca, String ruedas, int cilindrada, String modelo){
    super(marca, ruedas);

    this.modelo = modelo;
    if (cilindrada < 0.0)
        throw new IllegalArgumentException("Cilindrada incorrecta");

        this.cilindrada = cilindrada;
}

public String getModelo(){
    return modelo;
}

public int getCilindro(){
    return cilindrada;
}

@Override
public String toString(){
    return String.format("Vehiculo: %s%nModelo: %s%nCilindrada: %d"
    , super.toString(), getModelo(), getCilindro());
}