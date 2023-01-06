package com.example.springboot.mappers;

import com.example.springboot.beans.Profil;
import com.example.springboot.dto.ProfilDto;
import com.example.springboot.dto.light.LightProfilDto;
import com.example.springboot.enums.EUserSexe;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(
        uses = {},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface ProfilMapper {
    ProfilMapper INSTANCE = Mappers.getMapper(ProfilMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "monitoring", ignore = true)
    @Mapping(target = "user_id", ignore = true)
    @Mapping(target = "meal", ignore = true)
    @Mapping(target = "goal", ignore = true)
    @Mapping(target = "created_at", ignore = true)
    Profil toBo(LightProfilDto dto);

    ProfilDto toDto(Profil bo);


}
