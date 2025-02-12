import java.util.Scanner;

//Läser in - Skickar till Logic - skriver ut text Klassen
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logic converter = new Logic();
        converter.loadConversionLibrary();

        System.out.println("Vad vill du översätta? .- Blir A");
        String input = scanner.nextLine();

        try {
            converter.convert(input);
            System.out.println(converter.getOutput());
            System.out.println("Översätts till " + converter.getOutput());
            System.out.println(converter.dumpLib());

        }catch (Exception e){
            System.out.println("Oväntat fel!");
            System.out.println(e);

        }
    }
    /*
   Krav:
Skriv ett program som gör om morsekod till engelska och engelska till morsekod
Skriv programmet med minst en logikklass samt en klass som läser in text och skriver ut
text (med en main-metod).
Utveckla programmet i TDD och skriv minst 5 JUnit-testfall

*Logik-klass Utför konverteringen
**Main-klass läser in text - skickar till logik - Hämtar resultatet från logik
Test-klass Testa logikklassen med 5 testfall. Tips ENKLA saker, en bokstav, en morsekod
flera tecken, olika tecken. Testa felhanteringar i systemet. Stoppar vi in något som
inte ska vara i systemet så ska vi KANSKE få tomt svar eller felmeddelande

Skapa MINST två felhanteringar i systemet som hanterar två saker som användaren
kan göra som går utanför det vanliga användandet av systemet

Vi skriver Bokstäver med punkter bindestreck
Vi ska kunna göra åt båda hållen text > morsekod morsekod <text

Krav fortsättning:
Använd den internationella morsekoden (se slide 6)
för bokstäverna A till Z
* Korta och långa signaler ska representeras med
punkt (.) och bindestreck (-)
F = ..-.
Flera bokstäver skall gå att hantera men separation
av ord behöver inte hanteras
.... . . --- = HEJ
.... . .-.. .-.. --- .-- --- = HELLOWORLD
HELLO WORLD = .... . .-.. .-.. --- .-- --- .-. .-.. -..
*Vi behöver INTE seperation för ord!

Tips:
-Inläsning och utskrift av morsekod kan utföras med t.ex. Scanner och System.out.println
-Representationen av morsekoden kan sparas i vilken datastruktur du vill,
t.ex. en HashMap
-Metoden split i klassen String kan vara bra att använda för att dela upp den inlästa
morsekoden

Lämna in som en länk i "Ominway" med er textfil

    */
}
