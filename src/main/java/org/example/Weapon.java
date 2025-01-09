package org.example;

public enum Weapon {
    SWORD(60, 5),
    BOW(45, 3);

    private final int damage;
    private final double attackSpeed;

    Weapon(int damage, double attackSpeed){
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public  int getDamage(){
        return damage;
    }

    public double getAttackSpeed(){
        return attackSpeed;
    }

}
