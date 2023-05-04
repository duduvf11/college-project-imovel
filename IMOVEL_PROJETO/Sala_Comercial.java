// Eduardo Viegas Francisco RA:2525259
final class Sala_Comercial extends Imovel{

    private String tipo_negocio;
    private int capacidade_max;

    public String getTipo_negocio() {
        return tipo_negocio;
    }

    public int getCapacidade_max() {
        return capacidade_max;
    }

    public void setTipo_negocio(String tipo_negocio) {
        this.tipo_negocio = tipo_negocio;
    }

    public void setCapacidade_max(int capacidade_max) {
        this.capacidade_max = capacidade_max;
    }
}