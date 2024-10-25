/**
 * Clase que define el proceso general de hacer un pastel.
 * Utiliza el patrón Template Method para delegar los pasos específicos
 * a las subclases.
 */
public abstract class Cake {
    
    // Método template que define el proceso general para hacer un pastel
    public final void makeCake() {
        prepareIngredients();
        bake();
        decorateCake();
        packageCake();
    }

    // Métodos abstractos para los pasos que varían entre pasteles
    protected abstract void prepareIngredients();
    protected abstract void decorateCake();

    // Métodos comunes que pueden ser opcionalmente sobreescritos por las subclases
    protected void bake() {
        System.out.println("Horneando el pastel...");
    }

    protected void packageCake() {
        System.out.println("Empaquetando el pastel...");
    }
}
