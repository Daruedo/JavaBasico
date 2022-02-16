package operadoresaritimeticos;

public class OperadoresAritimeticos {

    public static void main(String[] args) {
        /*int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é igual a " + m);*/

        /*int numero = 10;
        int valor = 4 + numero--;
        System.out.println(valor);
        System.out.println(numero);*/

        /*int x = 4;
        x += 2; // x = x + 2;
        System.out.println(x);*/

        /*loat y = 8.9f;
        //int ar = (int) Math.floor(y);
        //int ar = (int) Math.ceil(y);
        int ar = (int) Math.round(y);
        System.out.println(ar);*/

        double ran = Math.random();
        int n = (int) (1 + ran * (99-1));
        System.out.println(n);
    }
    
}
