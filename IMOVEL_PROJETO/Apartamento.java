// Eduardo Viegas Francisco RA:2525259
final class Apartamento extends Imovel{

    private float preco_condominio;
    private String varanda;
    
    Apartamento(){
        setPreco_condominio(0);
        setVaranda("");
    }

    //polimorfismo por sobrecarga
    Apartamento(float preco_condominio, String varanda){
        this.preco_condominio = preco_condominio;
        this.varanda = varanda;
    }

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

    //polimorfismo por sobreescrita
    public void exibirDados() {
        System.out.println("================================ Aparatamento ================================");
        System.out.println("\nEndereco ...................................: "+this.getEndereco());
        System.out.println("Tipo de Apartamento ........................: "+this.getTipo());
        System.out.println("Proprietario do Apartamento ................: "+this.getProprietario());
        System.out.println("Area do Apartamento ........................: "+this.getArea());
        System.out.println("Preco do Apartamento .......................: "+this.getPreco());
        System.out.println("Preco do Apartamento .......................: "+this.getPreco_condominio());
        System.out.println("Quantidade de Varandas .....................: "+this.getVaranda());
    }
}
