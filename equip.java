public class Equipamento {
    private int idEquip;
    private String nomeEquip;
    private String tipo;

    public Equipamento(int idEquip, String nomeEquip, String tipo) {
        this.idEquip = idEquip;
        this.nomeEquip = nomeEquip;
        this.tipo = tipo;
    }

    public int getidEquip() {
        return idEquip;
    }

    public String getnomeEquip() {
        return nomeEquip;
    }

    public String getTipo() {
        return tipo;
    }

    public void setidEquip(int idEquip) {
        this.idEquip = idEquip;
    }

    public void setnomeEquip(String nomeEquip) {
        this.nomeEquip = nomeEquip;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
