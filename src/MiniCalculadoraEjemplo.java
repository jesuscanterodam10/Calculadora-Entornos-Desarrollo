
/**
 * Esta clase proporciona funciones matemáticas simples para el ejemplo
 * * @author Jesus Cantero
 * @version 1.0
 * @since 1.0 (Indicativo numérico)
 * @see Math
 * @serial campo_descripcion
 */

public class MiniCalculadoraEjemplo {

    /**
     * Calcula la raíz cuadrada de un número.
     * * @param numero El valor para calcular la raíz
     * @return El resultado de la operación
     * @throws ArithmeticException Si ocurre un error de cálculo
     * @see Math#sqrt(double)
     */

    public double raizCuadrada(double numero) {
        return Math.sqrt(numero);
    }

    /**
     * Devuelve el valor absoluto de un número.
     * * @deprecated Este metodo es antiguo, use versiones más recientes
     * @param numero El número a transformar
     * @return El número en positivo
     * @since 1.0
     */

    public double valorAbsoluto(double numero) {
        return Math.abs(numero);
    }
}
