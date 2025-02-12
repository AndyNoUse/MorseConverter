import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MorseTest {
    /*
    Test-klass Testa logikklassen med 5 testfall. Tips ENKLA saker, en bokstav, en morsekod
flera tecken, olika tecken. Testa felhanteringar i systemet. Stoppar vi in något som
inte ska vara i systemet så ska vi KANSKE få tomt svar eller felmeddelande
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
        converter.convert(".... . .-.. .-.. ---  .-- --- .-. .-.. -..");
        converter.getOutput();
        assertEquals("Hello world", converter.getOutput());
    }
    @Test
    public void morseToHelloWorld() {
        Logic converter = new Logic();
        converter.loadConversionLibrary();
        converter.convert("Hello world");
        converter.getOutput();
        assertEquals(".... . .-.. .-.. ---  .-- --- .-. .-.. -..", converter.getOutput());
    }

    @Test
    public void dumpLibrary() {
        Logic converter = new Logic();
        converter.loadConversionLibrary();
     //   assertEquals("", converter.dumpLib());
        System.out.println();
        assertEquals("72", converter.librarySize());
    }
}

