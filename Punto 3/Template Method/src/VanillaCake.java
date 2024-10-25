/**
 * Subclase que implementa los detalles para hacer un pastel de vainilla.
 */
public class VanillaCake extends Cake {

    @Override
    protected void prepareIngredients() {
        System.out.println("Preparando ingredientes para el pastel de vainilla...");
    }

    @Override
    protected void decorateCake() {
        System.out.println("Decorando el pastel de vainilla con crema y fresas...");
    }
}

