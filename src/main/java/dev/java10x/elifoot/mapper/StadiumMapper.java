package dev.java10x.elifoot.mapper;

import dev.java10x.elifoot.controller.request.CreateStadiumRequest;
import dev.java10x.elifoot.controller.response.StadiumResponse;
import dev.java10x.elifoot.entity.Stadium;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StadiumMapper {  // utilizando a lib mapstruct para lidar melhor com DTOs.

    // Transforma dados - Transforma Stadium (entidade JPA) em StadiumResponse (DTO)
    StadiumResponse toStadiumResponse(Stadium stadium);

    // para criar um Stadium
    Stadium toStadium(CreateStadiumRequest createStadiumRequest);
}
