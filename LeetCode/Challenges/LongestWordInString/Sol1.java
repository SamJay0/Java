public class Sol1 {
    public String LongestWordFound(String s, String[] words) {

        return "";
    }

    public static boolean isSubsequence(String input, String check) {
        for (int i = 0; i < check.length(); i++) {
            StringBuilder sb = new StringBuilder(input);
            String str=sb.toString();
            if (!(str.toLowerCase().contains(Character.toString(check.toLowerCase().charAt(i))))) {
                return false;
                
            }
                sb.deleteCharAt(i);
                str=sb.toString();
                System.out.println(str);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("Juamaay", "jumyy"));
    }

}