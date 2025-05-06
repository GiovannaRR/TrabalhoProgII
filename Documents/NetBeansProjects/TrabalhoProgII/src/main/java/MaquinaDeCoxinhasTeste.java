public class MaquinaDeCoxinhasTeste {
    public static void main (String[] args){
        MaquinaDeCoxinhas coxinha = new MaquinaDeCoxinhas();
        
        coxinha.abastecer(10);
        coxinha.venderCoxinhas();
        coxinha.venderCoxinhas(2);
        coxinha.zerarMaquina();
        
    }
}
