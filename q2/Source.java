package ex8.q2;

import java.util.ArrayList;

public class Source {
    ArrayList<Observer> observers = new ArrayList<Observer>();
    ScoreServer server;

    public Source(ScoreServer s) {
        server = s;
    }
    public void registerObserver(Observer obv) {
        observers.add(obv);
    }
    public void notifyObservers(){
        for(Observer obv : observers){
            obv.update(server.getScore());
        }
    }
}
