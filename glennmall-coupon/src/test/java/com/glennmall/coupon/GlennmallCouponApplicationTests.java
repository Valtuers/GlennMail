package com.glennmall.coupon;

import com.glennmall.coupon.entity.CouponEntity;
import com.glennmall.coupon.service.CouponService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GlennmallCouponApplicationTests {
    @Autowired
    CouponService couponService;

    @Test
    void contextLoads() {
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("哈哈哈");

        couponService.save(couponEntity);
    }

}
