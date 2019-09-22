package Message;
import Communicator.DroneCommunicator;

public class MoveLeft extends Message {
//    private DroneCommunicator droneCommunicator;
//    public MoveLeft(DroneCommunicator droneCommunicator) {
//        this.droneCommunicator = droneCommunicator;
//    }

    @Override
    public void doAction(DroneCommunicator droneCommunicator) throws Exception {
        droneCommunicator.sendRequest("left 50");
//        droneCommunicator.getState();
        Thread.sleep(5000);
    }

//    @Override
//    public String getMessageType() {
//        return null;
//    }
}
