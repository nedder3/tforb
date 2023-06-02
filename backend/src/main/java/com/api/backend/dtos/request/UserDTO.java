package com.api.backend.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

    private Long id;
    private String identificationType;
    private Integer userIdentificationNumber;
    private String password;
}
