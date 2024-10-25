import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un directorio en el sistema de archivos.
 * Un directorio puede contener archivos y otros directorios.
 */
public class Directory extends FileSystemComponent {
    
    /**
     * Lista de componentes que forman parte del directorio.
     * Pueden ser archivos o directorios.
     */
    private List<FileSystemComponent> components = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param name Nombre del directorio
     */
    public Directory(String name) {
        super(name);
    }

    /**
     * Agrega un componente al directorio. El componente puede ser
     * un archivo o un subdirectorio.
     *
     * @param component Componente a agregar (archivo o directorio)
     */
    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    /**
     * Elimina un componente del directorio.
     *
     * @param component Componente a eliminar (archivo o directorio)
     */
    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    /**
     * Muestra los detalles del directorio, incluyendo su nombre y los
     * componentes que contiene, de manera recursiva.
     */
    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        for (FileSystemComponent component : components) {
            component.showDetails(); // Recursividad para mostrar contenido de directorios
        }
    }
}

