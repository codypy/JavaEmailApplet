package emailapp;

public class EmailApp {
    
    public static void main(final String[] args) {
        final Email em1 = new Email("John", "Smith");
        System.out.println(em1.showInfo());
    }

}