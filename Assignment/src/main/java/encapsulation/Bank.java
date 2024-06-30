package encapsulation;

public class Bank {
    // Declare pin as a private variable
    private int pin;

    // Method to set the pin
    public void setPin(int pin) {
        this.pin = pin;
    }

    // Method to validate the pin
    public boolean validatePin(int enteredPin) {
        int[] validPins = {1001, 1234, 1212};
        for (int validPin : validPins) {
            if (validPin == enteredPin) {
                return true;
            }
        }
        return false;
    }
}