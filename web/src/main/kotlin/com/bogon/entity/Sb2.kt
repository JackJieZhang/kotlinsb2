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

package com.bogon.entity

import com.baomidou.mybatisplus.annotation.TableField
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.extension.activerecord.Model

/**
 * <p> </p>
 *
 * @author BOGON
 * @version 1.0
 * @since JDK 1.7
 */
class Sb2 : Model<Sb2>() {
    @TableId
    private var id: Long? = null
    /**
     * 删除标记
     */
    @TableField("delete_flag")
    private var deleteFlag: Int? = null

    override fun pkVal(): Long? {
        return this.id
    }
}