package com.geekcap.javaworld.spring5mvcexample.cache;

import com.geekcap.javaworld.spring5mvcexample.model.Widget;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Example of a boundless cache (leads to a memory leak), used as a test scenario for OpenAPM
 */
public class WidgetCache {

    private static WidgetCache instance = new WidgetCache();

    public static WidgetCache getInstance() {
        return instance;
    }

    private WidgetCache() {
    }

    private Map<Long, Widget> widgetMap = new HashMap<>();

    public void addWidget(Widget widget) {
        widgetMap.put(widget.getId(), widget);
    }

    public Optional<Widget> getWidgetById(Long id) {
        return Optional.ofNullable(widgetMap.get(id));
    }
}
