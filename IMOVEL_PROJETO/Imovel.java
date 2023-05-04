public class Imovel{

    private String endereco;
    private String tipo;
    private String proprietario;
    private float area;
    private float preco;

    public String getEndereco() {
        return endereco;
    }
    
    public String getTipo() {
        return tipo;
    }

    public String getProprietario() {
        return proprietario;
    }

    public float getArea() {
        return area;
    }

    public float getPreco() {
        return preco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }


}