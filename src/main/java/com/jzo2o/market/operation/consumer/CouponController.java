package com.jzo2o.market.operation.consumer;

import com.jzo2o.market.model.dto.request.MyCouponReqDTO;
import com.jzo2o.market.model.dto.response.CouponInfoResDTO;
import com.jzo2o.market.service.ICouponService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController("consumerCouponController")
@RequestMapping("/consumer/coupon")
@Api(tags = "消费端-优惠券相关接口")
public class CouponController {
    @Resource
    private ICouponService couponService;

    @ApiOperation("我的优惠券列表接口")
    @GetMapping("/my")
    public CouponInfoResDTO myCoupon(MyCouponReqDTO myCouponReqDTO) {
        return couponService.myCoupon(myCouponReqDTO);
    }
}
