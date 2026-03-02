public class OOPSBannerApp {
    public static void main(String[] args) {
        // Initialize banner lines using String.join() for conciseness
        String[] banner = {
            String.join("", "H   H", " EEEEE", " L     ", " L     ", " OOO  "),
            String.join("", "H   H", " E    ", " L     ", " L     ", "O   O "),
            String.join("", "HHHHH", " EEEE ", " L     ", " L     ", "O   O "),
            String.join("", "H   H", " E    ", " L     ", " L     ", "O   O "),
            String.join("", "H   H", " EEEEE", " LLLLL ", " LLLLL ", " OOO  ")
        };

        // Enhanced for loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}

