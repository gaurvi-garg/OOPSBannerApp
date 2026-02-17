public class OOPSBannerApp {
    public static void main(String[] args) {

        // Store all banner lines in a String array
        String[] banner = new String[] {
            // Line 1
            String.join("  ", "  ***  ", "     ***  ", "  *****  ", "  *****  "),
            // Line 2
            String.join("  ", " **   ** ", " **   ** ", " **   ** ", "**     "),
            // Line 3
            String.join("  ", "**     **", "**     **", " **    **", "**     "),
            // Line 4
            String.join("  ", "**     **", "**     **", " *****  ", " *****  "),
            // Line 5
            String.join("  ", "**     **", "**     **", " **     ", "      **"),
            // Line 6
            String.join("  ", " **   ** ", " **   **", "  **     ", " ** * *"),
            // Line 7
            String.join("  ", "  ***  ", "     ***  ", "  **     ", "  ***  ")
        };

        // Loop through the array and print each line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}

