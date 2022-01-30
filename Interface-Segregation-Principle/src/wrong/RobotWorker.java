package wrong;

public class RobotWorker implements IWorker {

    @Override
    public void eat() throws Exception {
        throw new Exception();
    }

    @Override
    public void word() {

    }

    @Override
    public void pay() throws Exception {
        throw new Exception();
    }
}
