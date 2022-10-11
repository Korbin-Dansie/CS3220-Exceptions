import java.io.IOException;

public class CustomExceptoin {
    public static void main(String[] args) throws IOException {

        try {
            String fileContents = MyFileReader.readFile("file1.txt");

            // Our own custom excpetion if file contents wrong
            if(fileContents.equals("This IS the file you were looking for.")){
                System.out.println("Everything is awesome!");
            }
            else {
                throw(new WrongFileException());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (WrongFileException e) {
            System.out.println(e.getMessage());
        }

    }
}
