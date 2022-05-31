package domain;

public class Radio {

    private int currentStation;


    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;

    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            currentStation = 9;
        }
        if (currentStation > 9) {
            currentStation = 0;
        }
        this.currentStation = currentStation;

    }

    public void increaseStation() {
        int newCurrentStation = 0;
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation >= 9) {
            currentStation = newCurrentStation;
        }
        if (currentStation <= 0) {
            setCurrentStation(currentStation);
        }
    }

    public void reduceStation() {
        //int newCurrentStation1 = 9;
        if (currentStation <= 0) {
            currentStation = 9;
        }
        currentStation -= 1;

    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        if (currentVolume > 10) {
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            setCurrentVolume(currentVolume);
        }
    }
}
