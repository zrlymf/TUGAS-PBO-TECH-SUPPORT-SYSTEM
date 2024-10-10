import java.util.HashMap;
import java.util.Random;

public class Responder {
    private HashMap<String, String> responseMap;
    private Random random;

    public Responder() {
        responseMap = new HashMap<>();
        random = new Random();
        fillResponses();
    }

    // Mengisi respons berdasarkan kata kunci
    private void fillResponses() {
        responseMap.put("file", "It sounds like you have trouble with files. Can you specify the issue?");
        responseMap.put("crash", "Oh no! The system is crashing. Have you tried restarting?");
        responseMap.put("slow", "A slow system can be frustrating. You might want to check your internet connection.");
        responseMap.put("error", "Errors can be tricky. Please provide the exact error message.");
    }

    // Menghasilkan respons berdasarkan input pengguna
    public String generateResponse(String input) {
        for (String key : responseMap.keySet()) {
            if (input.contains(key)) {
                return responseMap.get(key);
            }
        }
        return "That sounds interesting. Tell me more...";
    }
}
