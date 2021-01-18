public class Persona {
    private String nombre;
    private TipoPersona tipoPersona;
    private Mano manoIzquierda = new Mano();
    private Mano manoDerecha = new Mano();
    private Posicion posicion = Posicion.STANDING;
    private Pie pieIzquierdo = new Pie();
    private Pie pieDerecho = new Pie();


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoPersona getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(TipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public Mano getManoDerecha() {
        return manoDerecha;
    }

    public void setManoDerecha(Mano manoDerecha) {
        this.manoDerecha = manoDerecha;
    }

    public Mano getManoIzquierda() {
        return manoIzquierda;
    }

    public void setManoIzquierda(Mano manoIzquierda) {
        this.manoIzquierda = manoIzquierda;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public String hacerGesto(Mano mano){
        return mano.hacerGestolado();
    }
    public String movimientoSuave(Mano mano){
        return mano.movimientoSuave();
    }

    public Pie getPieDerecho() {
        return pieDerecho;
    }

    public void setPieDerecho(Pie pieDerecho) {
        this.pieDerecho = pieDerecho;
    }

    public Pie getPieIzquierdo() {
        return pieIzquierdo;
    }

    public void setPieIzquierdo(Pie pieIzquierdo) {
        this.pieIzquierdo = pieIzquierdo;
    }

    public String volarHaciaElTecho(){
        return "it's flying to the roof";
    }
    public void patear(IPateable pateable, IPateador pateador){
        System.out.println("I'm kicking  " + pateable.mePatearon(pateador));
    }

    public Posicion siguientePosicion(){
        Posicion posicionActual = getPosicion();

        if (posicionActual ==Posicion.STANDING) {
            return Posicion.TILTEDLEFT;
        }
        else if(posicionActual ==Posicion.TILTEDLEFT) {
            return Posicion.HEAD;
        }
        else if(posicionActual ==Posicion.HEAD) {
            return Posicion.INCLINEDRIGHT;
        }
        else{
            return  Posicion.STANDING;
        }
    }

    @Override
    public String toString() {
        return "my name is"+this.nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Persona){
            return ((Persona)obj).nombre == this.nombre;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.nombre.hashCode();
    }
}

