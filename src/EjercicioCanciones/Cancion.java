package EjercicioCanciones;
/**
 * Esta clase crea los metodos y los atributos de las canciones
 * 
 * @author samuel
 * 
 * @version 1.420
 *
 */
public class Cancion {
	private String titulo;
	private String grupo;
	private int duracion;
	private boolean sonando;
	
	// Definimos los constructores
	
	/**
	 * Constructor sin parámetros
	 * En este metodo creamos una cancion con un titulo vacio, una duracion = 0 y que no esta reproduciendose
	 * 
	 */
	Cancion()
	{
		this.titulo = "";
		this.duracion = 0;
		this.sonando = false;
	}
	
	/**
	 * En este metodo creamos una cancion con un titulo y una duracion en segundos
	 * 
	 * @param titulo en este parametro le pasamos el titulo de la cancion
	 * @param duracion en este parametro le pasamos la duracion de la cancion en segundos
	 */
	Cancion(String titulo, int duracion)// constructor con 2 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = false;
	}
	
	/**
	 * En este metodo creamos una cancion con un titulo, el grupo al que pertenece, la duracion en segundos y no esta reproduciendose
	 * 
	 * @param titulo en este parametro le pasamos el titulo de la cancion
	 * @param grupo en este parametro le pasamos el nombre del grupo
	 * @param duracion en este parametro le pasamos la duracion de la cancion en segundos
	 * @param sonando
	 */

	Cancion(String titulo, String grupo, int duracion, boolean sonando) // constructor con 4 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = sonando;
		this.grupo = grupo;
	}
	
	/**
	 * Con este metodos reproducimos la cancion que queremos escuchar cambiando la boolean a true
	 * 
	 * @return este return lo que hace es cambiar la booleana a true o a false
	 */

	boolean reproducirCancion() {
		if (this.sonando) {
			return false;
		} else {
			this.sonando = true;
			return true;
		}
	}
	
	/**
	 * 
	 * Con este metodo lo que hacemos es parar la cancion cambiando el boolean a false
	 * 
	 * @return devuelve dependiendo de lo que quieres en true o en false
	 */

	boolean pararCancion() {
		if (!this.sonando) {
			return false;
		} else {
			this.sonando = false;
			return true;
		}
	}

	// meter métodos get/set/toString()
	/**
	 * Con este metodo 	lo que haces es mirar el nombre del titulo
	 * @return devuelve el titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * Con este metodo le metemos el titulo de la cancion
	 * 
	 * @param titulo
	 */

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	/**
	 * Con este metodo miramos el nombre del grupo
	 * 
	 * @return devuelve el titulo
	 */

	public String getGrupo() {
		return grupo;
	}
	
	/**
	 * 
	 * Con este metodo le metemos el nombre del titulo
	 * @param grupo
	 */

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	
	/**
	 * Con este metodo miramos la duracion de la cancion
	 * 
	 * @return devuelve la duracion
	 */

	public int getDuracion() {
		return duracion;
	}
	
	/**
	 * Este metodo le metemos la duracion del metodo
	 * 
	 * @param duracion
	 */

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	/**
	 * Con este metodo se mira si la cancion esta sonando
	 * 
	 * @return devuelve si esta sonando
	 */

	public boolean isSonando() {
		return sonando;
	}
	
	/**
	 * En este le cambiamos el sonando a true o a flase
	 * 
	 * @param sonando
	 */

	public void setSonando(boolean sonando) {
		this.sonando = sonando;
	}
	
	/**
	 * En este metodo lo que hace es comparar si es el mismo y si es el mismo
	 * la booleana cambiaa true y si no es la misma se cambia a false
	 * 
	 * @param cancion
	 * @return devuelve la booleana en true o en flase
	 */

	boolean MismaCancion(Cancion cancion) {
		if (this.titulo == cancion.titulo && this.grupo == cancion.grupo)
			return true;
		else
			return false;
	}
	
	/**
	 * Este metodo compara la duracion de las canciones y devuelve que cancion es la mas larga
	 * o la que tiene mayor duracion
	 * 
	 * @param canciones
	 * @return devuelve la cancion de maxima duracion
	 */

	public static String MayorDuracion(Cancion[] canciones) {
		int posMax = 0;
		int max = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (canciones[i].duracion > max) {
				posMax = i;
				max = canciones[i].duracion;
			}
		}
		return canciones[posMax].titulo;

	}
	
	/**
	 * En este metodo lo que haces es pasar a la siguiente cancion 
	 * 
	 * @param canciones
	 * @param titulo
	 * @return devuelve el titulo de la siguiente canion
	 */

	static String SiguienteCancion(Cancion[] canciones, String titulo) {
		int pos = 0;
		int siguiente = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (titulo == canciones[i].titulo) {
				pos = i;
			}
		}
		if (pos == canciones.length - 1) {
			siguiente = 0;
		} else {
			siguiente = pos + 1;
		}
		return canciones[siguiente].titulo;
	}

	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", autor=" + grupo + ", duracion=" + duracion + ", sonando=" + sonando
				+ "]";
	}
}
