package jp.ac.uryukyu.ie.e225737;

public class Warrior extends Hero{

    public Warrior (String name, int maximumHP, int attack) {
        
        super(name,maximumHP,attack);

    }

    public void attackWithWeponSkill(LivingThing l){
        if(dead == false){
        int damage = (int)(attack*1.5);
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, l.getName(), damage);
        l.wounded(damage);
        }
    }
    
}