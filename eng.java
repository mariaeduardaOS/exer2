public class eng {
    private int idEng;
    private String nomeEng;
    private String especialidade;

    public eng(int idEng, String nomeEng, String especialidade) {
        this.idEng = idEng;
        this.nomeEng = nomeEng;
        this.especialidade = especialidade;
    }

    public int getidEng() {
        return idEng;
    }

    public String getnomeEng() {
        return nomeEng;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setidEng(int idEng) {
        this.idEng = idEng;
    }

    public void setnomeEng(String nomeEng) {
        this.nomeEng = nomeEng;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
