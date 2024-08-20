import java.sql.Date;

public class projeto {
    private int idprojeto;
    private String nomeProjeto;
    private String local;
    private Date dtInicio;
    private Date dtTermino;

    public projeto(int idprojeto, String nomeProjeto, String local, Date dtInicio, Date dtTermino) {
        this.idprojeto = idprojeto;
        this.nomeProjeto = nomeProjeto;
        this.local = local;
        this.dtInicio = dtInicio;
        this.dtTermino = dtTermino;
    }

    public int getidprojeto() {
        return idprojeto;
    }

    public String getnomeProjeto() {
        return nomeProjeto;
    }

    public String getLocal() {
        return local;
    }

    public Date getdtInicio() {
        return dtInicio;
    }

    public Date getdtTermino() {
        return dtTermino;
    }

    public void setidprojeto(int idprojeto) {
        this.idprojeto = idprojeto;
    }

    public void setnomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setdtInicio(Date dtInicio) {
        this.dtInicio = dtInicio;
    }

    public void setdtTermino(Date dtTermino) {
        this.dtTermino = dtTermino;
    }
}
