import javax.swing.*;//PACOTE DE ELEMENTOS GRÁFICOS
import java.awt.*;//CLASSE DIMENSION DO PACOTE AWT
//JFrame
//Classe tela herda características da classe JFrame
public class Tela extends JFrame {
    
    //declaração publica dos objetos
    public static JPanel fundo ;
    public static Container ctnTela;
    public static JLabel lblBanner, lblVRodizio, lblQPessoas, lblTRodizio, lblAcompanhamentos, lblServicos
            ,lblEstacionamento, lblTotal, lblBebidas, lblSobremesas;
    public static JTextField txtVRodizio, txtQPessoas, txtTRodizio, txtAcompanhamento, txtServicos, txtTotal;
    
    
    
    
    
    public Tela(){//Método Construtor
        
        super("Sistema Gerenciador de Restaurante - CIC UNG");//TÍTULO SUPERIOR DA VIEW
        //CONSTRUCAO E CONFIGURACAO DOS OBJETOS
        ctnTela = new Container();//instanciando
        ctnTela.setLayout(null);//configurando layout
        this.add(ctnTela);//adicionando container na janela
        
        //CONFIGURANDO A COR DE FUNDO
        fundo = new JPanel();//instanciando fundo
        fundo.setBackground(new Color(66, 48, 66));//setando ac or
        this.add(fundo);//adicionando
        
        //CRIACAO DA TELA
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ENCERRA O PROCESSO AO FECHAR
        this.setSize(montarTela().width, montarTela().height - 33);//DIMENSOES DA JANELA
        this.setResizable(false);//BLOQUEANDO O DIMENSIONAENTO
        this.setVisible(true);//EXIBE A JANELA
        
    }
    
    public static Dimension montarTela(){
        
        Toolkit info = Toolkit.getDefaultToolkit();//CLASSE TOOLKIT ACESSA CONFIG DO SISTEMA
        Dimension resolucao = info.getScreenSize();//PEGANDO A RESOLUÇÃO DA TELA 
        
        return resolucao;
    }
}
