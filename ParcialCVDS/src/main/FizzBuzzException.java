package main;

public class FizzBuzzException extends  Exception{
    public static final String INVALID_PARAMETERS = "Los parametros son invalidos, presencia de negativo";
    public FizzBuzzException(String mensaje){
        super(mensaje);
    }
}
