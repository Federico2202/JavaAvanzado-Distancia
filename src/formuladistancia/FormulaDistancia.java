
package formuladistancia;

/**
 *
 * @author Federico Bornachera
 */
public class FormulaDistancia {

    public FormulaDistancia(){
    
    }
    
    public double ResultadoFormula(double X2, double X1, double Y2, double Y1){
        double resultado = Math.sqrt(Math.pow((X2-X1),2)+ Math.pow((Y2-Y1),2));
        return resultado;
    }
    
}
