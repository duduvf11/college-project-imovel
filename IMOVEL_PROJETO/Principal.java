public class Principal {

    public static void main(String arg[]){

        String modelo = "Imovel";

        Leitura l = new Leitura();
        Casa c = new Casa();
        Apartamento a = new Apartamento();
        Sala_Comercial sc = new Sala_Comercial();

        modelo = l.entDados("\nQual seu modelo de imovel? Casa, Apartamento ou Sala Comercial.");

        if(modelo.compareTo("Casa") == 0|| modelo.compareTo("casa") == 0 ){

            c.setEndereco(l.entDados("\nQual o endereco da sua casa?"));
            c.setTipo(l.entDados("\nQual o tipo de casa?"));
            c.setProprietario(l.entDados("\nQual o proprietario da casa?"));
            c.setArea(Float.parseFloat(l.entDados("\nQual a area da casa?")));
            c.setPreco(Float.parseFloat(l.entDados("\nQual o preco da casa?")));
            c.setArea_terreno(Float.parseFloat(l.entDados("\nQual a area extra do terreno?")));
            c.setIdade_construcao(Integer.parseInt(l.entDados("\nQuando foi feita a casa?")));
            
            System.out.println("\nEndereco ...............: "+c.getEndereco());
            System.out.println("Tipo de Casa ...........: "+c.getTipo());
            System.out.println("Proprietario da Casa  ..: "+c.getProprietario());
            System.out.println("Area da Casa  ..........: "+c.getArea());
            System.out.println("Preco da Casa  .........: "+c.getPreco());
            System.out.println("Area do Terreno ........: "+c.getArea_terreno());
            System.out.println("Idade da Construcao ....: "+c.getIdade_construcao());

        } 
        if(modelo.compareTo("Apartamento") == 0|| modelo.compareTo("apartamento") == 0){

            a.setEndereco(l.entDados("\nQual o endereco do apartamento?"));
            a.setTipo(l.entDados("\nQual o tipo de apartamento?"));
            a.setProprietario(l.entDados("\nQual o proprietario do apartamento?"));
            a.setArea(Float.parseFloat(l.entDados("\nQual a area do apartamento?")));
            a.setPreco(Float.parseFloat(l.entDados("\nQual o preco do apartamento?")));
            a.setPreco_condominio(Float.parseFloat(l.entDados("\nQual o preco do condominio?")));
            a.setVaranda(l.entDados("\nO apartamento tem varanda?"));

            System.out.println("\nEndereco ....................: "+a.getEndereco());
            System.out.println("Tipo de Apartamento .........: "+a.getTipo());
            System.out.println("Proprietario do Apartamento .: "+a.getProprietario());
            System.out.println("Area do Apartamento .........: "+a.getArea());
            System.out.println("Preco do Apartamento ........: "+a.getPreco());
            System.out.println("Preco do Apartamento ........: "+a.getPreco_condominio());
            System.out.println("Varanda .....................: "+a.getVaranda());
        } 
        if(modelo.compareTo("Sala Comercial") == 0|| modelo.compareTo("sala comercial") == 0) {

            sc.setEndereco(l.entDados("\nQual o endereco da sala comercial?"));
            sc.setTipo(l.entDados("\nQual o tipo de sala comercial?"));
            sc.setProprietario(l.entDados("\nQual o proprietario da sala comercial?"));
            sc.setArea(Float.parseFloat(l.entDados("\nQual a area da sala comercial?")));
            sc.setPreco(Float.parseFloat(l.entDados("\nQual o preco da sala comercial?")));
            sc.setTipo_negocio(l.entDados("\nQual o tipo recomendado de negocio para sua sala comercial?"));
            sc.setCapacidade_max(Integer.parseInt(l.entDados("\nQual a capacidade maxima da sala comercial?")));

            System.out.println("\nEndereco .......................: "+sc.getEndereco());
            System.out.println("Tipo de Sala Comercial .........: "+sc.getTipo());
            System.out.println("Proprietario do Sala Comercial .: "+sc.getProprietario());
            System.out.println("Area do Sala Comercial .........: "+sc.getArea());
            System.out.println("Preco do Sala Comercial ........: "+sc.getPreco());
            System.out.println("Tipo de Negocio ................: "+sc.getTipo_negocio());
            System.out.println("Capacidade Maxima ..............: "+sc.getCapacidade_max());

        }

    }
}
