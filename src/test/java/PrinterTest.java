import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 100);
    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void canPrintEnoughPaper(){
        printer.print(1, 10 );
        assertEquals(90, printer.getPaper());
    }

    @Test
    public void canRefusePrintNotEnoughPaper(){
        printer.print(100,100);
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void printingReducesToner(){
        printer.print(1, 10);
        assertEquals(90, printer.getToner());
    }

    @Test
    public void canRefusePrintNotEnoughToner(){
        printer.print(100, 100);
        assertEquals(100, printer.getToner());
    }
}
