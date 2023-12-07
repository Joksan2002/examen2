package examen2;

public class Turismo extends Vehiculo {
    private int puertas;
    private int velocidadmax;
}

public Turismo(String marca, String ruedas, int puertas, int velocidadmax){
    super(marca, ruedas);
    if (puertas < 0.0)
        throw new IllegalArgumentException("Numero de puertas incorrecta");

        this.puertas = puertas;

    if (velocidadmax < 0.0)
        throw new IllegalArgumentException("Velocidad incorrecta");

        this.velocidadmax = velocidadmax;
}

public int getPuertas(){
    return puertas;
}


public int getCilindro(){
    return cilindrada;
}

@Override
public String toString(){
    return String.format("Vehiculo: %s%n# Puertas: %d%nVelocidad max: %d"
    , super.toString(), getPuertas(), getCilindro());
}
