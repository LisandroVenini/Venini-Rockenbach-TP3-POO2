/**
 * Clase que representa un archivo en el sistema de archivos.
 * Hereda de FileSystemComponent.
 */
public class File extends FileSystemComponent {
    
    /**
     * Tamaño del archivo en bytes.
     */
    private int size;

    /**
     * Constructor para inicializar un archivo con su nombre y tamaño.
     *
     * @param name Nombre del archivo
     * @param size Tamaño del archivo en bytes
     */
    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    /**
     * Muestra los detalles del archivo, incluyendo su nombre y tamaño.
     */
    @Override
    public void showDetails() {
        System.out.println("File: " + name + " (Size: " + size + " bytes)");
    }
}

