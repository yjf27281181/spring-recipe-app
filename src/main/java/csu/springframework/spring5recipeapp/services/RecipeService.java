package csu.springframework.spring5recipeapp.services;

import csu.springframework.spring5recipeapp.commands.RecipeCommand;
import csu.springframework.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService{
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
    RecipeCommand findCommandById(String id);
    void deleteById(Long id);
}
