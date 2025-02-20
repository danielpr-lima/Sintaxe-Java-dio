// Exceção customizada
class MinhaExcecaoCustomizada extends Exception {
    public MinhaExcecaoCustomizada(String mensagem) {
        super(mensagem);
    }
}

public class ExcecoesExemplos {
    public static void main(String[] args) {
        // Try-Catch básico
        try {
            int resultado = 10 / 0; // Isso lança uma ArithmeticException
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }

        // Hierarquia das exceções
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // Isso lança uma ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice do array fora dos limites.");
        } catch (Exception e) { // Captura qualquer exceção que não foi pega acima
            System.out.println("Erro genérico: " + e.getMessage());
        }

        // Finally (executado sempre, ocorrendo exceção ou não)
        try {
            String texto = null;
            System.out.println(texto.length()); // Isso lança uma NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Erro: Objeto nulo.");
        } finally {
            System.out.println("Bloco finally: Sempre executa.");
        }

        // Exceção customizada
        try {
            validarIdade(15); // Isso lança a exceção customizada
        } catch (MinhaExcecaoCustomizada e) {
            System.out.println("Erro customizado: " + e.getMessage());
        }
    }

    // Método que lança uma exceção customizada
    public static void validarIdade(int idade) throws MinhaExcecaoCustomizada {
        if (idade < 18) {
            throw new MinhaExcecaoCustomizada("Idade mínima não atingida.");
        } else {
            System.out.println("Idade válida.");
        }
    }
}