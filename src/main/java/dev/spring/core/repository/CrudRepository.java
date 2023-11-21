package dev.spring.core.repository;

import java.util.List;

public interface CrudRepository<T> {
    List<T> findAll();
}
