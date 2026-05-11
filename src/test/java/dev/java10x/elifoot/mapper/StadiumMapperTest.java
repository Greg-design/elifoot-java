package dev.java10x.elifoot.mapper;

import dev.java10x.elifoot.controller.request.CreateStadiumRequest;
import dev.java10x.elifoot.controller.response.StadiumResponse;
import dev.java10x.elifoot.entity.Stadium;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;

class StadiumMapperTest {

    private final StadiumMapper mapper = Mappers.getMapper(StadiumMapper.class);

    @Test
    @DisplayName("toStadiumResponse should map Stadium to StadiumResponse correctly")
    void toStadiumResponse() {
        // Arrange - Given
        Stadium stadium = Stadium.builder()
                .id(1L)
                .name("Test Stadium")
                .city("Test City")
                .capacity(50000)
                .urlImg("Test URL")
                .build();

        // Action - When
        StadiumResponse stadiumResponse = mapper.toStadiumResponse(stadium);
        // Assertions - Then
        assertNotNull(stadiumResponse);

        assertEquals(stadium.getId(), stadiumResponse.getId());
        assertEquals(stadium.getName(), stadiumResponse.getName());
        assertEquals(stadium.getCity(), stadiumResponse.getCity());
        assertEquals(stadium.getCapacity(), stadiumResponse.getCapacity());
        assertEquals(stadium.getUrlImg(), stadiumResponse.getUrlImg());
    }

    @Test
    @DisplayName("toStadium should map CreateStadiumRequest to Stadium correctly")
    void toStadium() {
        // Arrange - Given
        CreateStadiumRequest request = CreateStadiumRequest.builder()
                .name("Test Stadium")
                .city("Test City")
                .capacity(50000)
                .urlImg("Test URL")
                .build();

        // Action  - When
        Stadium stadium = mapper.toStadium(request);
        // Assertions - Then
        assertNotNull(stadium);

        assertEquals(stadium.getName(), stadium.getName());
        assertEquals(stadium.getCity(), stadium.getCity());
        assertEquals(stadium.getCapacity(), stadium.getCapacity());
        assertEquals(stadium.getUrlImg(), stadium.getUrlImg());
    }
}