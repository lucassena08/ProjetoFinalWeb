package br.ucsal.projetofinal.domain.estudante;

public class Estudante {
    private Integer matricula;
    private String nome;
    private String email;
    private Integer ano;

    public Estudante(DadosCadastroEstudante dados){
        this.matricula = dados.matricula();
        this.nome = dados.nome();
        this.email = dados.email();
        this.ano = dados.ano();
    }

    @Override
    public String toString() {
        return "Estudante{" +
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
