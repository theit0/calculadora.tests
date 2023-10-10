package calculadora.tests;

public class Calculadora {
    public int suma(int var1,int var2){
        int resultado = var1 +var2;
        return resultado;
    }
    public int resta(int var1,int var2){
        int resultado = var1 - var2;
        return resultado;
    }
    public int multiplica(int var1,int var2){
        int resultado = var1 * var2;
        return resultado;
    }
    public int dividir(int var1,int var2){
        if(var2 == 0){
            throw new IllegalArgumentException("No se puede dividir por cero.");
        }
        return var1/var2;
    }
}
