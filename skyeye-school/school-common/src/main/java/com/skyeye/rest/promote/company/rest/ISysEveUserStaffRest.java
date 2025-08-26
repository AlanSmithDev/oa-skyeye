/*******************************************************************************
 * Copyright 卫志强 QQ：598748873@qq.com Inc. All rights reserved. 开源地址：https://gitee.com/doc_wei01/skyeye
 ******************************************************************************/

package com.skyeye.rest.promote.company.rest;

import com.skyeye.common.client.ClientConfiguration;
import com.skyeye.common.entity.search.CommonPageInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "${webroot.skyeye-pro}", configuration = ClientConfiguration.class)
public interface ISysEveUserStaffRest {

    @PostMapping("querySysUserStaffList")
    String querySysUserStaffList(CommonPageInfo commonPageInfo);

}
