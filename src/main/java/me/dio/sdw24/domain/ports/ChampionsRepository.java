package me.dio.sdw24.domain.ports;

import me.dio.sdw24.domain.model.Champion;

import java.util.List;
import java.util.Optional;

public interface ChampionsRepository {
    public List<Champion> findAll();

    public Optional<Champion> findById(Long id);
}
