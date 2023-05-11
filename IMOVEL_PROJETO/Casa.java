// Eduardo Viegas Francisco RA:2525259
final class Casa extends Imovel{

    private float area_terreno;
    private int idade_construcao;
    
    Casa(){

        setArea_terreno(0);
        setIdade_construcao(0);
    }

    //polimorfismo por sobrecarga
    Casa(float area_terreno, int idade_construcao ){
        this.area_terreno = area_terreno;
        this.idade_construcao = idade_construcao;
        
    }

    public float getArea_terreno() {
        return area_terreno;
    }

    public int getIdade_construcao() {
        return idade_construcao;
    }

    public void setArea_terreno(float area_terreno) {
        this.area_terreno = area_terreno;
    }

    public void setIdade_construcao(int idade_construcao) {
        this.idade_construcao = idade_construcao;
    }

    //polimorfismo por sobreescrita
    public void exibirDados() {
        System.out.println("================================ Casa ================================");
        System.out.println("\nEndereco ...............: "+this.getEndereco());
        System.out.println("Tipo de Casa ...........: "+this.getTipo());
        System.out.println("Proprietario da Casa  ..: "+this.getProprietario());
        System.out.println("Area da Casa  ..........: "+this.getArea());
        System.out.println("Preco da Casa  .........: "+this.getPreco());
        System.out.println("Area do Terreno ........: "+this.getArea_terreno());
        System.out.println("Idade da Construcao ....: "+this.getIdade_construcao());
    }
}