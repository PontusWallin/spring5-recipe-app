package guru.springframework.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CategoryTest {

    Category category;

    @Before // runs before each test method
    public void setUp(){
        category = new Category();
    }

    @Test
    public void getId() {

        Long testLong = 4l;
        category.setId(testLong);

        assertEquals(testLong, category.getId());
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }

    @Test
    public void setId() {
    }

    @Test
    public void setDescription() {
    }

    @Test
    public void setRecipes() {
    }
}