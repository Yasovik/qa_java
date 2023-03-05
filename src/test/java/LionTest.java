import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самец", feline);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodReturnFelineList() throws Exception {
        List<String> felineFood = List.of("Животные", "Птицы", "Рыба");
        Feline feline = new Feline();
        String sex = "Самка";
        Lion lion = new Lion(sex, feline);
        assertEquals(felineFood, lion.getFood());
    }
    @Test
    public void getFoodCallEatMeat() throws Exception {
        String sex = "Самец";
        Lion lion = new Lion(sex, feline);
        lion.getFood();
        Mockito.verify(feline).eatMeat();
    }

    @Test
    public void lionCheckForSexOfAnimal() {
        String exceptionExpectedMessage = "Используйте допустимые значения пола животного - самец или самка";
        Exception trowException = Assert.assertThrows(Exception.class, () -> new Lion("Неизвестно", feline));
        Assert.assertEquals(trowException.getMessage(), exceptionExpectedMessage);
    }
}