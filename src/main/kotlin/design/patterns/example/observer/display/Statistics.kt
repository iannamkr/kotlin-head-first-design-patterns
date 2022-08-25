package design.patterns.example.observer.display

data class Statistics(
    var min: Float = Float.MAX_VALUE,
    var max: Float = 0.0f,
    var sum: Float = 0.0f,
    var count: Int = 0,
)