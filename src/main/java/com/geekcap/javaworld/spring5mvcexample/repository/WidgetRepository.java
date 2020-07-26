package com.geekcap.javaworld.spring5mvcexample.repository;

import com.geekcap.javaworld.spring5mvcexample.model.Widget;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WidgetRepository extends CrudRepository<Widget, Long> {

    @Query(value = "SELECT w FROM Widget w WHERE w.name LIKE ?1")
    List<Widget> findWidgetsWithNameLike(String name);
}
