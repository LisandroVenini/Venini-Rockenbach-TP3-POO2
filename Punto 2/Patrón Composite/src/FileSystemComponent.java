/**
 * Clase abstracta que representa un componente del sistema de archivos.
 * Puede ser un archivo o un directorio.
 */
public abstract class FileSystemComponent {
    
    /**
     * Nombre del archivo o directorio.
     */
    protected String name;

    /**
     * Constructor.
     *
     * @param name Nombre del componente (archivo o directorio)
     */
    public FileSystemComponent(String name) {
        this.name = name;
    }

    /**
     * Método para mostrar los detalles del archivo o directorio.
     */
    public abstract void showDetails();
}
