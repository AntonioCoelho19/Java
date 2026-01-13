public class Pet {

    private String name;
    private boolean isWashed;

    public Pet(String name, boolean isWashed) {
        this.name = name;
        this.isWashed = isWashed;
    }

    public boolean getIsWashed() {
        return isWashed;
    }

    public void setIsWashed(boolean isWashed) {
        this.isWashed = isWashed;
    }

    public String getName() {
        return name;
    }

}
