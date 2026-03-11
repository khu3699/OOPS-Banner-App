public class OOPSBannerUC6 {

    // Helper method for O
    static String[] buildO() {
        return new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        };
    }

    // Helper method for P
    static String[] buildP() {
        return new String[]{
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    "
        };
    }

    // Helper method for S
    static String[] buildS() {
        return new String[]{
                " SSS ",
                "S    ",
                " SSS ",
                "    S",
                " SSS "
        };
    }

    public static void main(String[] args) {

        String bannerWord = "OOPS";

        String[] patternO = buildO();
        String[] patternP = buildP();
        String[] patternS = buildS();

        int height = patternO.length;

        for (int i = 0; i < height; i++) {

            for (char ch : bannerWord.toCharArray()) {

                if (ch == 'O')
                    System.out.print(patternO[i] + "  ");

                else if (ch == 'P')
                    System.out.print(patternP[i] + "  ");

                else if (ch == 'S')
                    System.out.print(patternS[i] + "  ");
            }

            System.out.println();
        }
    }
}
