/**
 * Subclase que implementa los detalles para hacer un pastel de chocolate.
 */
public class ChocolateCake extends Cake {

    @Override
    protected void prepareIngredients() {
        System.out.println("Preparando ingredientes para el pastel de chocolate...");
    }

    @Override
    protected void decorateCake() {
        System.out.println("Decorando el pastel de chocolate con chispas de chocolate...");
    }
}
