package model;

import model.state.State;

public abstract class Item {
    private int basePrice;
    private boolean wet;
    private int durability;
    private State currentState;

    public int getPrice() {
        return currentState.getPrice();
    }

    public int getBasePrice() {
        return basePrice;
    }
    
    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public boolean isWet() {
        return wet;
    }

    public void setWet(boolean wet) {
        this.wet = wet;
        this.currentState.handle();
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
        this.currentState.handle();
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State state) {
        this.currentState = state;
    }
}