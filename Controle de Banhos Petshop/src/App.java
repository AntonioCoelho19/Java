import java.util.Scanner;

public class App {
   private static final Scanner scanner;
   private static final PetMachine machine;

   public static void main(String[] var0) {

      int var2;
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
         var2 = scanner.nextInt();
         System.out.print("\n");
         switch (var2) {
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
               System.out.println(machine.getIsFull() ? "Tem pet no banho" : "Máquina vázia");
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
      } while(var2 != 0);

   }

   private static void pickPet() {
      System.out.println("Entre com o nome do pet");
      String var0 = scanner.next();
      Pet var1 = new Pet(var0, false);
      machine.petInTheMachine(var1);
   }

   static {
      scanner = new Scanner(System.in);
      machine = new PetMachine();
   }
}
