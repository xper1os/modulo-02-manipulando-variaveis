package funcoesaritimeticas;

public class FuncoesAritimeticas {
    public static void main(String[] args) {
        int primeiroNumero = 10;
        int segundoNumero = 3;

        int soma = primeiroNumero + segundoNumero;
        int subtracao = primeiroNumero - segundoNumero;
        int multiplicacao = primeiroNumero * segundoNumero;
        int divisaoInteira = primeiroNumero / segundoNumero;
        int restoDaDivisao = primeiroNumero % segundoNumero;

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisao inteira: " + divisaoInteira);
        System.out.println("Resto da divisao: " + restoDaDivisao);

        // Os parenteses fazem esta conta ser resolvida primeiro.
        int resultadoComParenteses = (primeiroNumero + segundoNumero) * 2;
        System.out.println("Resultado com parenteses: " + resultadoComParenteses);

        System.out.println("\n--- Classe Math ---");
        System.out.println("Valor absoluto de -8: " + Math.abs(-8));
        System.out.println("2 elevado a 3: " + Math.pow(2, 3));
        System.out.println("Raiz quadrada de 81: " + Math.sqrt(81));
        System.out.println("Maior numero: " + Math.max(primeiroNumero, segundoNumero));
        System.out.println("Menor numero: " + Math.min(primeiroNumero, segundoNumero));
        System.out.println("Arredondamento de 4.7: " + Math.round(4.7));
        System.out.println("Valor de PI: " + Math.PI);
    }
}
