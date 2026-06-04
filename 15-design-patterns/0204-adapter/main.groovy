class CelsiusSource {
    int celsius
    CelsiusSource(int c) { celsius = c }
}

interface FahrenheitReading { int fahrenheit() }

class CelsiusToFahrenheit implements FahrenheitReading {
    CelsiusSource source
    int fahrenheit() { source.celsius * 9 / 5 + 32 }
}

FahrenheitReading reading = new CelsiusToFahrenheit(source: new CelsiusSource(100))
println(reading.fahrenheit())
