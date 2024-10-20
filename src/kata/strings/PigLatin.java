package kata.strings;

public class PigLatin {
    public static String pigIt(String str) {
        // Write code here
        StringBuffer sb = new StringBuffer();
        String[] space = str.split(" ");
        for (String a: space){
            StringBuffer b = new StringBuffer(a);
            if(Character.isLetter(a.charAt(0))) {
                Character firstLetter = b.charAt(0);
                if (Character.isLetter(a.charAt(0))) {
                    b.deleteCharAt(0);
                }
                b.append(firstLetter + "ay ");
                sb.append(b);
            }else{
                sb.append(b);
            }
        }
        if(sb.charAt(sb.length()-1)==' '){
            sb.deleteCharAt(sb.length()-1);
        }
        String result = String.valueOf(sb);
        return result;
    }
}
