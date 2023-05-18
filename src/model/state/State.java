package model.state;

public interface State {
    int getDamage();
    int getPrice();
    void handle();
}
