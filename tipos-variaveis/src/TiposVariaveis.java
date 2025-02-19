public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // existem 4 tipos de inteiro
            // byte
            // short
            // int
            // long 
                // é preciso colocar um f no final do numero declarado
        // existem 2 tipos de numeros fracionados
            // float
                // é preciso colocar um f no final do numero declarado
            // double
        // é mais comum usar double e int nas aplicações

        // declaração <tipo> <nome> = <atribuição> 
            // a atribuição não é obrigatório 

         // byte
         byte byteMaximo = 127;
         byte byteMinimo = -128;
 
         // short
         short shortMaximo = 32767;
         short shortMinimo = -32768;
 
         // int
         int intMaximo = 2147483647;
         int intMinimo = -2147483648;
 
         // long
         long longMaximo = 9223372036854775807L;
         long longMinimo = -9223372036854775808L;

        //  é possivel declarar uma variavel constante ou seja, ela não ira mudar de valor
            // só é preciso adicional final ao comeco da declaração
            // essa variavel constante é preciso declarar com caixa alta 

        //Strings

        // String é uma classe (não um tipo primitivo),Ela faz parte do pacote java.lang
        //declaração

        String nome = "Daniel";
        
        // length():
        // Retorna o tamanho (número de caracteres) da string.
        String texto = "Java";
        System.out.println(texto.length()); // 4

        // charAt(int index):
        // Retorna o caractere na posição especificada.
        System.out.println(texto.charAt(0)); // 'J'

        // substring(int inicio, int fim):
        // Retorna uma parte da string, do índice inicio até fim - 1.
        System.out.println(texto.substring(1, 3)); // "av"

        // toUpperCase() e toLowerCase():
        // Converte a string para maiúsculas ou minúsculas.
        System.out.println(texto.toUpperCase()); // "JAVA"
        System.out.println(texto.toLowerCase()); // "java"

        // trim():
        // Remove espaços em branco no início e no final da string.
        String textoComEspacos = "  Java  ";
        System.out.println(textoComEspacos.trim()); // "Java"

        // replace(char antigo, char novo):
        // Substitui todos os caracteres antigo por novo.
        System.out.println(texto.replace('a', 'o')); // "Jovo"

        // split(String regex):
        // Divide a string em um array de strings com base em um delimitador.
        String frase = "Java é legal";
        String[] palavras = frase.split(" ");
        System.out.println(palavras[0]); // "Java"

        // contains(CharSequence s):
        // Verifica se a string contém uma determinada sequência de caracteres.
        System.out.println(texto.contains("av")); // true

        // equalsIgnoreCase(String outra):
        // Compara duas strings ignorando maiúsculas e minúsculas.
        System.out.println(texto.equalsIgnoreCase("JAVA")); // true
    }    
}
