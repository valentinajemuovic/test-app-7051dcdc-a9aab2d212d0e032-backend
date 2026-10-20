package com.valentinajemuovic.skytravel.backend.testkit.dsl.port.when.steps;

import com.valentinajemuovic.skytravel.backend.testkit.dsl.port.when.steps.base.WhenStep;

public interface WhenViewOrder extends WhenStep {
    WhenViewOrder withOrderNumber(String orderNumber);
}
