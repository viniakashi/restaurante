import javax.swing.*;//PACOTE DE ELEMENTOS GRÁFICOS
import java.awt.*;//CLASSE DIMENSION DO PACOTE AWT
import java.text.DecimalFormat;
import javax.swing.table.*;
//JFrame
//Classe tela herda características da classe JFrame
public class Tela extends JFrame {
    
    //declaração publica dos objetos
    public static Font fntLabels = new Font("TAHOMA", Font.BOLD, 24);
    public static Font fntCxTexto = new Font("Verdana", Font.PLAIN, 22);
    
    public static JPanel fundo ;
    public static Container ctnTela;
    public static JLabel lblBanner, lblVRodizio, lblQPessoas, lblTRodizio, lblAcompanhamentos, lblServicos
            ,lblEstacionamento, lblTotal, lblBebidas, lblSobremesas;
    public static JTextField txtVRodizio, txtQPessoas, txtTRodizio,
            txtAcompanhamento, txtServicos, txtTotal;
    public static JButton btnAdd, btnFecharPedido, btnBebidas[], btnSobremesas[];
    public static ImageIcon imgBanner, imgBebidas[], imgSobremesas[];
    public static JComboBox cmbEstacionamento;
    public static JTable tblItens;
    public static JScrollPane srcItens;
    public static DefaultTableModel mdlItens;
    public static DecimalFormat fmtMoeda;
    
    
    
    
    public Tela(){//Método Construtor
        
        super("Sistema Gerenciador de Restaurante - CIC UNG");//TÍTULO SUPERIOR DA VIEW
        //CONSTRUCAO E CONFIGURACAO DOS OBJETOS
        ctnTela = new Container();//instanciando
        ctnTela.setLayout(null);//configurando layout
        this.add(ctnTela);//adicionando container na janela
        
        imgBanner = new ImageIcon("img/banner-img.png");
        lblBanner = new JLabel(imgBanner);
        lblBanner.setBounds(0,0,1360,180);//POSICIONAMETO DO OBJ BANNER
        ctnTela.add(lblBanner);//adicionando banner no container
        
        //LABELS
        lblVRodizio = new JLabel("Valor do Rodízio:");
        lblVRodizio.setFont(fntLabels);
        lblVRodizio.setBounds(15, 200, 250, 30);
        ctnTela.add(lblVRodizio);
        
        lblQPessoas = new JLabel("Qtde. de Pessoas:");
        lblQPessoas.setFont(fntLabels);
        lblQPessoas.setBounds(15, 270, 250, 30);
        ctnTela.add(lblQPessoas);
        
        lblTRodizio = new JLabel("Total Rodízio:");
        lblTRodizio.setFont(fntLabels);
        lblTRodizio.setBounds(15, 340, 250, 30);
        ctnTela.add(lblTRodizio);
   
        
        
        
        
        lblAcompanhamentos = new JLabel("Acompanhamento:");
        lblAcompanhamentos.setFont(fntLabels);
        lblAcompanhamentos.setBounds(15, 410, 250, 30);
        ctnTela.add(lblAcompanhamentos);
        
        lblServicos = new JLabel("Serviços:");
        lblServicos.setFont(fntLabels);
        lblServicos.setBounds(15, 480, 250, 30);
        ctnTela.add(lblServicos);
        
        lblEstacionamento = new JLabel("Estacionamento:");
        lblEstacionamento.setFont(fntLabels);
        lblEstacionamento.setBounds(15, 550, 250, 30);
        ctnTela.add(lblEstacionamento);
        
        lblTotal = new JLabel("Total:");
        lblTotal.setFont(fntLabels);
        lblTotal.setBounds(15, 620, 250, 30);
        ctnTela.add(lblTotal);
        //FIM LABELS
        
        //TEXTOS
        
        txtVRodizio = new JTextField();
        txtVRodizio.setEditable(false);
        txtVRodizio.setFont(fntCxTexto);
        txtVRodizio.setBounds(240, 200, 250, 30);
        ctnTela.add(txtVRodizio);
        
        txtQPessoas = new JTextField();
        txtQPessoas.setEditable(false);
        txtQPessoas.setFont(fntCxTexto);
        txtQPessoas.setBounds(240, 270, 120, 30);
        ctnTela.add(txtQPessoas);
        
        txtTRodizio = new JTextField();
        txtTRodizio.setEditable(false);
        txtTRodizio.setFont(fntCxTexto);
        txtTRodizio.setBounds(240, 340, 250, 30);
        ctnTela.add(txtTRodizio);
        
        txtAcompanhamento = new JTextField();
        txtAcompanhamento.setEditable(false);
        txtAcompanhamento.setFont(fntCxTexto);
        txtAcompanhamento.setBounds(250, 410, 240, 30);
        ctnTela.add(txtAcompanhamento);
        
        txtServicos = new JTextField();
        txtServicos.setEditable(false);
        txtServicos.setFont(fntCxTexto);
        txtServicos.setBounds(240, 480, 250, 30);
        ctnTela.add(txtServicos);
        
        String op[] = {"Sim", "Não"};
        cmbEstacionamento = new JComboBox(op);
        cmbEstacionamento.setFont(fntCxTexto);
        cmbEstacionamento.setBounds(240, 550, 250, 30);
        ctnTela.add(cmbEstacionamento);
        
        txtTotal = new JTextField();
        txtTotal.setEditable(false);
        txtTotal.setFont(fntCxTexto);
        txtTotal.setBounds(240, 620, 250, 30);
        ctnTela.add(txtTotal);
        
        //FIM TEXTOS
      
        //instanciando vetores de botoes (bebidas e sobremesas)
        
        btnBebidas = new JButton[8];
        btnSobremesas = new JButton[8];
        
        for(int i=0; i<btnBebidas.length; i++){
            btnBebidas[i] = new JButton(new ImageIcon("img/b" + i + ".png"));
            btnBebidas[i].setBackground(Color.white);
            btnSobremesas[i] = new JButton(new ImageIcon("img/s" + i + ".png"));
            btnSobremesas[i].setBackground(Color.white);
            //POSICIONANDO BOTOES
            if(i<4){
            btnBebidas[i].setBounds(850 + (i*120),200,100,100);
            btnSobremesas[i].setBounds(850 + (i*120),470,100,100);
        
            }else{
            btnBebidas[i].setBounds(850 + ((i-4)*120),315,100,100);
            btnSobremesas[i].setBounds(850 + ((i-4)*120),585,100,100);        
                     
            }
            ctnTela.add(btnBebidas[i]);
            ctnTela.add(btnSobremesas[i]);         
            
        }
        
        //TABELA
        tblItens = new JTable();//instanciando tabela
        srcItens = new JScrollPane(tblItens);//instanciando scroll e vinculando á tabela
        mdlItens = (DefaultTableModel) tblItens.getModel();
        
        srcItens.setBounds(510, 200, 320, 387);
        ctnTela.add(srcItens);
        
        //MONTANDO TOPO DA TABELA
        String sTopo[] = {"Item", "Qtde"};
        for(int i=0; i<sTopo.length; i++){
            
            mdlItens.addColumn(sTopo[i]);
            
        }        
        btnFecharPedido = new JButton("Fechar Pedido");
        btnFecharPedido.setFont(fntLabels);
        btnFecharPedido.setBounds(510, 600, 320, 40);
        ctnTela.add(btnFecharPedido);
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
