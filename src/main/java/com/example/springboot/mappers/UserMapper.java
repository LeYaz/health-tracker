package com.example.springboot.mappers;

import com.example.springboot.beans.User;
import com.example.springboot.dto.UserDto;
import com.example.springboot.dto.light.LightUserDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(
        uses = {},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "id", ignore = true)
    User toBo(LightUserDto dto);

    UserDto toDto(User bo);
}
