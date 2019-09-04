public class Monster {
    private String name;
    private int hp, atk, def, max_hp;
    boolean bool_heal = true;
    public Monster(String name, int hp, int atk, int def) {
        this.name = name;
        this.hp = hp;
        this.max_hp = hp;
        this.atk = atk;
        this.def = def;
    }

    public void Heal(int heal) {
        if((this.hp + heal) > this.max_hp){
            this.hp = this.max_hp;
        }else this.hp += heal;
        bool_heal = false;
    }

    public void reco_bool_heal(){
        bool_heal = true;
    }

    public String getName(){
        return name;
    }
    public int getAtk() {
        return atk;
    }
    public int getDef(){
        return def;
    }
    public int getHp(){
        return hp;
    }
    public int getMax_hp(){
        return max_hp;
    }
    public boolean getBool_heal(){
        return bool_heal;
    }

    public void hurt(Monster other) {
        if(other.atk > def){
            if((def + hp) <= other.atk) hp = 0;
            else hp -= other.atk - def;
        }
    }

    public String info(){
        return "Monster " +getName()+ " atk : " +getAtk()+ " def : " +getDef()+ " hp : " +getHp()+  "/" +getMax_hp();
    }
}
