package com.startup.uber.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DriverDto extends BaseDto{
    private Long id;
    private String name;
    private String email;
    private Date dob;
    private String location;
}
