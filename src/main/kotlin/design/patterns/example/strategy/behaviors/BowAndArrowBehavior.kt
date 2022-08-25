package design.patterns.example.strategy.behaviors

class BowAndArrowBehavior: WeaponBehavior {
    override fun useWeapon() {
        println("use ${this.javaClass.simpleName}")
    }
}