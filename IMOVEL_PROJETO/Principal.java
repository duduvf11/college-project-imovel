// Eduardo Viegas Francisco RA:2525259
abstract class Principal {

    public static void main(String arg[]){

        int modelo = 0;

        Leitura l = new Leitura();
        Casa c = new Casa(0,0);
        Apartamento a = new Apartamento(0,"");
        Sala_Comercial sc = new Sala_Comercial("", 0);

       
        do{
            modelo = Integer.parseInt(l.entDados("\nQual seu modelo de imovel?\n1 - Casa\n2 - Apartamento\n3 - Sala Comercial."));
            switch (modelo){
                
            case 1:
                c.setEndereco(l.entDados("\nQual o endereco da sua casa?"));
                c.setTipo(l.entDados("\nQual o tipo de casa?(Para aluguel, venda, etc)"));
                c.setProprietario(l.entDados("\nQual o proprietario da casa?"));
                c.setArea(Float.parseFloat(l.entDados("\nQual a area da casa?(Apenas do imovel em si)")));
                c.setPreco(Float.parseFloat(l.entDados("\nQual o preco da casa?")));
                c.setArea_terreno(Float.parseFloat(l.entDados("\nQual a area do terreno?")));
                c.setIdade_construcao(Integer.parseInt(l.entDados("\nQuando foi feita a casa?")));
                
                System.out.println("\nEndereco ...............: "+c.getEndereco());
                System.out.println("Tipo de Casa ...........: "+c.getTipo());
                System.out.println("Proprietario da Casa  ..: "+c.getProprietario());
                System.out.println("Area da Casa  ..........: "+c.getArea());
                System.out.println("Preco da Casa  .........: "+c.getPreco());
                System.out.println("Area do Terreno ........: "+c.getArea_terreno());
                System.out.println("Idade da Construcao ....: "+c.getIdade_construcao());
                break;
            
            case 2:
                a.setEndereco(l.entDados("\nQual o endereco do apartamento?"));
                a.setTipo(l.entDados("\nQual o tipo de apartamento?(Para aluguel, venda, etc)"));
                a.setProprietario(l.entDados("\nQual o proprietario do apartamento?"));
                a.setArea(Float.parseFloat(l.entDados("\nQual a area do apartamento?")));
                a.setPreco(Float.parseFloat(l.entDados("\nQual o preco do apartamento?")));
                a.setPreco_condominio(Float.parseFloat(l.entDados("\nQual o preco do condominio?")));
                a.setVaranda(l.entDados("\nO apartamento tem quantas varanda?"));
                
                System.out.println("\nEndereco ...................................: "+a.getEndereco());
                System.out.println("Tipo de Apartamento ........................: "+a.getTipo());
                System.out.println("Proprietario do Apartamento ................: "+a.getProprietario());
                System.out.println("Area do Apartamento ........................: "+a.getArea());
                System.out.println("Preco do Apartamento .......................: "+a.getPreco());
                System.out.println("Preco do Apartamento .......................: "+a.getPreco_condominio());
                System.out.println("Quantidade de Varandas .....................: "+a.getVaranda());
                break;
            
            case 3:
                sc.setEndereco(l.entDados("\nQual o endereco da sala comercial?"));
                sc.setTipo(l.entDados("\nQual o tipo de sala comercial?(Para aluguel, venda, etc)"));
                sc.setProprietario(l.entDados("\nQual o proprietario da sala comercial?"));
                sc.setArea(Float.parseFloat(l.entDados("\nQual a area da sala comercial?")));
                sc.setPreco(Float.parseFloat(l.entDados("\nQual o preco da sala comercial?")));
                sc.setTipo_negocio(l.entDados("\nQual o tipo recomendado de negocio para sua sala comercial?(Clinica medica, consultoria, escritorio, etc)"));
                sc.setCapacidade_max(Integer.parseInt(l.entDados("\nQual a capacidade maxima da sala comercial?(Pessoas por metro quadrado)")));
                
                System.out.println("\nEndereco .......................: "+sc.getEndereco());
                System.out.println("Tipo de Sala Comercial .........: "+sc.getTipo());
                System.out.println("Proprietario do Sala Comercial .: "+sc.getProprietario());
                System.out.println("Area do Sala Comercial .........: "+sc.getArea());
                System.out.println("Preco do Sala Comercial ........: "+sc.getPreco());
                System.out.println("Tipo de Negocio ................: "+sc.getTipo_negocio());
                System.out.println("Capacidade Maxima ..............: "+sc.getCapacidade_max());
                break;
            
            default:
            System.out.println("Invalido" + "\nPor favor, escolha um dos números correspondentes acima.");
            
        }

    }while(modelo != 1 || modelo != 2 || modelo != 3);
        
    }
}
