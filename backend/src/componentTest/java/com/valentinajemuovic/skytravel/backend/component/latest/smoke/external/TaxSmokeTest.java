package com.valentinajemuovic.skytravel.backend.component.latest.smoke.external;

import com.valentinajemuovic.skytravel.backend.BaseComponentTest;
import org.junit.jupiter.api.Test;

/** Liveness canary for the in-process Tax stub. See {@link ErpSmokeTest} for what it does not cover. */
class TaxSmokeTest extends BaseComponentTest {

    @Test
    void shouldBeAbleToGoToTax() {
        scenario.assume().tax().shouldBeRunning();
    }
}
