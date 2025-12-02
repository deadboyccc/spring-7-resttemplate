package dev.dead.spring7resttemplate.models;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class CustomerDTO {
    private UUID id;
    private Integer version;
    private String customerName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


}
