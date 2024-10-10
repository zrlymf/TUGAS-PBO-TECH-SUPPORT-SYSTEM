
public class SupportSystem {
    private Responder responder;
    private InputReader inputReader;

    public SupportSystem() {
        responder = new Responder();
        inputReader = new InputReader();
    }

    // Menjalankan sistem dukungan teknis
    public void start() {
        boolean finished = false;

        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");

        // Loop untuk menerima input pengguna hingga 'bye' diinputkan
        while (!finished) {
            String userInput = inputReader.getInput();

            if (userInput.equals("bye")) {
                finished = true;
            } else {
                String response = responder.generateResponse(userInput);
                System.out.println(response);
            }
        }

        System.out.println("Thank you for using the system. Goodbye!");
    }

    public static void main(String[] args) {
        SupportSystem supportSystem = new SupportSystem();
        supportSystem.start();
    }
}
