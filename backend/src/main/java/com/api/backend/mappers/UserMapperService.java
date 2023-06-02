package com.api.backend.mappers;

import com.api.backend.dtos.request.UserDTO;
import com.api.backend.models.User;

public interface UserMapperService {
    User convertToEntity(UserDTO userDTO);
}
