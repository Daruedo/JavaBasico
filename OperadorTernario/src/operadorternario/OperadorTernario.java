package operadorternario;

public class OperadorTernario {

    public static void main(String[] args) {
        /*int n1, n2, r;
        n1 = 4;
        n2 = 8;
        r = (n1>n2)?0:1;
        System.out.println(r);*/
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String res;
        //res = (nome1==nome3)?"igual":"diferente";
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
    }
    
}
