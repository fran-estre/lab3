public class Movimiento {
    public void Rotar(Persona persona){
        do {
            persona.setPosicion(persona.siguientePosicion());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }while (persona.getPosicion()!= Posicion.STANDING);

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
