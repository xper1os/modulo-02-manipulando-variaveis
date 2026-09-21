package conversoesentretipos;

public class ConversoesEntreTipos {
    public static void main(String[] args) {
        // Conversao automatica: int cabe dentro de double.
        int numeroInteiro = 10;
        double numeroDecimal = numeroInteiro;
        System.out.println("int para double: " + numeroDecimal);

        // Conversao explicita (cast): a parte decimal e descartada.
        double preco = 19.99;
        int precoInteiro = (int) preco;
        System.out.println("double para int: " + precoInteiro);

        // Conversao de texto para numeros.
        String textoIdade = "25";
        String textoAltura = "1.75";
        int idade = Integer.parseInt(textoIdade);
        double altura = Double.parseDouble(textoAltura);
        System.out.println("String para int: " + idade);
        System.out.println("String para double: " + altura);

        // Conversao de numero para texto.
        int quantidade = 5;
        String textoQuantidade = String.valueOf(quantidade);
        System.out.println("int para String: " + textoQuantidade);

        // Um char pode ser convertido para seu codigo numerico Unicode.
        char letra = 'A';
        int codigoDaLetra = letra;
        System.out.println("char para int: " + codigoDaLetra);

        // Conversao de texto para numero
        String numero = "10";
        int numeroConvertido = Integer.parseInt(numero);
        System.out.println(numeroConvertido + 10);

    }
}
