public class Character {
    private int health;
    private int stamina;

    private int maxHealth = 100;
    private int maxStamina = 50;
    private String name;

    public Character(String name) {
        this.health = maxHealth;
        this.stamina = maxStamina;
        this.name = name;
    }

    public int getHealth() {
        return this.health;
    }

    public int getStamina() {
        return this.stamina;
    }

    public void swingSword(){
        this.stamina -= 10;
        System.out.println("Character " + this.name + " swings sword. Stamina is now : " + this.stamina + ".");
        if (this.stamina <= 0) {
            this.stamina = 0;
            System.out.println("Your character " + this.name + " needs to cool down.");
            return;
        }
    }

    public void takeDamage(int damageAmount) {
        this.health -= damageAmount;
        System.out.println("Character " + this.name + " takes " + damageAmount + " damages. Health is now : " + this.health + ".");
        if (this.health <= 0) {
            this.health = 0;
            System.out.println("Character " + this.name + " is dead.");
            return;
        }
    }

    public void rest(){
        this.stamina = maxStamina;
        this.health = maxHealth;
        System.out.println("Character " + this.name + " has rested. Health and stamina restored to maximum.");
    }

    public void showDetails(){
        System.out.println("********************************");
        System.out.println("Character Name: " + this.name);
        System.out.println("Health : " + this.health);
        System.out.println("Stamina : " + this.stamina);
        System.out.println("********************************");
    }
}