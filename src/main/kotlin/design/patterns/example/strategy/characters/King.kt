package design.patterns.example.strategy.characters

import design.patterns.example.strategy.behaviors.WeaponBehavior

class King(override var weapon: WeaponBehavior): Character() {
    override fun fight() {
        println("${this.javaClass.simpleName} fight with ${weapon.javaClass.simpleName}")
    }
}