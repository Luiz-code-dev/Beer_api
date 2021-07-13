package com.digitalinnovationone.BeerStock.mapper;

import com.digitalinnovationone.BeerStock.dto.BeerDTO;
import com.digitalinnovationone.BeerStock.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}