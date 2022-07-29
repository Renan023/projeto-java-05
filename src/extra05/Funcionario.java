
package extra05;

public class Funcionario extends Pessoa {
    private String funcao;
    private int aumentof;
    private int aumfunc;

    public Funcionario(String funcao, int aumentof, int aumfunc) {
        this.funcao = funcao;
        this.aumentof = aumentof;
        this.aumfunc = aumfunc;
    }

    public int getAumentof() {
        return aumentof;
    }

    public void setAumentof(int aumentof) {
        this.aumentof = aumentof;
    }

    public int getAumfunc() {
        return aumfunc;
    }

    public void setAumfunc(int aumfunc) {
        this.aumfunc = aumfunc;
    }
    
    
    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    public void aumentofunc(){
        
    }
}
