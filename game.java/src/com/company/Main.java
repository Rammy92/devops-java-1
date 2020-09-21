package com.company;

public class Main {

    String characterName;
    String weaponName;
    int weaponDamage;
    int hp;
    static int hammerMaximumDamage = 50;
    static int hammerMinimumDamage = 10;

    static int hammer = (int) (Math.random() * ((hammerMaximumDamage - hammerMinimumDamage) + 1)) + hammerMinimumDamage;
    static int magicWandMaximumDamage = 100;
    static int magicWandMinimumDamage = 0;
    static int magicWand = (int) (Math.random() * (magicWandMaximumDamage - magicWandMinimumDamage));

    public Main(String charName, int wDamage, int health, String wName) {
        characterName = charName;
        weaponName = wName;
        weaponDamage = wDamage;
        hp = health;
    }

    public void beingAttacked(String defenderName, String attackerName, int attackerWeaponDamage, String attackerWeaponName) {
        if (hp <= 0 || attackerWeaponName == "Excalibur") {
            System.err.println("YOU CANNOT ATTACK");
        } else {
            /* System.err.println("WILD " + attackerName + " APPEARS!"); */
            System.out.println(attackerName + " STRIKES " + defenderName + " WITH A " + attackerWeaponName + " IT DOES " + attackerWeaponDamage + " DAMAGE");
            hp = (hp - attackerWeaponDamage);
            System.out.println(defenderName + " HAS " + hp + " REMAINING HEALTH! ");
        }
    }

    public static void searchWeapon(String weaponName) {
        switch(weaponName) {
            case "Hammer":
                System.out.println(weaponName + " is used by the Good guy. " );
                break;
            case "Magic Wand":
                System.out.println(weaponName + " is used by the Evil guy. ");
                break;
            default:
                System.err.println("Cant find a hero that use " + weaponName + " as a weapon.");
                break;
        }
    }

    public void changeWeapon() {
        weaponName = "Excalibur";
        System.out.println("The evil guy has changed his weapon to " + weaponName + ".");

    }

    public void drinkingHealingPotion() {
        int healingPotion = 20;
        hp = hp + healingPotion;
        System.out.println(characterName + " GAINED " + healingPotion + " HEALTH BY DRINKING A HEALING POTION");
        System.out.println(characterName + " NOW HAS A HEALTH OF " + hp);
    }



    public static void main(String[] args) {
        Main goodGuy = new Main("The Beast", hammer, 100, "Hammer");
        Main evilGuy = new Main("Ja'far", magicWand, 80, "Magic Wand");

        goodGuy.beingAttacked(goodGuy.characterName, evilGuy.characterName, evilGuy.weaponDamage, evilGuy.weaponName);
        evilGuy.beingAttacked(evilGuy.characterName, goodGuy.characterName, goodGuy.weaponDamage, goodGuy.weaponName );
        goodGuy.drinkingHealingPotion();
        evilGuy.drinkingHealingPotion();
        searchWeapon("Hammer");
        evilGuy.changeWeapon();
        searchWeapon("Spoon");
    }
}