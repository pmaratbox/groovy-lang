interface Button { String label() }
interface Checkbox { String label() }

interface ThemeFactory {
    Button button()
    Checkbox checkbox()
}

class DarkButton implements Button { String label() { 'dark-button' } }
class DarkCheckbox implements Checkbox { String label() { 'dark-checkbox' } }

class DarkFactory implements ThemeFactory {
    Button button() { new DarkButton() }
    Checkbox checkbox() { new DarkCheckbox() }
}

ThemeFactory factory = new DarkFactory()
println([factory.button().label(), factory.checkbox().label()].join(' '))
