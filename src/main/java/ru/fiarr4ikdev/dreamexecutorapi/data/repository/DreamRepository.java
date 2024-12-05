package ru.fiarr4ikdev.dreamexecutorapi.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.fiarr4ikdev.dreamexecutorapi.data.entyty.DreamEntity;

@Repository
public interface DreamRepository extends JpaRepository<DreamEntity, Long> {

}
