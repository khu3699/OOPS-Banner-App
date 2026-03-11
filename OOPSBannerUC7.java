import java.util.ArrayList;
import java.util.List;

public class OOPSBannerUC7 {

    // Static inner class to store character pattern
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
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

    // Method to find pattern for a character
    public static String[] getPatternForChar(char ch, List<CharacterPatternMap> list) {

        for (CharacterPatternMap map : list) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        return null;
    }

    public static void main(String[] args) {

        List<CharacterPatternMap> patternList = new ArrayList<>();

        patternList.add(new CharacterPatternMap('O', new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        }));

        patternList.add(new CharacterPatternMap('P', new String[]{
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    "
        }));

        patternList.add(new CharacterPatternMap('S', new String[]{
                " SSS ",
                "S    ",
                " SSS ",
                "    S",
                " SSS "
        }));

        String bannerWord = "OOPS";

        int height = patternList.get(0).getPattern().length;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : bannerWord.toCharArray()) {

                String[] pattern = getPatternForChar(ch, patternList);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }
}
