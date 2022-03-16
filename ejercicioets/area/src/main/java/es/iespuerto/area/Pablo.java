package es.iespuerto.area;

/**
 * Hello world!
 *
 */
public class Pablo {
    private String tipo;
    private int valor1;
    private int valor2;
    /**
     * Este es un constructor vacio
     */
    public Pablo(){

    }
    /**
     * Constructor que recibe un parámetro
     * @param valor1 Valor del primer parámetro para el cálculo del área.
     */
    public Pablo(int valor1){
        this.valor1=valor1;
    }
    /**
     * Constructor que recibe dos parametros
     * @param valor1 Valor del primer parámetro para el cálculo del área.
     * @param valor2 Valor del segundo parámetro para el cálculo del área.
     */
    public Pablo(int valor1,int valor2){
        this.valor1=valor1;
        this.valor2=valor2;
    }
    /**
     * Método para el cálculo de areas
     * @param valor1 Valor del primer parámetro para el cálculo del área.
     * @param valor2 Valor del segundo parámetro para el cálculo del área.
     */
    public void CalculoArea(int valor1, int valor2){

    }
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
    }
}
