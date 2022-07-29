
package extra05;

public abstract class Pessoa {
    private String Nome;
    private int Idade;
    private String Sexo;
    private int anoc;
    private int anoat;
    private int anof;
    private String Naturalidade;
    private String Nacionalidade;

    public int getAnoat() {
        return anoat;
    }

    public void setAnoat(int anoat) {
        this.anoat=anoat;
    }
        

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
        
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getAnoc() {
        return anoc;
    }

    public void setAnoc(int anoc) {
        this.anoc = anoc;
    }

    public int getAnof() {
        return anof;
    }

    public void setAnof(int anof) {
        this.anof = anof;
    }

    public String getNaturalidade() {
        return Naturalidade;
    }

    public void setNaturalidade(String Naturalidade) {
        this.Naturalidade = Naturalidade;
    }

    public String getNacionalidade() {
        return Nacionalidade;
    }

    public void setNacionalidade(String Nacionalidade) {
        this.Nacionalidade = Nacionalidade;
    }
    
    public void StatusPessoa(){
        System.out.println("-------------Dados--------------------");
        System.out.println("Nome "+this.getNome());
        System.out.println("Sexo "+this.getSexo());
        System.out.println("Idade "+this.getIdade()+" anos");
        System.out.println("Inicio "+this.getAnoc());
        System.out.println("Atual "+this.getAnoat()+" anos");
        System.out.println("Término "+this.getAnof());
        System.out.println("Naturalidade "+this.getNaturalidade());
        System.out.println("Nacionalidade "+this.getNacionalidade());
        System.out.println("--------------------------------------");
        
    }
 }
