
/**
 * UC7 – Store Character Pattern in a Class
 * Refactored to use CharacterPattern class
 * for better encapsulation and scalability.
 *
 * @author YourName
 * @version 7.0
 */

import java.util.HashMap;
import java.util.Map;

public class OopsBannerApp {

    // Static Inner Class
    static class CharacterPattern {

        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        Map<Character, CharacterPattern> patternMap = initializePatterns();

        printBanner("OOPS", patternMap);
    }

    // Initialize character patterns
    public static Map<Character, CharacterPattern> initializePatterns() {

        Map<Character, CharacterPattern> map = new HashMap<>();

        map.put('O', new CharacterPattern('O', new String[] {
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        }));

        map.put('P', new CharacterPattern('P', new String[] {
                " ******* ",
                " *     * ",
                " *     * ",
                " ******* ",
                " *       ",
                " *       ",
                " *       "
        }));

        map.put('S', new CharacterPattern('S', new String[] {
                " ******* ",
                " *       ",
                " *       ",
                " ******* ",
                "       * ",
                "       * ",
                " ******* "
        }));

        return map;
    }

    // Print banner dynamically
    public static void printBanner(String text, Map<Character, CharacterPattern> map) {

        int height = 7;

        for (int row = 0; row < height; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : text.toCharArray()) {

                CharacterPattern cp = map.get(ch);

                if (cp != null) {
                    lineBuilder.append(cp.getPattern()[row]).append("   ");
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }
}