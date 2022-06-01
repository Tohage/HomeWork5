import domain.Radio;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTests {

    @Test
    void findStation() {
        Radio st = new Radio();

        st.setCurrentStation(8);

        int actual = st.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void findStationMin() {
        Radio st = new Radio();

        st.setCurrentStation(0);

        int actual = st.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findStationBelowMin() {
        Radio st = new Radio();

        st.setCurrentStation(-5);

        int actual = st.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findStationMax() {
        Radio st = new Radio();

        st.setCurrentStation(9);

        int actual = st.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findStationAboveMax() {
        Radio st = new Radio();

        st.setCurrentStation(10);

        int actual = st.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void changeStationIncrease() {
        Radio st = new Radio();

        st.setCurrentStation(1);

        st.increaseStation();

        int actual = st.getCurrentStation();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void changeStationIncreaseMax() {
        Radio st = new Radio();

        st.setCurrentStation(9);

        st.increaseStation();

        int actual = st.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void changeStationIncreaseAboveMax() {
        Radio st = new Radio();

        st.setCurrentStation(10);

        st.increaseStation();

        int actual = st.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void changeStationIncreaseMin() {
        Radio st = new Radio();

        st.setCurrentStation(0);

        st.increaseStation();

        int actual = st.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void changeStationIncreaseBelowMax() {
        Radio st = new Radio();

        st.setCurrentStation(8);

        st.increaseStation();

        int actual = st.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void changeStationIncrease123() {
        Radio st = new Radio();

        st.setCurrentStation(20);

        st.increaseStation();

        int actual = st.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void changeStationReduce() {
        Radio st = new Radio();

        st.setCurrentStation(6);

        st.reduceStation();

        int actual = st.getCurrentStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void changeStationReduceMax() {
        Radio st = new Radio();

        st.setCurrentStation(9);

        st.reduceStation();

        int actual = st.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void changeStationReduceAboveMax() {
        Radio st = new Radio();

        st.setCurrentStation(11);

        st.reduceStation();

        int actual = st.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void changeStationReduceMin() {
        Radio st = new Radio();

        st.setCurrentStation(0);

        st.reduceStation();

        int actual = st.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void changeStationReduceBelowMin() {
        Radio st = new Radio();

        st.setCurrentStation(-1);

        st.reduceStation();

        int actual = st.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void findVolume() {
        Radio vl = new Radio();

        vl.setCurrentVolume(9);

        int actual = vl.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findVolumeMax() {
        Radio vl = new Radio();

        vl.setCurrentVolume(10);

        int actual = vl.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void findVolumeAboveMax() {
        Radio vl = new Radio();

        vl.setCurrentVolume(11);

        int actual = vl.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void findVolumeMin() {
        Radio vl = new Radio();

        vl.setCurrentVolume(0);

        int actual = vl.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findVolumeBelowMin() {
        Radio vl = new Radio();

        vl.setCurrentVolume(-1);

        int actual = vl.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void changeVolumeIncrease() {
        Radio vl = new Radio();

        vl.setCurrentVolume(9);

        vl.increaseVolume();

        int actual = vl.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void changeVolumeIncreaseMax() {
        Radio vl = new Radio();

        vl.setCurrentVolume(10);

        vl.increaseVolume();

        int actual = vl.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void changeVolumeIncreaseAboveMax() {
        Radio vl = new Radio();

        vl.setCurrentVolume(20);

        vl.increaseVolume();

        int actual = vl.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void changeVolumeReduce() {
        Radio vl = new Radio();

        vl.setCurrentVolume(9);

        vl.reduceVolume();

        int actual = vl.getCurrentVolume();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void changeVolumeReduceMax() {
        Radio vl = new Radio();

        vl.setCurrentVolume(11);

        vl.reduceVolume();

        int actual = vl.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void changeVolumeReduceAboveMax() {
        Radio vl = new Radio();

        vl.setCurrentVolume(20);

        vl.reduceVolume();

        int actual = vl.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void changeVolumeReduceMin() {
        Radio vl = new Radio();

        vl.setCurrentVolume(0);

        vl.reduceVolume();

        int actual = vl.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }
}

