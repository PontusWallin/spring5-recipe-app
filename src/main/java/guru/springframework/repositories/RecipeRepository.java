package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Pontus on 2020-11-15.
 */
// Spring Data will auto-create this with reflection and java generics
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}