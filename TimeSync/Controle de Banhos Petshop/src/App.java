import java.util.Scanner;

public class App {

    private final static Scanner scanner = new Scanner(System.in);
    private final static PetMachine machine = new PetMachine();

    public static void main(String[] args) {

        var opcao = -1;

        do {
            System.out.print("\n");
            System.out.println("---MENU DE OPÇÕES---");
            System.out.println("1- Dar banho no pet");
            System.out.println("2- Abastecer com água");
            System.out.println("3- Abastecer com shampoo");
            System.out.println("4- Verificar nível da água");
            System.out.println("5- Verificar nível de shampoo");
            System.out.println("6- Verificar se tem pet no banho");
            System.out.println("7- Colocar pet na máquina");
            System.out.println("8- Retirar pet da máquna");
            System.out.println("9- Limpar máquina");
            System.out.println("0- Sair");

            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            System.out.print("\n");

            switch (opcao) {
                case 1:
                    machine.bath();
                    break;
                case 2:
                    machine.waterRefill();
                    break;
                case 3:
                    machine.shampooRefill();
                    break;
                case 4:
                    machine.checkWater();
                    break;
                case 5:
                    machine.checkShampoo();
                    break;
                case 6:
                    System.out.println(
                            machine.getIsFull() ? "O pet está no banho" : "Máquina vázia");
                    break;
                case 7:
                    pickPet();
                    break;
                case 8:
                    machine.petOutTheMachine();
                    break;
                case 9:
                    machine.cleanMachine();
                    break;
                default:
                    System.out.println("Opção inválida");

            }
        } while (opcao != 0);

    }

    private static void pickPet() {
        System.out.println("Entre com o nome do pet");
        var name = scanner.next();
        var pet = new Pet(name, false);
        machine.petInTheMachine(pet);
    }
}
