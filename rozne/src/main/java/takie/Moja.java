package takie;

/**
 * Created by Aga i Piotr on 2016-12-03.
 */
public class Moja {

    int takie;

    private interface Hoho{
        String costam();
        default void ble(String cos) {
            System.out.println(cos);
        }
    }

    public static void main(String[] args){
        System.out.println("moja");

        Hoho h = () -> { return "dupa"; };

        h.ble(h.costam());
    }
}
