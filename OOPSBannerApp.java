public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        String[] banner = new String[o.length];

        for (int i = 0; i < o.length; i++) {
            banner[i] = o[i] + "  " + o[i] + "  " + p[i] + "  " + s[i];
        }

        // Print using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Static helper method for O
    public static String[] buildO() {
        return new String[] {
            "  OOO  ",
            " O   O ",
            " O   O ",
            " O   O ",
            " O   O ",
            "  OOO  ",
            "       "
        };
    }

    // Static helper method for P
    public static String[] buildP() {
        return new String[] {
            " PPPP  ",
            " P   P ",
            " PPPP  ",
            " P     ",
            " P     ",
            " P     ",
            "       "
        };
    }

    // Static helper method for S
    public static String[] buildS() {
        return new String[] {
            "  SSSS ",
            " S     ",
            "  SSS  ",
            "     S ",
            "     S ",
            " SSSS  ",
            "       "
        };
    }
}

