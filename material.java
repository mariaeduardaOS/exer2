public class material {
    private int idMaterial;
    private String nomeMaterial;
    private int quantidade;

    public material(int idMaterial, String nomeMaterial, int quantidade) {
        this.idMaterial = idMaterial;
        this.nomeMaterial = nomeMaterial;
        this.quantidade = quantidade;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public String getNomeMaterial() {
        return nomeMaterial;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public void setNomeMaterial(String nomeMaterial) {
        this.nomeMaterial = nomeMaterial;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
