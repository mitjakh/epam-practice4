import org.junit.Test;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

public class TemperatureConverterTest
{

    TemperatureConverter testConverter = new TemperatureConverter();

    @Test
    public void convertFtoCTest()
    {
        double result =  testConverter.convertFtoC(60);

        assertEquals(15.5556, result, 0.0001);
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