package orientacaoObjeto.src.ExPOOawariDesafio09;

public class Dias {
    private int data;
    private boolean feriado;

    public Dias ( int data, boolean feriado){
        this.data = data;
        this.feriado = feriado;
    }

    public int getData(){
        return data;
    }
    public boolean getFeriado(){
        return feriado;
    }

}
