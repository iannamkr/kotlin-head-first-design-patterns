package design.patterns.example.decorator.decorates

import design.patterns.example.decorator.beverages.Beverage

abstract class CondimentDecorator: Beverage() {
    abstract override val description: String
}