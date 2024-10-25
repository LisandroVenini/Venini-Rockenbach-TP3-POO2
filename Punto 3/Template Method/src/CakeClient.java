/**
 * Cliente que crea pasteles de diferentes tipos.
 */
public class CakeClient {
    public static void main(String[] args) {
        // Crear un pastel de chocolate
        Cake chocolateCake = new ChocolateCake();
        chocolateCake.makeCake();

        System.out.println();

        // Crear un pastel de vainilla
        Cake vanillaCake = new VanillaCake();
        vanillaCake.makeCake();
    }
}
