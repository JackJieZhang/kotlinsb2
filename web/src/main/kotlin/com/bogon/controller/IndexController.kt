/*
 * The Hefei JingTong RDC(Research and Development Centre) Group.
 * __________________
 *
 *    Copyright 2015-2018
 *    All Rights Reserved.
 *
 *    NOTICE:  All information contained herein is, and remains
 *    the property of JingTong Company and its suppliers,
 *    if any.
 */

package com.bogon.controller

import com.bogon.entity.Sb2
import com.bogon.service.ISb2Service
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

/**
 * <p> </p>
 *
 * @author BOGON
 * @version 1.0
 * @since JDK 1.7
 */
@Controller
class IndexController {
    @Autowired
    lateinit var iSb2Service: ISb2Service

    @GetMapping("/hello")
    fun hello(map: MutableMap<String, String>): String {
        val listByIds: Sb2 = iSb2Service.findById(1)
        map.put("zzz", "zzz")
        return "hello"
    }
}