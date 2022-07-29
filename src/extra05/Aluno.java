package extra05;

public class Aluno extends Pessoa {
    private int inscricao;
    private String turma;
    private float nota;
    private float nota1;
    private float media;
    private int frequencia;
    private String curso;
    private float mensalidade;

    public Aluno(int inscricao, String turma, float nota, float nota1,int frequencia, String curso, float mensalidade) {
        this.inscricao = inscricao;
        this.turma = turma;
        this.nota = nota;
        this.nota1 = nota1;
        this.frequencia = frequencia;
        this.curso = curso;
        this.mensalidade = mensalidade;
    }

    
    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public int getInscricao() {
        return inscricao;
    }

    public void setInscricao(int inscricao) {
        this.inscricao = inscricao;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getMedia() {
        return media;
    }

    protected void setMedia(float media) {
        this.media = media;
        
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void statusal(){
        System.out.println("Inscrição "+this.getInscricao());
        System.out.println("Turma "+this.getTurma());
        System.out.println("Curso "+this.getCurso());
        System.out.println("Frequencia "+this.getFrequencia());
        System.out.println("Nota 1 "+this.getNota());
        System.out.println("Nota 2 "+this.getNota1());
        System.out.println("Mensalidade "+this.getMensalidade());
    }
    

                    
    
}
