public class ManipulatingCode {
    public static void main(String args[]) {
        String in;
        String out = "";
        String intermediate1 = "";
        String intermediate2 = "";
        int counter = 0;

        in = "CODE";
        for (int i = 0; i < in.length(); i++) {
            intermediate1 += in.charAt(i);
            intermediate1 += in.charAt(i);
        }

        for (int i = intermediate1.length(); i > 0; i--) {
            intermediate2 += intermediate1.charAt(i-1);
        }

        for (int i = 0; i < (intermediate2.length() - 1); i++) {
            out += intermediate2.charAt(i);
        }

        System.out.println(in);
        System.out.println(intermediate1);
        System.out.println(intermediate2);
        System.out.println(out);
    }
}
