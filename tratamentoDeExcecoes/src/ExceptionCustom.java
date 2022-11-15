public class ExceptionCustom extends Exception {

    private int numerado;
    private int denominado;
    
    ExceptionCustom(String  message, int numerado, int denominado){
        super(message);
        this.numerado = numerado;
        this.denominado = denominado;
    }
}
