public class TesteFilipe1 {

    public void questao1() {
        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("Questão 1: O valor final de SOMA é " + SOMA);
    }

    public void questao2(int numero) {
        int a = 0;
        int b = 1;
        int c;

        System.out.print("Questão 2: Sequência de Fibonacci: " + a + " " + b);

        while (b < numero) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + b);
        }

        System.out.println();

        if (b == numero || numero == 0) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public void questao3(double[] faturamento) {
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        double soma = 0;
        int diasComFaturamento = 0;

        for (double valor : faturamento) {
            if (valor > 0) {
                if (valor < menor)
                    menor = valor;
                if (valor > maior)
                    maior = valor;
                soma += valor;
                diasComFaturamento++;
            }
        }

        double media = soma / diasComFaturamento;
        int diasAcimaDaMedia = 0;

        for (double valor : faturamento) {
            if (valor > media) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Questão 3:");
        System.out.println("Menor faturamento: " + menor);
        System.out.println("Maior faturamento: " + maior);
        System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);
    }

    public void questao4() {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double total = sp + rj + mg + es + outros;

        System.out.println("Questão 4:");
        System.out.printf("Percentual de SP: %.2f%%\n", (sp / total) * 100);
        System.out.printf("Percentual de RJ: %.2f%%\n", (rj / total) * 100);
        System.out.printf("Percentual de MG: %.2f%%\n", (mg / total) * 100);
        System.out.printf("Percentual de ES: %.2f%%\n", (es / total) * 100);
        System.out.printf("Percentual de Outros: %.2f%%\n", (outros / total) * 100);
    }

    public void questao5(String str) {
        String invertida = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            invertida += str.charAt(i);
        }
        System.out.println("Questão 5: String invertida: " + invertida);
    }

    public static void main(String[] args) {
        TesteFilipe1 desafios = new TesteFilipe1();

        desafios.questao1();

        desafios.questao2(21);

        double[] faturamento = { 0, 22174.1664, 24537.6698, 0, 26139.6134, 0, 0, 26742.6612, 0, 42889.2258, 46251.174,
                0, 11191.4722, 0, 0, 0, 1527.4419, 0, 0, 0, 12459.1192, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        desafios.questao3(faturamento);

        desafios.questao4();

        desafios.questao5("Exemplo");
    }
}
