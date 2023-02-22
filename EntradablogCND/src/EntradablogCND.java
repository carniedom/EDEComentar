/**
 * La clase EntradablogCND proporciona el tipo de objeto necesario para crear entradas del blog CND
 * @author Carmelo Nieto Domene
 */
public class EntradablogCND {

    /**
     * Atributos para la clase EntradablogCND
     */
    public static char separador = ':';
    private int id;
    private String texto;
    private String autor;

    /**
     * Constructor de la clase EntradablogCND, que recibe como parámetros el id, el autor y el texto de la entrada
     *
     * @param id id de la entrada
     * @param autor autor de la entrada
     * @param texto texto de la entrada
     * @throws IllegalArgumentException excepción si el número es negativo
     */
    public EntradablogCND(int id, String autor, String texto) throws IllegalArgumentException {
        if (id <= 0) {
            throw new IllegalArgumentException("El id no puede ser negativo");
        }
        this.id = id;
        this.autor = autor;
        this.texto = texto;
    }

    /**
     * Método toString de la clase EntradablogCND que devuelve la cadena formada
     *
     * @return String
     */
    @Override
    public String toString() {
        String cad = "";
        cad += "\nENTRADA DE" + separador + autor;
        cad += "\n " + texto;
        return cad;
    }

    /**
     * Método getId de la clase EntradablogCND que devuelve el id de la entrada
     *
     * @return int
     */
    public int getId() {
        return this.id;
    }

    /**
     * Método getTexto de la clase EntradablogCND que devuelve el texto del
     * contenido de la entrada
     *
     * @return String
     */
    public String getTexto() {
        return this.texto;
    }

    /**
     * Método getUator de la clase EntradablogCND que devuelve en mayúsculas el
     * autor de la entrada
     *
     * @return String
     */
    public String getAutor() {
        return this.autor.toUpperCase();
    }

    /**
     * Método devuelveAutor de la clase EntradablogCND que devuelve el autor de
     * la entrada
     *
     * @return String
     */
    public String devuelveAutor() {
        return this.autor;
    }

    /**
     * Método main de la clase EntradablogCND
     *
     * @param args argumentos base de la clase main
     */
    public static void main(String[] args) {

        EntradablogCND e1 = new EntradablogCND(3, "Carmelo", "Últimas noticias, está disponible BixBy 2.0");
        System.out.println(e1);
    }
}
