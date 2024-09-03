public class Tres {
    public static void main(String[] args) {
        double[] faturamento = {
            1500.0, 2300.0, 1800.0, 0.0, 2100.0, 0.0, 2500.0,
            0.0, 1900.0, 2000.0, 1700.0, 2200.0, 1600.0, 0.0, 0.0,
            1900.0, 2400.0, 0.0, 0.0, 1800.0, 2600.0, 2100.0,
            1700.0, 1900.0, 2000.0, 1800.0, 2300.0, 1900.0, 2500.0, 2400.0
        };

        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;

        double somaFaturamento = 0;
        int diasComFaturamento = 0;

        for (double valor : faturamento) {
            if (valor > 0) {
                if (valor < menorFaturamento) {
                    menorFaturamento = valor;
                }
                if (valor > maiorFaturamento) {
                    maiorFaturamento = valor;
                }
                somaFaturamento += valor;
                diasComFaturamento++;
            }
        }

        double mediaMensal = somaFaturamento / diasComFaturamento;

        int diasAcimaDaMedia = 0;
        for (double valor : faturamento) {
            if (valor > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Menor valor de faturamento: " + menorFaturamento);
        System.out.println("Maior valor de faturamento: " + maiorFaturamento);
        System.out.println("Número de dias com faturamento acima da média mensal: " + diasAcimaDaMedia);

    }
}
