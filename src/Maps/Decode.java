package Maps;

public class Decode {
    public static String decode(String key, String message){
        char[] abMap = new char[26];
        char c = 'a';
        for(int  i =0;i< key.length();i++){
            if(key.charAt(i) != ' ' && abMap[key.charAt(i)-'a'] == '\u0000') {

                abMap[key.charAt(i) - 'a'] = c++;

            }

        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i< message.length();i++){
            if(message.charAt(i) != ' ') {
                sb.append(abMap[ message.charAt(i)- 'a']);
            }else {
                sb.append(' ');
            }

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println("ans " + decode("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }
}
