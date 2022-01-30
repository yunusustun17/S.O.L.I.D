package correct;

public class DatabaseLogger extends ConnectableLogger{
    @Override
    public void openConnection() {

    }

    @Override
    public void closeConnection() {

    }

    @Override
    public void log() {
        openConnection();
        // LOG
        closeConnection();
    }
}
