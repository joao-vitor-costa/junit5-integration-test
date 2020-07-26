package com.geekcap.javaworld.spring5mvcexample.service;

import com.geekcap.javaworld.spring5mvcexample.model.Widget;

import java.util.List;
import java.util.Optional;

public interface WidgetService {
    Optional<Widget> findById(Long id);
    List<Widget> findAll();
    Widget save(Widget widget);
    void deleteById(Long id);
}
