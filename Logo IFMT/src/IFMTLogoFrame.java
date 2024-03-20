import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class IFMTLogoFrame extends JFrame {

    public IFMTLogoFrame() {
        super("IFMT Logo");

        // Configurar o JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Centralizar na tela

        // Adicionar a logo do IFMT
        ImageIcon ifmtLogo = new ImageIcon("C:\\Users\\Aluno\\Downloads\\ifmt.png");
        JLabel logoLabel = new JLabel(ifmtLogo);
        add(logoLabel);

        // Adicionar o texto
        JLabel textLabel = new JLabel("INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE MATO GROSSO");
        textLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        add(textLabel);

        // Configurar o layout
        setLayout(null); // Usar layout nulo para posicionar manualmente os componentes
        logoLabel.setBounds(70, 40, 800, 500);
        textLabel.setBounds(250, 650, 360, 40);
    }

    public static void main(String[] args) {
        // Criar e exibir o JFrame
        IFMTLogoFrame frame = new IFMTLogoFrame();
        frame.setVisible(true);
    }
}
