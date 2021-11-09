package stringmanipulation;

public class StringManipulation {
    public String everyEvenCharacter(String text){
        String result = "";
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i = i + 2){
            result += chars[i];
        }
        return result;
    }
}
