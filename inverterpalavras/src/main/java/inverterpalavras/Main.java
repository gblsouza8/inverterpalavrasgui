package inverterpalavras;
import javax.swing.JOptionPane;
// programa que inverte o texto inserido pelo usuário usando o JOptionPane
public class Main {
    public static void main(String[] args) {
        // exibe a caixa de dialogo para o usuário inserir o texto
        String texto = JOptionPane.showInputDialog("Digite uma palavra/texto para inverter: ");

        // armazena o texto invertido na variável string otxet usando o metódo de inversão
        String otxet = inverterTexto(texto);

        // exibe o texto invertido 
        JOptionPane.showMessageDialog(null, otxet, "Palavra invertida", JOptionPane.PLAIN_MESSAGE);


    }

    // metódo que inverte o texto
    public static String inverterTexto(String texto)
    {
        // define que o tamanho a ser percorrido pelo for será a largura do texto -1 (indice começa no 0)
        int tamanho = texto.length() - 1;
        // inicializa a variavel que ficará a palavra invertida 
        String palavraInvertida = "";
        // laço for ao contrário, para acessar primeiro os ultimos indices da palavra
        for (int i = tamanho; i >= 0; i--)
        {
            // adiciona o caractere atual a string palavraInvertida
            palavraInvertida += texto.charAt(i);
        }
        // retorna a string obtida
        return palavraInvertida;
    }
}