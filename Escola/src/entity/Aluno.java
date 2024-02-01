package entity;

public class Aluno {

    public int id;
    public String nome;
    public Boolean isApproved;
    public String escolaPerc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(Boolean isApproved) {
        this.isApproved = isApproved;
    }

    public String getEscolaPerc() {
        return escolaPerc;
    }

    public void setEscolaPerc(String escolaPerc) {
        this.escolaPerc = escolaPerc;
    }



    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", status=" + isApproved +
                ", escolaPerc=" + escolaPerc +
                '}';
    }
}
