import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RecentCounterTest {

    @Test
    void getRecent() {
        RecentCounter rc = new RecentCounter();
        int[] array = {156166, 156423, 158304, 211387, 277101, 299683, 315559, 476340, 599798, 603055, 754499, 763079, 770210, 784063, 827501, 832252, 885804, 915659, 925527, 931410, 948409, 991628};
        for (int j : array) {
            rc.ping(j);
        }
    }

}