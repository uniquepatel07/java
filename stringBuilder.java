public class stringBuilder {


    // Convert it to upperCase first letter
    public static String convert(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    // compress the string..

    public static String compress(String str){
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length()-1; i++) {
            Integer count = 1;
            while (str.charAt(i)==str.charAt(i+1) && i<str.length()){
                count++;
                i++;
            }
            sb.append(str.charAt(i));

            if (count>1){
                sb.append(count.toString());
            }

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char i = 'a'; i <='z' ; i++) {
            sb.append(i);
        }

        // Q:- convert first letter into upper case;
        String str = "hi my name is suresh";
        System.out.println(convert(str));

        //Q:- compress the String
        String str1= "aaaaabbccddd ";
        System.out.println(compress(str1));

    }
}
