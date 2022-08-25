package design.patterns.example.strategy.behaviors

class AxeBehavior: WeaponBehavior {
    override fun useWeapon() {
        println("use ${this.javaClass.simpleName}")
    }
}