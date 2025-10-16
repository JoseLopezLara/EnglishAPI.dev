package dev.englishapi.english_api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.englishapi.english_api.entity.PhrasalVerb;

public interface PhrasalVerbRepository extends JpaRepository<PhrasalVerb, Long>{
    Optional<PhrasalVerb> findByPhrasalVerbName(String phrasalVerbName);
}
