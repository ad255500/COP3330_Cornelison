public class Encrypter {

    public String encrypt(String input) {
        int[] e = new int[4];
        e = toInt(input);
        e = math(e);
        return toString(e);
    }

    public static int[] toInt(String s) {
        int[] fromInt = new int[4];
        for (int i = 0; i < 4; i++) {
            fromInt[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return fromInt;
    }

    public static int[] math(int[] in) {
        int[] out = new int[4];
        for (int i = 0; i < 4; i++) {
            in[i] += 7;
            in[i] %= 10;
        }
        out[0] = in[2];
        out[1] = in[3];
        out[2] = in[0];
        out[3] = in[1];
        return out;
    }

    public static String toString(int[] s) {
        String out = "";
        for (int i = 0; i < 4; i++) {
            out += s[i];
        }
        return out;
    }
}