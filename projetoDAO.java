import java.sql.Date;

public class projetoDAO {
    private String nomeProje;
    private String local;
    private Date dtTermino;

    public projetoDAO(String nomeProje, String local, Date dtTermino) {
        this.nomeProje = nomeProje;
        this.nomeProje = nomeProje;
        this.local = local;
        this.dtTermino = dtTermino;
        this.dtTermino = dtTermino;
    }

    public String getnomeProje() {
        return nomeProje;
    }

    public String getLocal() {
        return local;
    }

    public Date getdtTermino() {
        return dtTermino;
    }

    public void setnomeProje(String nomeProje) {
        this.nomeProje = nomeProje;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setdtTermino(Date dtTermino) {
        this.dtTermino = dtTermino;
    }

}
