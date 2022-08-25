package design.patterns.example.strategy.characters

import design.patterns.example.strategy.behaviors.WeaponBehavior

abstract class Character {
    open lateinit var weapon: WeaponBehavior
    abstract fun fight()
}