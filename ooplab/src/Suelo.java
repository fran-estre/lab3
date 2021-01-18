public class Suelo implements IPateable {


    @Override
    public String mePatearon(IPateador pateador) {
        return "they kicked the ground with " + pateador.nombre();
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
