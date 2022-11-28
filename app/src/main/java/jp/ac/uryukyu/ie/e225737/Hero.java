package jp.ac.uryukyu.ie.e225737;

public class Hero extends LivingThing {

    public Hero (String name, int maximumHP, int attack) {
        
        super(name,maximumHP,attack);

    }
    
    @Override
    public void wounded(int damage){
        this.hitPoint -= damage;
        if( this.hitPoint < 0 ) {
            this.dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }
}