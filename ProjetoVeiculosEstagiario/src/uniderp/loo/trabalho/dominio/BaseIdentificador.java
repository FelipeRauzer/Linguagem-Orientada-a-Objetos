package uniderp.loo.trabalho.dominio;

public abstract class BaseIdentificador {
    protected int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public BaseIdentificador(int codigo) {
        this.codigo = codigo;
    }

    
}
