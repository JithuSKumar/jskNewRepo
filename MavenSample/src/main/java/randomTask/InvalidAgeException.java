package randomTask;

public class InvalidAgeException extends Exception 
{
    // Constructor that accepts a message
    public InvalidAgeException(String message) 
    {
        super(message); // Pass the message to the superclass constructor
    }
}
