package com.example.getirme.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SelectableContentDto {
    private Long id;
    private String name;
    private List<SelectableContentOptionDto> selectableContentOptionDtoList;
}
