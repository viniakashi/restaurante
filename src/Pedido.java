
public class Pedido {
    
    //atributos
    public static float vRodizio, vAcompanhamentos, vServicos, vEstacionamento, vParcial, vTotal;
    public static boolean stEstacionamento;
    public static int qtdePessoas;
    
    public static String sBebidas[] = {"Água", "Refrigerante", "Suco", "Café", "Milkshake","Toddynho", "Cerveja", "Vinho"}; 
    public static float vBebidas[] = {(float)5, (float)8, (float)7.50, (float)3.5, (float)8, (float)5.50,(float)6
            , (float)15};
    
     public static String sSobremesas[] = {"Pudim", "Bolo", "Mousse", "Sorvete", "Salada de Frutas",
         "Açai", "Paçoca", "Petit Gateau"}; 
    public static float vSobremesas[] = {(float)7, (float)8.5, (float)9, (float)8.5, (float)5.5, (float)12,
        (float)3, (float)11};
    //construtor
    public Pedido(float tmpRodizio){
        
        this.qtdePessoas = 1;
        this.vRodizio = tmpRodizio;
        this.vAcompanhamentos = 0;
        this.vServicos = 0;
        this.vEstacionamento = 0;
        this.vParcial = 0;
        this.vTotal = 0;
        
        
    }
    
    
    //metodos funcionais
    
    public static float atualizarValores(){
        
        vParcial = vRodizio * qtdePessoas;
        vServicos = (vParcial + vAcompanhamentos) * (float)0.1;
        
        if(stEstacionamento){           
            vEstacionamento = 15;          
        }
        
        vTotal = vParcial + vServicos + vAcompanhamentos + vEstacionamento;
        
        return vTotal;
    }
    
    
}
