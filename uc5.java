public class OOPSBannerUC5 {
    public static void main(String[] args) {

        // Inline array declaration + initialization
        String[] banner = {
            String.join(" ", " ***** ", " ***** ", " ****** ", " ****** "),
            String.join(" ", "*     *", "*     *", "*     * ", "*      "),
            String.join(" ", "*     *", "*     *", "******  ", " ***** "),
            String.join(" ", "*     *", "*     *", "*       ", "      *"),
            String.join(" ", "*     *", "*     *", "*       ", "*     *"),
            String.join(" ", "*     *", "*     *", "*       ", "*     *"),
            String.join(" ", " ***** ", " ***** ", "*       ", " ***** ")
        };

        // Loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}