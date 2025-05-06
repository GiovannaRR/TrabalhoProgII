public class MaquinaDeCoxinhas {
    private int quantidadeCoxinhas;
    
    public MaquinaDeCoxinhas(){
        int quantidadeCoxinahs = 0;
    }

    public void setQuantidade(){
        this.quantidadeCoxinhas = quantidadeCoxinhas;
    }
    
    public int getQuantidade(int quantidade){
        return quantidadeCoxinhas;
    }
    
    public void abastecer(int quantidadeAbastecer){
        
        if(quantidadeAbastecer >= 0){
            quantidadeCoxinhas += quantidadeAbastecer;
        }
        System.out.println("Quantidade total depois de abastecer: " + quantidadeCoxinhas);
        
    }
    
    public void venderCoxinhas(){
        if(quantidadeCoxinhas > 0){
            quantidadeCoxinhas --;
        }
        System.out.println("Quantidade restante de coxinhas:" + quantidadeCoxinhas);
    }
    
    public void venderCoxinhas(int quantidadeCompra){
        int soma = 0;
        if(quantidadeCompra < quantidadeCoxinhas){
            soma = quantidadeCoxinhas - quantidadeCompra;
        }
        else{
            System.out.println("Nao tem coxinhas o suficiente!");
        }
        System.out.println("Quantidade de coxinhas apos as vendas: " + soma);
    }
    
    public void zerarMaquina(){
        quantidadeCoxinhas = 0;
    }
}
