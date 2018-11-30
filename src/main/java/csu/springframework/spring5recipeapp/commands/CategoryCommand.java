package csu.springframework.spring5recipeapp.commands;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryCommand {
    private Long id;
    private String description;
}
