package wrong;

public class DatabaseLogger extends Logger {
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
