public class OOPSBannerUC5 {

    public static void main(String[] args) {

        // Array declaration + initialization in one step
        String[] banner = {

            String.join("  ", "O   O", "OOO", "PPPP", "SSSS"),
            String.join("  ", "O   O", "O   O", "P   P", "S"),
            String.join("  ", "O   O", "O   O", "PPPP", "SSS"),
            String.join("  ", "O   O", "O   O", "P", "S"),
            String.join("  ", " OOO ", "OOO", "P", "SSS")

        };

        // Loop to print banner
        for(String line : banner) {
            System.out.println(line);
        }
    }
}
