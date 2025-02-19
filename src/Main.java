import java.util.Scanner;
//Ett program som gör om morsekod till engelska och engelska till morsekod
//Läser in - Skickar till Logic - skriver ut text Klassen
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logic converter = new Logic();
        converter.loadConversionLibrary();

        while (true) {
            System.out.print("Skriv vad du vill översätta från/till morsekod:");
            String input = scanner.nextLine();

            try {
                converter.convert(input);
                if (input.equalsIgnoreCase("stop"))
                    break;

                System.out.println("Översattes till: " + converter.getOutput());
                System.out.println("\nSkriv stop för att avsluta");



            }catch (Exception e){
                System.out.println("Oväntat fel!");
                System.out.println(e);

            }
        }

    }
    /*
   Krav:
Skriv ett program som gör om morsekod till engelska och engelska till morsekod X
Skriv programmet med minst en logikklass samt en klass som läser in text och skriver ut X
text (med en main-metod).X
Utveckla programmet i TDD och skriv minst 5 JUnit-testfall

*Logik-klass Utför konverteringen X
**Main-klass läser in text - skickar till logik - Hämtar resultatet från logik X
Test-klass Testa logikklassen med 5 testfall. Tips ENKLA saker, en bokstavX, en morsekodX
flera teckenX, olika tecken.
Testa felhanteringar i systemet. Stoppar vi in något som
inte ska vara i systemet så ska vi KANSKE få tomt svar eller felmeddelande

Skapa MINST två felhanteringar i systemet som hanterar två saker som användaren
kan göra som går utanför det vanliga användandet av systemet

XVi skriver Bokstäver med punkter bindestreck
XVi ska kunna göra åt båda hållen text > morsekod morsekod <text

Krav fortsättning:
Använd den internationella morsekoden (se slide 6)
för bokstäverna A till ZX
* Korta och långa signaler ska representeras med
punkt (.) och bindestreck (-)X
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
