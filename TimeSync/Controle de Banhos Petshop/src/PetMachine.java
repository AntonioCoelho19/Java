public class PetMachine {

    private Pet pet = null;
    private boolean isFull = false;
    private boolean isClean = true;
    private int water = 30;
    private int shampoo = 10;

    public void bath() {
        if (!isFull)
            System.out.println("Á máquina de banhos está vazia!");
        else if (!isClean)
            System.out.println("Á máquina está suja! Limpe-a antes de usa-la");
        else if (water < 10 && shampoo < 2)
            System.out.println("Água ou shampoo em falta!");
        else if (pet.getIsWashed())
            System.out.println("O pet já está limpo");
        else {
            pet.setIsWashed(true);
            water -= 10;
            shampoo -= 2;
        }
    }

    public void waterRefill() {
        if (water <= 28) {
            water += 2;
            System.out.println("Água abastecida com sucesso. Capacidade atual: " + water + " litros");
        } else
            System.out.println("Tanque de água cheio");
    }

    public void shampooRefill() {
        if (shampoo <= 8) {
            shampoo += 2;
            System.out.println("Shampoo abastecido com sucesso. Capacidade atual: " + shampoo + " litros");
        } else
            System.out.println("Tanque de shampoo cheio");
    }

    public void checkWater() {
        System.out.println("Capacidade atual: " + water + " litros");
    }

    public void checkShampoo() {
        System.out.println("Capacidade atual: " + shampoo + " litros");
    }

    public boolean getIsFull() {
        return isFull;
    }

    public void petInTheMachine(Pet newPet) {
        if (isFull)
            System.out.println("A máquina está cheia");
        else if (isFull == false && isClean) {
            isFull = true;
            pet = newPet;
            System.out.println("Pet colocado na máquina");
        }
    }

    public void petOutTheMachine() {
        if (isFull) {
            if (!pet.getIsWashed()) {
                isClean = false;
            }
            isFull = false;
            pet = null;
            System.out.println("Pet retirado com sucesso");
        } else
            System.out.println("Máquina vázia");

    }

    public void cleanMachine() {
        if (!isClean) {
            water -= 3;
            shampoo--;
            isClean = true;
            System.out.println("Máquina limpa com sucesso");
        } else
            System.out.println("A máquina já está limpa");
    }

}
