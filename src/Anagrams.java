import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by gaffs on 22/04/17.
 */
public class Anagrams {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String [] arrayOfWords = line.split(" ");
        for (String word : arrayOfWords) {
            System.out.print(swapChars(word) + " ");
        }

    }

    public static String swapChars (String line) {

        int lineLength = line.length() - 1;
        char [] arrayOfChars = line.toCharArray();

        for (int i = 0; i < lineLength; i++) {
            if (Character.isAlphabetic(arrayOfChars[i])) {
                if (Character.isAlphabetic(arrayOfChars[lineLength])) {
                    char buffer = arrayOfChars[i];
                    arrayOfChars[i] = arrayOfChars[lineLength];
                    arrayOfChars[lineLength] = buffer;
                    lineLength--;
                } else {
                    while (!(Character.isAlphabetic(arrayOfChars[lineLength])) && lineLength != i) {
                        lineLength--;
                    }
                    if (lineLength != i) {
                        char buffer = arrayOfChars[i];
                        arrayOfChars[i] = arrayOfChars[lineLength];
                        arrayOfChars[lineLength] = buffer;
                        lineLength--;
                    }
                }
            } else continue;
        }

        line = "";
        for (int i = 0; i < arrayOfChars.length; i++) {
            line += arrayOfChars[i];
        }

        return line;
    }
}
