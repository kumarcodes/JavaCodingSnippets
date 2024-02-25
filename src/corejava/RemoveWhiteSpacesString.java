package corejava;

public class RemoveWhiteSpacesString {

    public static void main(String[] args) {
        String str = "Hello World!";


        //Approach One using Character.isWhitespace Method
        StringBuilder result = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(!Character.isWhitespace(str.charAt(i))){
                result.append(str.charAt(i));
            }
        }
        System.out.println(result);

        //Approach Two using replaceAll Method

        String resultStr = str.replaceAll("\\s","");
        System.out.println(resultStr);
    }
}
