package Level1;

public class EmptySaleException extends RuntimeException {
    public EmptySaleException() {
        super("Per fer una venda primer has d’afegir productes");
    }
}
