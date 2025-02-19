public class ExemplosCompletos {
    public static void main(String[] args) {
        // ============== Exemplos de Concatenação ==============
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println("\nConcatenação básica: " + nomeCompleto);

        String concatenacao;
        
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println("\n1 + 1 + 1 + \"1\": " + concatenacao);  // 31
        
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println("1 + \"1\" + 1 + 1: " + concatenacao);  // 1111
        
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println("1 + \"1\" + 1 + \"1\": " + concatenacao);  // 1111
        
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println("\"1\" + 1 + 1 + 1: " + concatenacao);  // 1111

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println("\"1\" + (1+1+1): " + concatenacao);  // 13

        // ============== Exemplos de Incremento ==============
        int numero = 5;
        System.out.println("\nValor inicial: " + numero);  // 5
        
        numero++;
        System.out.println("Após incremento: " + numero);  // 6
        
        System.out.println("Pós-incremento: " + numero++);  // 6 (valor atual)
        System.out.println("Após pós-incremento: " + numero);  // 7
        
        System.out.println("Pré-incremento: " + ++numero);  // 8 (novo valor)

        // ============== Exemplos Booleanos ==============
        boolean variavel = true;
        System.out.println("\nValor booleano: " + variavel);  // true
        System.out.println("Negação booleana: " + !variavel);  // false

        // ============== Comparações e Operadores Lógicos ==============
        int num1 = 10;
        int num2 = 20;
        
        System.out.println("\nComparações numéricas:");
        System.out.println(num1 + " == " + num2 + ": " + (num1 == num2));  // false
        System.out.println(num1 + " < " + num2 + ": " + (num1 < num2));    // true
        System.out.println(num1 + " > " + num2 + ": " + (num1 > num2));    // false
        System.out.println(num1 + " != " + num2 + ": " + (num1 != num2));  // true

        // ============== Condições Complexas ==============
        int idade = 18;
        boolean temCarteira = true;
        boolean temCarro = false;
        
        System.out.println("\nCondições lógicas:");
        if (idade >= 18 && temCarteira) {
            System.out.println("Pode dirigir!");  // Executa esta
        } else {
            System.out.println("Não pode dirigir.");
        }

        if (temCarteira || temCarro) {
            System.out.println("Tem carteira OU carro.");  // Executa esta
        }

        if ((idade >= 16 || temCarteira) && !temCarro) {
            System.out.println("Condição complexa atendida!");  // Executa esta
        }

        // ============== Operador Ternário ==============
        String status = temCarteira ? "Habilitado" : "Não habilitado";
        System.out.println("\nStatus da carteira: " + status);  // Habilitado
    }
}