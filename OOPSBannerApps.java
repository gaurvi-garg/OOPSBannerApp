import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApps {

    public static void main(String[] args) {

        String word = "OOPS";

        String[] banner = CharacterPatternMap.buildBanner(word);

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Represents a single character and its pattern
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

    // Stores and manages all character patterns
    static class CharacterPatternMap {

        private static final Map<Character, CharacterPattern> patternMap = new HashMap<>();

        static {
            patternMap.put('O', new CharacterPattern('O', new String[]{
                    "  OOO  ",
                    " O   O ",
                    " O   O ",
                    " O   O ",
                    " O   O ",
                    "  OOO  ",
                    "       "
            }));

            patternMap.put('P', new CharacterPattern('P', new String[]{
                    " PPPP  ",
                    " P   P ",
                    " PPPP  ",
                    " P     ",
                    " P     ",
                    " P     ",
                    "       "
            }));

            patternMap.put('S', new CharacterPattern('S', new String[]{
                    "  SSSS ",
                    " S     ",
                    "  SSS  ",
                    "     S ",
                    "     S ",
                    " SSSS  ",
                    "       "
            }));
        }

        public static String[] buildBanner(String word) {

            int height = 7;
            String[] output = new String[height];

            for (int i = 0; i < height; i++) {
                StringBuilder lineBuilder = new StringBuilder();

                for (char ch : word.toCharArray()) {
                    CharacterPattern pattern = patternMap.get(ch);
                    if (pattern != null) {
                        lineBuilder.append(pattern.getPattern()[i]).append("  ");
                    }
                }

                output[i] = lineBuilder.toString();
            }

            return output;
        }
    }
}

