
package extra05;

public class Bolsista extends Aluno {
    private int desconto;
    private int descb;

    public Bolsista(int desconto, int descb, int inscricao, String turma, float nota, float nota1, int frequencia, String curso, float mensalidade) {
        super(inscricao, turma, nota, nota1, frequencia, curso, mensalidade);
        this.desconto = desconto;
        this.descb = descb;
    }



    public int getDescb() {
        return descb;
    }

    public void setDescb(int descb) {
        this.descb = descb;
    }
    
    
    
    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }
    
    public void pagfacilitado(){
        System.out.println("O pagamento da mensalidade de "+this.getNome()+" com"
                + " desconto de "+this.getDesconto()+"%, ficando em R$ "+
                this.getMensalidade()*this.getDescb()/100);
    }
    
    
}
