package exercicios_funcoes;

public class Imc {
    
    
    public static double calcularIMC(double altura, double peso) {
        return peso / (Math.pow(altura, 2));
    }
    
    
    public static String classificarIMC(double imc) {
        if(imc < 18.5) {
            return "Abaixo do peso.";
        } else if(imc < 24.9) {
            return "Peso normal!";
        } else {
            return "Sobrepeso.";
        }
    }

    
    public static void main(String[] args) {
        
        double altura = 1.74;
        double peso = 62;
        
        double meuImc = calcularIMC(altura, peso);
        
        String resultadoTexto = classificarIMC(meuImc);
        
        System.out.printf("Seu IMC é: %.2f \n", meuImc);
        System.out.println("Classificação: " + resultadoTexto);
    }
}
