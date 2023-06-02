package com.api.backend.mappers;

import com.api.backend.dtos.request.UserDTO;
import com.api.backend.models.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserMapperServiceImpl implements UserMapperService {
        private final ModelMapper modelMapper;

        public UserMapperServiceImpl(ModelMapper modelMapper) {
            this.modelMapper = modelMapper;
        }

        @Override
        public User convertToEntity(UserDTO userDTO) {
            return modelMapper.map(userDTO, User.class);
        }
}


