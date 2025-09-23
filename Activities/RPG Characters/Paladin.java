public class Paladin extends Swordsman{

    private boolean hasResurrected; 

    public Paladin(){
        super(); 
        this.hasResurrected = false;
    }

    @Override 
    public void receiveDamage(int damage){
        if (damage % 2 == 0) {
            damage /= 2;
        }

        int effectiveDamage = Math.max(0, damage - getShield());
        int newHp = getHealth() - effectiveDamage;
        setHealth(newHp);

        if (newHp <= 0) {
            resurrect();
        }
    }

    public void resurrect(){
        if (!hasResurrected) {
            hasResurrected = true;
            setHealth(100);
        } else {
            System.out.println("Paladin has died");
        }
    }
}
