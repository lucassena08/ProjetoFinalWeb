package br.ucsal.projetofinal.domain.diciplina;

public class Diciplina {
    private Integer codigo;
    private String nome;
    private String professor;
    

    public Diciplina(DadosCadastroDiciplina dados){
        this.codigo = dados.codigo();
        this.nome = dados.nome();
        this.professor = dados.professor();
    }

    @Override
    public String toString() {
        return "Diciplina{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", professor='" + professor + '\'' +
                	+
                '}';
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getProfessor() {
        return professor;
    }
}
