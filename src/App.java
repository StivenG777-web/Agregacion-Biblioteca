public class App {
  public static void main(String[] args) throws Exception {
    Libro Libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry");
    Libro Libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
    Libro Libro3 = new Libro("1984", "George Orwell");

    Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
    biblioteca.agregarLibro(Libro1);
    biblioteca.agregarLibro(Libro2);
    biblioteca.agregarLibro(Libro3);

    System.out.println();
    biblioteca.mostrarCatalogo();

    biblioteca.buscarPorAutor("Gabriel García Márquez");
    System.out.println();
    biblioteca.buscarPorAutor("J.K. Rowling");
    }

}
