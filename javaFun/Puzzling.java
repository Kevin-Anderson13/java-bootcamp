import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Puzzling {
    public static void main (Sting[] args) {
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for(char ch = 'a'; ch <= 'z'; ++ch) {
            alphabet.add(ch);
        }
        
        int randomNum = r.nextInt(26);
        System.out.println(alphabet);
        Collections.shuffle(alphabet);
        System.out.println(alphabet);
        System.out.println(alphabet);
        System.out.println(alphabet.get(randomNum));
        
    }
}