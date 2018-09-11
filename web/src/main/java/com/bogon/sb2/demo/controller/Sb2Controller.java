package com.bogon.sb2.demo.controller;


import com.google.common.collect.Lists;

import com.bogon.sb2.demo.entity.Sb2;
import com.bogon.sb2.demo.service.ISb2Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author BOGON
 * @since 2018-09-03
 */
@RestController
@RequestMapping("/sb2")
public class Sb2Controller {
    private final ISb2Service sb2Service;

    @Autowired
    public Sb2Controller(ISb2Service sb2Service) {
        this.sb2Service = sb2Service;
    }

    @GetMapping("/all")
    public Collection<Sb2> getAll() {
        final Collection<Sb2> sb2s = sb2Service.listByIds(Lists.newArrayList(1));
        return sb2s;
    }
}

