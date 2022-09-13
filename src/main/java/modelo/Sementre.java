package modelo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Sementre {
    int id;
    String nombre;
    public static List<Sementre> listaSementres = new ArrayList<>();
}
