public class Biblioteca {
    
    private String nombre;
    private Libro[] catalogo;
    private int cantidad;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.catalogo = new Libro[10];
        this.cantidad = 0;
    }

    public String getNombre() {
        return nombre;
    }
public void agregarLibro(Libro libro) {
        if (cantidad < catalogo.length) {
            catalogo[cantidad] = libro;
            cantidad++;
        } else {
            System.out.println("No se pueden agregar más libros. El catálogo está lleno.");
        }
    }

    public void mostrarCatalogo() {
        System.out.println("== catalogo: " + nombre + " ===");
        if (cantidad == 0) {
            System.out.println("No hay libros en el catálogo.");
        } else {
            for (int i = 0; i < cantidad; i++) {
                catalogo[i].mostrarInformacion();
                System.out.println(); 
            }
        }
      
    }
public void buscarPorAutor(String autor) {
    System.out.println(" No se encontraron los libros de ese autor.");
}
}
