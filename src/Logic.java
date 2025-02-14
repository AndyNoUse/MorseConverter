import java.util.HashMap;

public class Logic {
    //Logik-klass Utför konverteringen
    private String input = "";
    private String output;
    private HashMap<String, String> mainLib = new HashMap<>();
    private HashMap<String, String> tempLib = new HashMap<>();

    public void loadConversionLibrary() {
        mainLib.put(" ", "");
        mainLib.put(".-", "A");
        mainLib.put("-...", "B");
        mainLib.put("-.-.", "C");
        mainLib.put("-..", "D");
        mainLib.put(".", "E");
        mainLib.put("..-.", "F");
        mainLib.put("--.", "G");
        mainLib.put("....", "H");
        mainLib.put("..", "I");
        mainLib.put(".---", "J");
        mainLib.put("-.-", "K");
        mainLib.put(".-..", "L");
        mainLib.put("--", "M");
        mainLib.put("-.", "N");
        mainLib.put("---", "O");
        mainLib.put(".--.", "P");
        mainLib.put("--.-", "Q");
        mainLib.put(".-.", "R");
        mainLib.put("...", "S");
        mainLib.put("-", "T");
        mainLib.put("..-", "U");
        mainLib.put("...-", "V");
        mainLib.put(".--", "W");
        mainLib.put("-..-", "X");
        mainLib.put("-.--", "Y");
        mainLib.put("--..", "Z");
        mainLib.put("-----", "0");
        mainLib.put(".----", "1");
        mainLib.put("..---", "2");
        mainLib.put("...--", "3");
        mainLib.put("....-", "4");
        mainLib.put(".....", "5");
        mainLib.put("-....", "6");
        mainLib.put("--...", "7");
        mainLib.put("---..", "8");
        mainLib.put("----.", "9");
        // key , value
        for (String key : mainLib.keySet()) {
            tempLib.put(mainLib.get(key), key); //Alla nycklar Temporary flip
        }
        mainLib.putAll(tempLib);
    }

    public String convert(String input) {
        try {
            output = "";
            this.input = input.toUpperCase();

            if (input.contains(".") || input.contains("-")) {   //Om det är Morsekod
                String[] morseSnippets = input.split(" ");
                for (String morseSnippet : morseSnippets) {
                    output = output.concat(mainLib.getOrDefault(morseSnippet, "missingChar"));
                }
            } else {    //Annars är det vanlig text
                char[] letters = this.input.toCharArray();
                for (char letter : letters) {
                    output = output.concat(mainLib.getOrDefault(String.valueOf(letter), "-1")+ " ");
                }
            }

        } catch (Exception e) {
            System.out.println("Något gick fel" + e);
        }
        return output.trim();
    }

    public String getOutput() {
        return output.trim();
    }

    public void convertEng(String letters) {
        this.input = letters;
    }

    public String dumpLib() {
        //   System.out.println("LetterLibrary" +letterLib);
        return mainLib.toString();
    }

    public String librarySize() {
        return mainLib.size() + "";
    }
}