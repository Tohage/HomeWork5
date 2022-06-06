import domain.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTests {
    Radio st = new Radio(9);
    Radio st1 = new Radio(9, 0, 1);
    Radio vl = new Radio(100, 0);

    @Test
    void findStation() {
        st.setCurrentStation(10);
        assertEquals(0, st.getCurrentStation());
    }

    @Test
    void findStationMin() {
        assertEquals(0, st.getMinStation());
    }

    @Test
    void findStationMax() {
        st.setCurrentStation(9);

        int actual = st.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findStationBelowMin() {

        st.setCurrentStation(-5);

        int actual = st.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }


    @Test
    void findStationAboveMax() {

        st.setCurrentStation(10);

        int actual = st.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void changeStationIncrease() {

        st.setCurrentStation(1);

        st.increaseStation();

        int actual = st.getCurrentStation();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void changeStationIncreaseMax() {

        st.setCurrentStation(9);

        st.increaseStation();

        int actual = st.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void changeStationIncreaseAboveMax() {

        st.setCurrentStation(10);

        st.increaseStation();

        int actual = st.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void changeStationIncreaseMin() {

        st.setCurrentStation(0);

        st.increaseStation();

        int actual = st.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void changeStationIncreaseBelowMax() {

        st.setCurrentStation(8);

        st.increaseStation();

        int actual = st.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void changeStationIncrease123() {

        st.setCurrentStation(20);

        st.increaseStation();

        int actual = st.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void changeStationReduce() {

        st.setCurrentStation(6);

        st.reduceStation();

        int actual = st.getCurrentStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void changeStationReduceMax() {

        st.setCurrentStation(9);

        st.reduceStation();

        int actual = st.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void changeStationReduceAboveMax() {

        st.setCurrentStation(10);

        st.reduceStation();

        int actual = st.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void changeStationReduceMin() {

        st.setCurrentStation(0);

        st.reduceStation();

        int actual = st.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void changeStationReduceBelowMin() {

        st.setCurrentStation(-1);

        st.reduceStation();

        int actual = st.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void findVolume() {

        vl.setCurrentVolume(90);

        int actual = vl.getCurrentVolume();
        int expected = 90;

        assertEquals(expected, actual);
    }

    @Test
    void findVolumeMax() {

        assertEquals(100, vl.getMaxVolume());
    }

    @Test
    void findVolumeAboveMax() {

        vl.setCurrentVolume(101);

        int actual = vl.getCurrentVolume();
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void findVolumeMin() {

        assertEquals(0, vl.getMinVolume());
    }

    @Test
    void findVolumeBelowMin() {

        vl.setCurrentVolume(-1);

        int actual = vl.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void changeVolumeIncrease() {

        vl.setCurrentVolume(9);

        vl.increaseVolume();

        int actual = vl.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void changeVolumeIncreaseMax() {

        vl.setCurrentVolume(100);

        vl.increaseVolume();

        int actual = vl.getCurrentVolume();
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void changeVolumeIncreaseAboveMax() {

        vl.setCurrentVolume(200);

        vl.increaseVolume();

        int actual = vl.getCurrentVolume();
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void changeVolumeReduce() {

        vl.setCurrentVolume(9);

        vl.reduceVolume();

        int actual = vl.getCurrentVolume();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void changeVolumeReduceMax() {

        vl.setCurrentVolume(11);

        vl.reduceVolume();

        int actual = vl.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void changeVolumeReduceAboveMax() {

        vl.setCurrentVolume(20);

        vl.reduceVolume();

        int actual = vl.getCurrentVolume();
        int expected = 19;

        assertEquals(expected, actual);
    }

    @Test
    void changeVolumeReduceMin() {

        vl.setCurrentVolume(0);

        vl.reduceVolume();

        int actual = vl.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }
}

