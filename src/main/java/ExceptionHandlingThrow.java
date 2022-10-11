import java.nio.file.FileAlreadyExistsException;

public class ExceptionHandlingThrow {
    public static void main(String[] args){

        try {
            getArrayItem();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        } catch (FileAlreadyExistsException e){
            // Do something else
            System.out.println("The file already exits.");
        }
        System.out.println("The program is still running");
    }

    private static String getArrayItem() throws ArrayIndexOutOfBoundsException, FileAlreadyExistsException {
        String[] strings = {"Hello", "World"};
        return strings[2];
    }
}
