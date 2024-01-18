public class Auto {
    private String targa;
    private String modello;
    private int cilindrata;
    private String marca;

    public Auto(String targa, String modello, int cilindrata, String marca) {
        this.targa = targa;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.marca = marca;
    }

    public String getTarga() {
        return this.targa;
    }

    public int getCilindrata() {
        return this.cilindrata;
    }

    public String getModello() {
        return this.modello;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String toString() {
        return "Auto{targa='" + this.targa + "', modello='" + this.modello + "', cilindrata=" + this.cilindrata + ", marca='" + this.marca + "'}";
    }
}
