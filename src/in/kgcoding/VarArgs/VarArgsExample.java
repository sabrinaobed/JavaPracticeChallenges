package in.kgcoding.VarArgs;

public class VarArgsExample {


    public static void main(String[] args) {
        System.out.println(concatenate(("Sabrina")));
        System.out.println(concatenate(("Obed")));
        System.out.println(concatenate(("Gill")));
    }
    public static String concatenate(String ...strs){
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");
        }
        return sb.toString();

    }
}
