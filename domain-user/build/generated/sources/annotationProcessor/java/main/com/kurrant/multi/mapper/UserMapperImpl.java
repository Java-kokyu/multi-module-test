package com.kurrant.multi.mapper;

import com.kurrant.multi.domain.User;
import com.kurrant.multi.dto.UserDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-24T13:37:27+0900",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toDto(User e) {
        if ( e == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.supplierCorpId = e.getSupplierCorpId();
        userDto.customerCorpId = e.getCustomerCorpId();
        userDto.type = e.getType();
        userDto.level = e.getLevel();
        userDto.locationId = e.getLocationId();
        userDto.registerType = e.getRegisterType();
        userDto.gender = e.getGender();
        userDto.verifyStatus = e.getVerifyStatus();
        userDto.status = e.getStatus();
        userDto.box = e.getBox();

        return userDto;
    }

    @Override
    public User toEntity(UserDto d) {
        if ( d == null ) {
            return null;
        }

        User user = new User();

        return user;
    }

    @Override
    public void updateFromDto(UserDto dto, User entity) {
        if ( dto == null ) {
            return;
        }
    }
}
