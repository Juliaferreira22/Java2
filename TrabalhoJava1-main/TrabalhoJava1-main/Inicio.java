import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {
        
        Scanner menu = new Scanner (System.in);

        while (true) {

            System.out.println("---- CONCESSIONÁRIA ----");
            System.out.println("1 - Cadastrar carro");
            System.out.println("2 - Listar carro");
            System.out.println("3 - Cadastrar moto");
            System.out.println("4 - Listar moto");
            System.out.println("5 - Cadastrar caminhao");
            System.out.println("6 - Listar caminhao");
            System.out.println("7 - Mostrar ENUM");
            System.out.println("0 - Sair\n");

            int opcao = menu.nextInt();
            
            switch (opcao) {
                case 1:
                CadastrarCarro cadastrarCarro = new CadastrarCarro();
                cadastrarCarro.cadastrar();
                break;

                case 2:
                ListarCarro listarCarro = new ListarCarro();
                listarCarro.listar();
                break;

                case 3:
                CadastrarMoto cadastrarMoto = new CadastrarMoto();
                cadastrarMoto.cadastrar();
                break;

                case 4:
                ListarMoto listarMoto = new ListarMoto();
                listarMoto.listar();

                case 5: 
                CadastrarCaminhao cadastrarCaminhao = new CadastrarCaminhao();
                cadastrarCaminhao.cadastrar();

                case 6:
                ListarCaminhao listarCaminhao = new ListarCaminhao();
                listarCaminhao.listar();

                case 7: 
                Automovel al = new Automovel();
                al.imprimir_enum(); 
                break;
            }
            
            } 

            }

        }
            



         
       
