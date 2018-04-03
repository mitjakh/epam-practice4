import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class TemperatureConverterTest
{
    @Parameterized.Parameter
    public double value;
    @Parameterized.Parameter(1)
    public double expected;

    TemperatureConverter testConverter = new TemperatureConverter();

    @Parameterized.Parameters(name="{index}")
    public static Collection<Object[]> getTestData()
    {
        return Arrays.asList(new Object[][]{
                {60, 15.5556}
        });
    }

    @Test
    public void convertFtoCTest()
    {
        double result =  testConverter.convertFtoC(value);

        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void convertCtoFTest()
    {
        double result =  testConverter.convertCtoF(60);

        assertEquals(140, result, 0.0001);
    }

    @Test
    public void convertCtoKTest()
    {
        double result =  testConverter.convertCtoK(60);

        assertEquals(333.2, result, 0.0001);
    }

    @Test
    public void convertKtoCTest()
    {
        double result =  testConverter.convertKtoC(60);

        assertEquals(-213.2, result, 0.0001);
    }

    @Test
    public void convertFtoKTest()
    {
        double result =  testConverter.convertFtoK(60);

        assertEquals(288.7222, result, 0.0001);
    }

    @Test
    public void convertKtoFTest()
    {
        double result =  testConverter.convertKtoF(60);

        assertEquals(-351.7, result, 0.0001);
    }
}