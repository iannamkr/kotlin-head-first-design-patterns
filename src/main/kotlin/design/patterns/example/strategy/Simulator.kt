package design.patterns.example.strategy

import design.patterns.example.strategy.behaviors.BowAndArrowBehavior
import design.patterns.example.strategy.behaviors.SwordBehavior
import design.patterns.example.strategy.characters.Character
import design.patterns.example.strategy.characters.King

fun main() {

    val king: Character = King(SwordBehavior())
    king.weapon = SwordBehavior()
    king.weapon.useWeapon()
    king.fight()

    king.weapon = BowAndArrowBehavior()
    king.weapon.useWeapon()
    king.fight()
}
