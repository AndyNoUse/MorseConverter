import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MorseTest {
    /*

A .-
B -...
C -.-.
D -..
E .
F ..-.
G --.
H ....
I ..
J .---
K -.-
L .-..
M --
N -.
O ---
P .--.
Q --.-
R .-.
S ...
T -
U ..-
V ...-
W .--
X -..-
Y -.--
Z --..
----- 0 -----
.---- 1 .----
..--- 2 ..---
...-- 3 ...--
....- 4 ....-
..... 5 .....
-.... 6 -....
--... 7 --...
---.. 8 ---..
----. 9 ----.
     */
    @Test
    public void convertToA() {
        Logic converter = new Logic();
        converter.loadConversionLibrary();
        converter.convert(".-");
        converter.getOutput();
        assertEquals("A", converter.getOutput());
    }

    @Test
    public void convertToC() {
        Logic converter = new Logic();
        converter.loadConversionLibrary();
        converter.convert("-.-.");
        converter.getOutput();
        assertEquals("C", converter.getOutput());
    }

    @Test
    public void convertTo9() {
        Logic converter = new Logic();
        converter.loadConversionLibrary();
        converter.convert("----.");
        converter.getOutput();
        assertEquals("9", converter.getOutput());
    }

    @Test
    public void convertToZ() {
        Logic converter = new Logic();
        converter.loadConversionLibrary();
        converter.convert("--..");
        converter.getOutput();
        assertEquals("Z", converter.getOutput());
    }

    @Test
    public void letterAToMorse() {
        Logic converter = new Logic();
        converter.loadConversionLibrary();
        converter.convert("A");
        converter.getOutput();
        assertEquals(".-", converter.getOutput());
    }

    @Test
    public void helloWorldToMorse() {
        Logic converter = new Logic();
        converter.loadConversionLibrary();
        converter.convert("HELloWORLD");
        assertEquals(".... . .-.. .-.. --- .-- --- .-. .-.. -..", converter.getOutput());
    }
    @Test
    public void hejToMorse() {
        Logic converter = new Logic();
        converter.loadConversionLibrary();
        converter.convert("Hej");
        assertEquals(".... . .---", converter.getOutput());
    }
    @Test
    public void morseToHelloWorld() {
        Logic converter = new Logic();
        converter.loadConversionLibrary();
        converter.convert(".... . .-.. .-.. --- .-- --- .-. .-.. -..");
        assertEquals("HELLOWORLD", converter.getOutput());
    }

    @Test
    public void dumpLibrary() {
        Logic converter = new Logic();
        converter.loadConversionLibrary();
     //   assertEquals("", converter.dumpLib());
        System.out.println(converter.dumpLib());  //36 A-Z och 0-9. Mellanslag +1
        assertEquals("74", converter.librarySize());
    }
    @Test
    public void felhanteringAvSvensktAlfabet() {
        Logic converter = new Logic();
        converter.loadConversionLibrary();
        converter.convert("Smörgåsräkmacka");
        assertEquals("... -- -1 .-. --. -1 ... .-. -1 -.- -- .- -.-. -.- .-", converter.getOutput());
    }
    @Test
    public void felhanteringStop() {
        Logic converter = new Logic();
        converter.loadConversionLibrary();
        converter.convert("stop");
        converter.convert("hej");
        assertEquals(".... . .---", converter.getOutput());
    }
    @Test
    public void felhanteringAvOgiltigaTecken() {
        Logic converter = new Logic();
        converter.loadConversionLibrary();
        converter.convert("<^");
        assertEquals("-1 -1", converter.getOutput());
    }
    @Test
    public void hurHanterasCombo() {
        Logic converter = new Logic();
        converter.loadConversionLibrary();
        converter.convert("80-procentig");
        assertEquals("-1", converter.getOutput());
    }

}

