package sample;

public class GameController {
    private Monster m1, m2;
    private int turn; // -1 , 1
    private int round;

    public GameController(Monster m1, Monster m2){
        this.m1 = m1;
        this.m2 = m2;
        this.turn = 1;
        this.round = 1;

    }


    public void attackState(){
        if(getTurn() == 1) {
            if(m1.getBool_heal()) m2.hurt(m1);
            else m1.reco_bool_heal();
        } else if(getTurn() == -1){
            if(m2.getBool_heal()) m1.hurt(m2);
            else m2.reco_bool_heal();
            round++;
        }
        changeTurn();
    }
    public void healState(int healHp){
        if(getTurn() == 1) {
            if(m1.getBool_heal()) m1.Heal(healHp);
            else m1.reco_bool_heal();
        } else {
            if(m2.getBool_heal()) m2.Heal(healHp);
            else m2.reco_bool_heal();
            round++;
        }
        changeTurn();
    }
    public boolean isWin(){
        if (m1.isDead() && m2.isDead()) return true;
        else return false;
    }
    public String turnMon(){
        if(getTurn() == 1) return m1.getName();
        else return m2.getName();
    }
    public Monster getWinMonster(){
        if (m1.getHp() >= m2.getHp()){
            return m1;
        }
        return m2;
    }
    private void changeTurn(){
        this.turn *= -1;
    }

    public int getTurn() {
        return turn;
    }

    public int getRound() {
        return round;
    }
}
