public class Decrypter {
    public String decrypt(String input) {
        int[] d = new int[4];
        d = toInt(input);
        d = math(d);
        return toString(d);
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
        out[1] = in[3];
        out[0] = in[2];
        out[3] = in[1];
        out[2] = in[0];
        for (int i = 0; i < 4; i++) {
            out[i] -= 7;
            out[i] += 10;
            out[i] %= 10;
        }
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
