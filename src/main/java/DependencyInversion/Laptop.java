package DependencyInversion;

import DependencyInversion.Peripherals.Keyboard;
import DependencyInversion.Peripherals.Monitor;
import DependencyInversion.Peripherals.Mouse;

public class Laptop {

    private final Keyboard keyboard;
    private final Monitor monitor;
    private final Mouse mouse;

    public Laptop(Keyboard keyboard, Monitor monitor, Mouse mouse) {
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.mouse = mouse;
    }
}
