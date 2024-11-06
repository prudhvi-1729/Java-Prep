package verizon;

public class ContainsDigits {
    public static void main(String[] args){
        String data="prudhvi1729";
        StringBuilder sb = new StringBuilder();
        for(char c:data.toCharArray()){
            if(Character.isDigit(c)){
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
