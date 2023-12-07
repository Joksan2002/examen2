package examen2;

public class Conductor {
    private String nombre;
    private String id;
}

public Conductor(String nombre, String id){
    this.nombre = nombre;
    this.id = id;
}

public String getNombre(){
    return nombre;
}

public String getId(){
    return id;
}

@Override
public String toString(){
    return String.format("Nombre: %s%nIdent: %s", getNombre(), getId());
}