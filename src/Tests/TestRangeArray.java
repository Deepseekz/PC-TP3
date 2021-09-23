package Tests;

import Classes.RangeArray;
import org.junit.Assert;
import org.junit.Test;

public class TestRangeArray {
    @Test
    public void TestNaturalFromUserIndex()
    {
        RangeArray test = new RangeArray(-3, 1);
        Assert.assertEquals(test.naturalFromUserIndex(-3), 0);
    }
}
