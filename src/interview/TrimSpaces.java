package interview;

public class TrimSpaces {

    String trimSpaces(String str){
        StringBuilder sb = new StringBuilder();
        for(char c:str.toCharArray()){
            if(c==' '){
                continue;
            }else{
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String str = "  prudhvi tanmai la xmi ";
        System.out.println(str.replaceAll("\\s",""));

        TrimSpaces ts = new TrimSpaces();
        System.out.println("using method:"+ts.trimSpaces(str));
    }
}
