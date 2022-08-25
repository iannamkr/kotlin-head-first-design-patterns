package design.patterns.example.strategy.behaviors

class SwordBehavior: WeaponBehavior {
    override fun useWeapon() {
        println("use ${this.javaClass.simpleName}")
    }
}