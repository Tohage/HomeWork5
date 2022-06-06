package domain;

public class Radio {


    private int maxStation;

    private int minStation;
    private int currentStation;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;

    public Radio(int maxStation, int minStation, int currentStation) {
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentStation = currentStation;
    }

    public Radio(int amountStation) {
        maxStation = minStation + amountStation;

    }

    public Radio(int maxVolume, int minVolume) {
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            currentStation = maxStation;
        }
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        this.currentStation = currentStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void increaseStation() {
        if (currentStation <= minStation) {
            setCurrentStation(currentStation);
        }
        currentStation = currentStation + 1;
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
    }

    public void reduceStation() {
        if (currentStation <= minStation) {
            currentStation = maxStation;
        }
        currentStation -= 1;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == minVolume) {
            setCurrentVolume(currentVolume);
        }
    }
}
