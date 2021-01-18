import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
public class Principal {
    public static void main() throws InterruptedException {
        Persona persona = new Persona();
        persona.setNombre("Znayka");
        System.out.println("my name is " +persona.getNombre());
        persona.setTipoPersona(TipoPersona.Man);
        String huevo =persona.hacerGesto(persona.getManoIzquierda());
        System.out.println(huevo);
        persona.setPosicion(Posicion.HEAD);
        Movimiento movimiento = new Movimiento();
        movimiento.Rotar(persona);
        persona.getPosicion();
        persona.patear(new Suelo(),persona.getPieDerecho());
        List<Persona> todos =new ArrayList<>();
        todos.add(new Persona());
        todos.add(new Persona());
        for (Persona actual:todos) {
            actual.movimientoSuave(actual.getManoIzquierda());
        }
        System.out.println(persona.volarHaciaElTecho());
    }
}
