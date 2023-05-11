// Eduardo Viegas Francisco RA:2525259
final class Casa extends Imovel{

    private float area_terreno;
    private int idade_construcao;
    
    Casa(){

        setArea_terreno(0);
        setIdade_construcao(0);
    }

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

}