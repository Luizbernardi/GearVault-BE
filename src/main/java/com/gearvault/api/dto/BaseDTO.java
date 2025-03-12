package com.gearvault.api.dto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = false)
public class BaseDTO {

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;
    private String deletedBy;
    private LocalDateTime deletedAt;
    private boolean isDeleted = false;

}