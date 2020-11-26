package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by Pontus on 2020-11-15.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
