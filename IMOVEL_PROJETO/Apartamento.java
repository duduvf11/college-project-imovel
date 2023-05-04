// Eduardo Viegas Francisco RA:2525259
final class Apartamento extends Imovel{

    private float preco_condominio;
    private String varanda;
    
    public float getPreco_condominio() {
        return preco_condominio;
    }

    public String getVaranda() {
        return varanda;
    }

    public void setPreco_condominio(float preco_condominio) {
        this.preco_condominio = preco_condominio;
    }

    public void setVaranda(String varanda) {
        this.varanda = varanda;
    }
}
