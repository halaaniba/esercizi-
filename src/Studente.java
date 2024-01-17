public class Studente {
    private String nome;
    private String cognome;
    private  int identificativo;
    public Studente(String nome, String cognome, int identificativo) {
        this.nome = nome;
        this.cognome = cognome;
        this.identificativo = identificativo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public int getIdentificativo() {
        return identificativo;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", identificativo=" + identificativo +
                '}';
    }
}
