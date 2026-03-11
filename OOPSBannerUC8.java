import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC8 {

    // Function to render banner
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int height = patternMap.get(word.charAt(0)).length;

        for (int i = 0; i < height; i++) {

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[i] + "  ");
                }

            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        });

        patternMap.put('P', new String[]{
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    "
        });

        patternMap.put('S', new String[]{
                " SSS ",
                "S    ",
                " SSS ",
                "    S",
                " SSS "
        });

        String bannerWord = "OOPS";

        renderBanner(bannerWord, patternMap);
    }
}
