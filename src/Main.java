import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) REPL.rep();
    }
}
class REPL{
    static String Read(){
        Scanner in = new Scanner(System.in);
        System.out.printf("user> ");
        return in.nextLine();
    }
    static String Eval(String s){
        String evaluated = "";
        return evaluated;
    }
    static void Print(String s){
        System.out.print(s);
    }
    static void rep(){
        Print(Eval(Read()));
    }
}