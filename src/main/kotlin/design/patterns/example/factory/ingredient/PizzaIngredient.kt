package design.patterns.example.factory.vo

open class Dough
open class Sauce
open class Cheese
open class Veggies
open class Pepperoni
open class Clams


class ThickCrustDough: Dough()
class ThinCrustDough: Dough()

class PlumTomatoSauce: Sauce()
class MarinaraSauce: Sauce()

class MozzarellaChesse: Cheese()
class ReggianoCheese: Cheese()

class FrozenClams: Clams()
class FreshClams: Clams()

class BlackOlive: Veggies()
class Garlic: Veggies()
class Spinach : Veggies()
class Eggplant : Veggies()
class Onion: Veggies()
class Mushroom: Veggies()
class RedPepper: Veggies()

class SlicedPepperoni: Pepperoni()