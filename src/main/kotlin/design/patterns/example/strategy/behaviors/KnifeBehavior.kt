package design.patterns.example.strategy.behaviors

class KnifeBehavior(): WeaponBehavior {
    override fun useWeapon() {
        println("use ${this.javaClass.simpleName}")
    }
}