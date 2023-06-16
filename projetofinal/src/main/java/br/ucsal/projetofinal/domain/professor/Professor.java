package br.ucsal.projetofinal.domain.professor;

public class Professor {
    private Integer matricula;
    private String nome;
    private String email;
    private Integer ano;

    public Professor(DadosCadastroProfessor dados){
        this.matricula = dados.matricula();
        this.nome = dados.nome();
        this.email = dados.email();
        this.ano = dados.ano();
    }

    @Override
    public String toString() {
        return "Professor{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", ano=" + ano +
                '}';
    }

    public Integer getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAno() {
        return ano;
    }
}
