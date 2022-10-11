public class ExceptionHandling {
    public static void main(String[] args){
        String[] strings = {"Hello", "World"};
        try{
            System.out.println(strings[2]);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        }
        System.out.println("The program is still running");
    }
}
