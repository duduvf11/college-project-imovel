// Eduardo Viegas Francisco RA:2525259
final class Sala_Comercial extends Imovel{

    private String tipo_negocio;
    private int capacidade_max;

    Sala_Comercial(){
        setTipo_negocio("");
    }

    //polimorfismo por sobrecarga
    Sala_Comercial(String tipo_negocio, int capacidade_max){
        this.tipo_negocio = tipo_negocio;
        this.capacidade_max = capacidade_max;
    }

    public String getTipo_negocio() {
        return tipo_negocio;
    }

    public int getCapacidade_max() {
        return capacidade_max;
    }

    public void setTipo_negocio(String tipo_negocio) {
        this.tipo_negocio = tipo_negocio;
    }

    public void setCapacidade_max(int capacidade_max) throws CapacidadeMaximaException{
        if(capacidade_max > 4){
            throw new CapacidadeMaximaException();
    
        }
        this.capacidade_max = capacidade_max;
    }

    //polimorfismo por sobreescrita
    public void exibirDados() {
        System.out.println("================================ Sala Comercial ================================");
        System.out.println("\nEndereco .......................: "+this.getEndereco());
        System.out.println("Tipo de Sala Comercial .........: "+this.getTipo());
        System.out.println("Proprietario da Sala Comercial .: "+this.getProprietario());
        System.out.println("Area da Sala Comercial .........: "+this.getArea());
        System.out.println("Preco da Sala Comercial ........: "+this.getPreco());
        System.out.println("Tipo de Negocio ................: "+this.getTipo_negocio());
        System.out.println("Capacidade Maxima ..............: "+this.getCapacidade_max());
    }
}