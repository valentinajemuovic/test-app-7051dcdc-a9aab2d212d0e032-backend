package com.valentinajemuovic.skytravel.backend.testkit.dsl.port.when;

import com.valentinajemuovic.skytravel.backend.testkit.dsl.port.when.steps.WhenBrowseCoupons;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.port.when.steps.WhenBrowseOrderHistory;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.port.when.steps.WhenCancelOrder;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.port.when.steps.WhenPlaceOrder;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.port.when.steps.WhenPublishCoupon;
import com.valentinajemuovic.skytravel.backend.testkit.dsl.port.when.steps.WhenViewOrder;

/** The one action the scenario is about. */
public interface WhenStage {
    WhenPlaceOrder placeOrder();

    WhenCancelOrder cancelOrder();

    WhenViewOrder viewOrder();

    WhenBrowseOrderHistory browseOrderHistory();

    WhenPublishCoupon publishCoupon();

    WhenBrowseCoupons browseCoupons();
}
