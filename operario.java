public class operario {
    private int idoperario;
    private String nomeoperario;
    private String funcao;

    public operario(int idoperario, String nomeoperario, String funcao) {
        this.idoperario = idoperario;
        this.nomeoperario = nomeoperario;
        this.funcao = funcao;
    }

    public int getIdoperario() {
        return idoperario;
    }

    public String getnomeoperario() {
        return nomeoperario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setIdoperario(int idoperario) {
        this.idoperario = idoperario;
    }

    public void setnomeoperario(String nomeoperario) {
        this.nomeoperario = nomeoperario;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
