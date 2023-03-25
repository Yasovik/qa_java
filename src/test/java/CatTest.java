import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class CatTest {
    @Mock
    Feline feline;

    @Before
    public void init() {

        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(feline);
        String catSays = "Мяу";
        assertEquals(catSays, cat.getSound());
    }

    @Test
    public void getFoodCallEatMeat() throws Exception {
        Cat cat = new Cat(feline);
        cat.getFood();
        Mockito.verify(feline).eatMeat();
    }

    @Test
    public void getFoodReturnFelineList() throws Exception {
        List<String> felineFood = List.of("Животные", "Птицы", "Рыба");
        Feline feline1 = new Feline();
        Cat cat = new Cat(feline1);
        assertEquals(felineFood, cat.getFood());
    }
}
