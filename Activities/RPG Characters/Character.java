public class Character {
    
    private int health; // hp of Character
    private int damage; // dmg capability of Character
    private int shield; // shield str of Character
    
    public Character(int health, int damage, int shield){
        this.health = health;
        this.damage = damage;
        this.shield = shield;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getHealth(){
        return this.health;
    }

    public int getDamage(){
        return this.damage;
    }

    public int getShield(){
        return this.shield;
    }

    public void receiveDamage(int damage){
        int effectiveDamage = Math.max(0, damage - this.shield);
        this.health -= effectiveDamage;

        if(this.health <= 0){
            System.out.println("Character has died");
        }
    }
}