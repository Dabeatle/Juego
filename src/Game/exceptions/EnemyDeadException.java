package Game.exceptions;

public class EnemyDeadException extends Exception {

    public EnemyDeadException() {

        super("El Enemigo recibió un overkill");
    }
}