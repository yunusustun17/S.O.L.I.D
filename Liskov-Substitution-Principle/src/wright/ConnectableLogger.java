package wright;

public abstract class ConnectableLogger extends Logger {
    public abstract void openConnection();

    public abstract void closeConnection();
}
