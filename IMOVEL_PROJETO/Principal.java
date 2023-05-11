// Eduardo Viegas Francisco RA:2525259
public class Principal implements Agradecimetos{

    public static void main(String arg[]){

        int modelo = 0;
        boolean verificador = true;

        Leitura l = new Leitura();
        Casa c = new Casa(0,0);
        Apartamento a = new Apartamento(0,"");
        Sala_Comercial sc = new Sala_Comercial("",0);

       
        do{
            try{
                modelo = Integer.parseInt(l.entDados("\nQual seu modelo de imovel?\n1 - Casa\n2 - Apartamento\n3 - Sala Comercial."));
            } catch(NumberFormatException e){
                System.out.println("Entrada inválida! Letras não são aceitas.");
                continue;
            }
            switch (modelo){
                
            case 1:
                c.setEndereco(l.entDados("\nQual o endereco da sua casa?"));
                c.setTipo(l.entDados("\nQual o tipo de casa?(Para aluguel, venda, etc)"));
                c.setProprietario(l.entDados("\nQual o proprietario da casa?"));
                c.setArea(Float.parseFloat(l.entDados("\nQual a area da casa?(Apenas do imovel em si)")));
                c.setPreco(Float.parseFloat(l.entDados("\nQual o preco da casa?")));
                c.setArea_terreno(Float.parseFloat(l.entDados("\nQual a area do terreno?")));
                c.setIdade_construcao(Integer.parseInt(l.entDados("\nQuando foi feita a casa?")));

                c.exibirDados();
                obrigado();
                break;
            
            case 2:
                a.setEndereco(l.entDados("\nQual o endereco do apartamento?"));
                a.setTipo(l.entDados("\nQual o tipo de apartamento?(Para aluguel, venda, etc)"));
                a.setProprietario(l.entDados("\nQual o proprietario do apartamento?"));
                a.setArea(Float.parseFloat(l.entDados("\nQual a area do apartamento?")));
                a.setPreco(Float.parseFloat(l.entDados("\nQual o preco do apartamento?")));
                a.setPreco_condominio(Float.parseFloat(l.entDados("\nQual o preco do condominio?")));
                a.setVaranda(l.entDados("\nO apartamento tem quantas varanda?"));
                
                a.exibirDados();
                obrigado();
                break;
            
            case 3:
                sc.setEndereco(l.entDados("\nQual o endereco da sala comercial?"));
                sc.setTipo(l.entDados("\nQual o tipo de sala comercial?(Para aluguel, venda, etc)"));
                sc.setProprietario(l.entDados("\nQual o proprietario da sala comercial?"));
                sc.setArea(Float.parseFloat(l.entDados("\nQual a area da sala comercial?")));
                sc.setPreco(Float.parseFloat(l.entDados("\nQual o preco da sala comercial?")));
                sc.setTipo_negocio(l.entDados("\nQual o tipo recomendado de negocio para sua sala comercial?(Clinica medica, consultoria, escritorio, etc)"));
               
                while(verificador){

                    try {
                        sc.setCapacidade_max(Integer.parseInt(l.entDados("\nQual a capacidade maxima da sala comercial?(Pessoas por metro quadrado)")));
                        verificador = false;
                    }
                    catch(CapacidadeMaximaException cme){
                        cme.MsgAlertaCME();
                    }
                }
                    
                sc.exibirDados();
                obrigado();
                break;
            
            default:
            System.out.println("Invalido" + "\nPor favor, escolha um dos números correspondentes acima.");
            
        }

    }while(modelo != 1 && modelo != 2 && modelo != 3);
        
    }

    private static void obrigado() {
        System.out.println("Obrigado por se cadastrar!");
    }

}
