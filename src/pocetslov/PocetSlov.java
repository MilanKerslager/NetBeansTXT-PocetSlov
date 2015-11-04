// Spočti počet slov ve vstupu (větě).
// Podle https://cs.wikipedia.org/wiki/Slovo je slovo
// alespoň třípísmenné.

package pocetslov;

import java.util.Scanner;

public class PocetSlov {

    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        System.out.print("Vlož větu: ");
        String věta = vstup.nextLine();
        int početslov = 0;
        int délkaslova = 0;
        for (int i=0; i<věta.length(); i++) {
            if (Character.isLetter(věta.charAt(i))) {
                délkaslova++;
            } else {
                if (délkaslova>=3) {
                    početslov++;
                }
                délkaslova=0;
            }
        }
        if (délkaslova>=3) {
            početslov++;
        }
        System.out.println("Počet slov: "+početslov);
    }
    
}
