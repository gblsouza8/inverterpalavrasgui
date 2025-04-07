package inverterpalavras;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite uma palavra/texto para inverter: ");
    }
    public static String inverterTexto(String texto)
    {
        int tamanho = texto.length() - 1;
        String palavraInvertida = "";
        for (int i = tamanho; i >= 0; i--)
        {
            palavraInvertida += texto.charAt(i);
        }
        return palavraInvertida;
    }
}