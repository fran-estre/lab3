public class Mano extends Extremidad{

    public String hacerGestolado(){
        return "he gestured aside with his hand";
    }
    public String movimientoSuave(){
       return "made a smooth movement";
    }

    @Override
    public String toString() {
        return "I am" + getNombre() ;
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
