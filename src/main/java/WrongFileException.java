// Create a custom exception
public class WrongFileException extends Exception {
    @Override
    public String getMessage() {
        return "You choose the wrong file!";
    }
}
