package dev.englishapi.english_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class PhrasalVerb {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "phrasal_verb_id")
    private Long phrasalVerbId;

    @Column(name = "phrasal_verb_name", unique = true, nullable = false, length = 128)
    private String phrasalVerbName;

    @Column(name = "phrasal_verb_description", unique = false, nullable = false, length = 255)
    private String phrasalVerbDescription;

}
