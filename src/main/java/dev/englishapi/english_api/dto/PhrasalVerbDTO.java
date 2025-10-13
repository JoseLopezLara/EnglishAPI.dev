package dev.englishapi.english_api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhrasalVerbDTO {
    private Long phrasalVerbId;

    @NotBlank(message = "The name is required")
    @Size(min = 3, max = 128, message = "The name must be between 3 and 128 characters")
    private String phrasalVerbName;
    
    @NotBlank(message = "The description is required")
    @Size(min = 3, max = 255, message = "The description must be between 3 and 255 characters")
    private String phrasalVerbDescription;
}
