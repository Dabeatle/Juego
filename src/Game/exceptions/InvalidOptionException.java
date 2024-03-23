package Game.exceptions;

public class InvalidOptionException extends Exception {

    public InvalidOptionException() {

        super("La opción ingresada no es válida");
    }
}