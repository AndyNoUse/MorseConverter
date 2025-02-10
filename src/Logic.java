import java.util.HashMap;
import java.util.Map;

public class Logic {
    //Logik-klass Utför konverteringen
    private String input = "";
    private String output = "";
    private HashMap<String, String> morseLib = new HashMap<>();
    private HashMap<String, String> letterLib = new HashMap<>();

    public void loadConversionLibrary() {
        morseLib.put(".-", "A");
        morseLib.put("-...", "B");
        morseLib.put("-.-.", "C");
        morseLib.put("-..", "D");
        morseLib.put(".", "E");
        morseLib.put("..-.", "F");
        morseLib.put("--.", "G");
        morseLib.put("....", "H");
        morseLib.put("..", "I");
        morseLib.put(".---", "J");
        morseLib.put("--", "M");
        morseLib.put("-.", "N");
        morseLib.put("---", "O");
        morseLib.put(".--.", "P");
        morseLib.put("--.-", "Q");
        morseLib.put(".-.", "R");
        morseLib.put("...", "S");
        morseLib.put("-", "T");
        morseLib.put("..-", "U");
        morseLib.put("...-", "V");
        morseLib.put(".--", "W");
        morseLib.put("-..-", "X");
        morseLib.put("-.--", "Y");
        morseLib.put("--..", "Z");
        morseLib.put("-----", "0");
        morseLib.put(".----", "1");
        morseLib.put("..---", "2");
        morseLib.put("...--", "3");
        morseLib.put("....-", "4");
        morseLib.put(".....", "5");
        morseLib.put("-....", "6");
        morseLib.put("--...", "7");
        morseLib.put("---..", "8");
        morseLib.put("----.", "9");
        // key , value
        for (Map.Entry<String, String> entry : morseLib.entrySet()){
            letterLib.put(entry.getValue(), entry.getKey());
        }
    }


    public void convertMorse(String input) {
        this.input = input;
        output = morseLib.get(input);
    }

    public String getOutput() {
        return output;
    }

    public void convertEng(String letters) {
        this.input = letters;
    }

    public Object dumpLib() {
        for (String i : morseLib.keySet()) {
            return("key: " + i + " value: " + morseLib.get(i));
        }
        return "Shit";
    }
}
//public static void main(String[] args) {
//            HashMap<String, String> simpsons = new HashMap<>(); //Kan skriva String, String i den nya diamanten
////Gör inte det för att vi redan fattar det???
//            Scanner scan = new Scanner(System.in);
//
//            simpsons.put("Homer", "D'oh");
//            simpsons.put("Marge", "Mmm~mmmmmm");
//            simpsons.put("Bart", "Ay, caramba");
//            simpsons.put("Lisa", "If anyone wants me, I'll be in my room.");
//            simpsons.put("Maggie", "(Pacifier Suck)");
//            simpsons.put("Ned", "Hi-Diddily-Ho!");
//            simpsons.put("Burns", "Excellent!");
//            simpsons.put("Edna", "Ha!");
//            simpsons.put("Chalmers", "SEEEEEYYYYMOOUURRR");
//            simpsons.put("Apu", "Thank You, Come Again!");
//            simpsons.put("Stu", "Disco Stu likes disco music");
//            for (int i = 0; i < 5; i++) {
//                String name = scan.nextLine();
//                System.out.println(simpsons.get(name));