import java.util.HashMap;
import java.util.Map;

public class OopsBannerApp {
    public static void main(String[] args) {
        Map<Character, String[]> patternMap = initializePatternMap();
        renderBanner("OOPS", patternMap);
    }

    public static Map<Character, String[]> initializePatternMap() {
        Map<Character, String[]> map = new HashMap<>();
        map.put('O', new String[] {
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        });
        map.put('P', new String[] {
                " ******* ",
                " *     * ",
                " *     * ",
                " ******* ",
                " *       ",
                " *       ",
                " *       "
        });
        map.put('S', new String[] {
                " ******* ",
                " *       ",
                " *       ",
                " ******* ",
                "       * ",
                "       * ",
                " ******* "
        });
        return map;
    }

    public static void renderBanner(String text, Map<Character, String[]> map) {
        int height = 7;
        for (int row = 0; row < height; row++) {
            StringBuilder lineBuilder = new StringBuilder();
            for (char ch : text.toCharArray()) {
                String[] pattern = map.get(ch);
                if (pattern != null) {
                    lineBuilder.append(pattern[row]).append("   ");
                }
            }
            System.out.println(lineBuilder.toString());
        }
    }
}