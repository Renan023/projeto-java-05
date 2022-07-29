
package extra05;


public class Professor extends Pessoa {
    private String Matéria;
    private float salario;
    private int aula;
    private int aumento;
    private int total;

    public Professor(String Matéria, float salario, int aula, int aumento, int total) {
        this.Matéria = Matéria;
        this.salario = salario;
        this.aula = aula;
        this.aumento = aumento;
        this.total = total;
    }

    
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getAumento() {
        return aumento;
    }

    public void setAumento(int aumento) {
        this.aumento = aumento;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public String getMatéria() {
        return Matéria;
    }

    public void setMatéria(String Matéria) {
        this.Matéria = Matéria;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void aumentosalprof(){
       System.out.println("O salário de "+this.getNome()+" com aumento de "+this.getAumento()+""
               + "% é de R$ "+ this.getSalario()*this.getAumento()/100);
        System.out.println("Total R$ "+ this.getSalario()*this.getTotal()/100);
        System.out.println("--------------------------------------");
    }
    
    public void statusprof(){
        System.out.println("Leciona "+this.getMatéria());
        System.out.println("Salário atual "+this.getSalario());
        System.out.println("Quantas aulas por dia "+this.getAula());
        System.out.println("Aumento de "+this.getAumento()+" %");
        
    }
}
