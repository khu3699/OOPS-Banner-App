public class OOPSBannerUC4 {

    public static void main(String[] args) {

        // Array to store banner lines
        String[] banner = new String[5];

        banner[0] = String.join("  ", "O   O", "OOO", "PPPP", "SSSS");
        banner[1] = String.join("  ", "O   O", "O   O", "P   P", "S");
        banner[2] = String.join("  ", "O   O", "O   O", "PPPP", "SSS");
        banner[3] = String.join("  ", "O   O", "O   O", "P", "S");
        banner[4] = String.join("  ", " OOO ", "OOO", "P", "SSS");

        // Loop to print banner
        for(String line : banner) {
            System.out.println(line);
        }
    }
}
