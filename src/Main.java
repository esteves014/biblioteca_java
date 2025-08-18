import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();
        String titleBook;
        String authorBook;
        int contBook;
        int opc;
        List<String> books = new ArrayList<>();

        System.out.println("=======Administrador=======");
        System.out.print("Olá Adm! Digite o login do gerente: ");
        var login = sc.next();

        System.out.print("Olá Adm! Digite a senha do gerente: ");
        var password = sc.next();

        manager.setLogin(login);
        manager.setPassword(password);

        System.out.print("Deseja acessar o menu de Gerente?(S/N): ");
        var acessManagerPanel = sc.next().charAt(0);
        acessManagerPanel = Character.toUpperCase(acessManagerPanel);

        if (acessManagerPanel == 'S') {

            do {
                System.out.println("=======Gerente=======");
                System.out.println("Digite 1 -> Cadastrar Livro");
                System.out.println("Digite 2 -> Listar livros");
                System.out.println("Digite 3 -> Alterar senha");
                System.out.println("Digite 0 -> Encerrar programa");

                System.out.print("Digite sua opção: ");
                opc = sc.nextInt();

                switch (opc){
                    case 1:
                        System.out.print("\n\nDigite o titulo do livro: ");
                        titleBook = sc.next();
                        System.out.print("Digite o author do livro");
                        authorBook = sc.next();

                        books.add(new Book(titleBook, authorBook).toString());
                        System.out.println("Livro adicionado!");
                        break;
                    case 2:
                        books.forEach(System.out::println);
                        break;
                }

                System.out.print("Olá! Digite o Login do gerente: ");
                var loginManager = sc.next();

                System.out.print("Olá! Digite a senha do gerente: ");
                var passwordManager = sc.next();

                if (manager.verifyLogin(loginManager, passwordManager)) {
                    System.out.println();
                }

                System.out.println("=====================");
            } while (opc != 0);
        } else{
            System.out.println("Encerrando Sistema...");
        }

        System.out.print("===========================");
    }
}