/**
 * Cliente que utiliza el patrón Composite para gestionar
 * un sistema de archivos con directorios y archivos.
 */
public class FileSystemClient {
    
    /**
     * Método principal que construye una estructura de archivos y directorios,
     * y muestra sus detalles en consola.
     *
     * @param args Argumentos de la línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        // Crear archivos individuales
        File file1 = new File("file1.txt", 500);
        File file2 = new File("file2.txt", 1500);
        File file3 = new File("file3.txt", 2000);

        // Crear directorios
        Directory rootDirectory = new Directory("root");
        Directory subDirectory1 = new Directory("subdir1");
        Directory subDirectory2 = new Directory("subdir2");

        // Añadir archivos a los directorios
        rootDirectory.addComponent(file1);
        subDirectory1.addComponent(file2);
        subDirectory2.addComponent(file3);

        // Añadir subdirectorios al directorio raíz
        rootDirectory.addComponent(subDirectory1);
        rootDirectory.addComponent(subDirectory2);

        // Mostrar detalles del sistema de archivos
        rootDirectory.showDetails();
    }
}


