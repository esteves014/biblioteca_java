import Users.Manager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();

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
            var opc = sc.nextInt();
            do {

                System.out.print("Olá! Digite o Login do gerente: ");
                var loginManager = sc.next();

                System.out.print("Olá! Digite o Login do gerente: ");
                var passwordManager = sc.next();

                if (manager.verifyLogin(loginManager, passwordManager)) {
                    System.out.println();
                }

            } while (opc != 0);
        } else{
            System.out.println("Sistema encerrado.");
        }

        System.out.print("===========================");
    }
}