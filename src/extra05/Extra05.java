
package extra05;

public class Extra05 {

    public static void main(String[] args) {
        Visitante v= new Visitante();
        v.setSexo("F");
        v.setNome("Isadora");
        v.setAnoc(2016);
        v.setAnoat(2022-2016);
        v.setIdade(2022-2006);
        v.setNaturalidade("São Paulo");
        v.setNacionalidade("EUA");
        v.StatusPessoa();
        
        Professor p = new Professor("Informática",1950.f,6,25,125);
        p.setAnoc(2016);
        p.setAnoat(2022-2016);
        p.setIdade(2022-1999);
        p.setNacionalidade("São Paulo");
        p.setNaturalidade("Itália");
        p.setNome("Carol");
        p.setSexo("F");
        p.StatusPessoa();
        p.statusprof();
        p.aumentosalprof();
        
        Aluno a= new Aluno(1,"T1",6.2f,3.1f,85,"medicina",1500.f);
        a.statusal();
    }
    
}
