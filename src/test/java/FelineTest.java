import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {
    private final Feline feline = new Feline();

    @Test
    public void eatMeatReturnPredatorFood() throws Exception {
        List<String> felineFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(felineFood, feline.eatMeat());
    }

    @Test
    public void getFamilyReturnAnswerForFeline() {
        String typeOfAnimal = "Кошачьи";
        Assert.assertEquals(typeOfAnimal, feline.getFamily());
    }

    @Test
    public void getKittensCheckWithoutParams() {
        int numberOfKitten = 1;
        Assert.assertEquals(numberOfKitten, feline.getKittens());
    }

    @Test
    public void getKittensCheckWithParams() {
        int numberOfKitten = 70;
        Assert.assertEquals(numberOfKitten, feline.getKittens(numberOfKitten));
    }
}