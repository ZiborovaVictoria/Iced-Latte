package com.zufar.icedlatte.favorite.converter;

import com.zufar.icedlatte.favorite.dto.FavoriteItemDto;
import com.zufar.icedlatte.favorite.entity.FavoriteItemEntity;
import com.zufar.icedlatte.product.converter.ProductInfoDtoConverter;
import com.zufar.icedlatte.product.entity.ProductInfo;
import org.junit.jupiter.api.BeforeEach;
import org.mapstruct.factory.Mappers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.UUID;

public class FavoriteItemDtoConverterTest {

    private FavoriteItemDtoConverter converter;
    private ProductInfoDtoConverter productInfoDtoConverter;

    @BeforeEach
    void setup() {
        converter = Mappers.getMapper(FavoriteItemDtoConverter.class);
        productInfoDtoConverter = Mappers.getMapper(ProductInfoDtoConverter.class);
    }
}
