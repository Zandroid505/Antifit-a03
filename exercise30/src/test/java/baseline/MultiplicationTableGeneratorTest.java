/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import org.junit.jupiter.api.Test;

import java.text.Format;
import java.util.Formatter;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTableGeneratorTest {

    @Test
    void outputMultiplicationTable() {
        MultiplicationTableGenerator multiplyManny = new MultiplicationTableGenerator();
        StringBuilder expected = new StringBuilder();
        Formatter formatter = new Formatter(expected);

        expected.append(formatter.format("%4d %4d %4d %4d %4d %4d %4d %4d %4d %4d %4d %4d%n", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));

//        expected.append("    1    2    3    4    5    6    7    8    9   10   11   12\n");
//        expected.append("    2    4    6    8   10   12   14   16   18   20   22   24\n");
//        expected.append("    3    6    9   12   15   18   21   24   27   30   33   36\n");
//        expected.append("    4    8   12   16   20   24   28   32   36   40   44   48\n");
//        expected.append("    5   10   15   20   25   30   35   40   45   50   55   60\n");
//        expected.append("    6   12   18   24   30   36   42   48   54   60   66   72\n");
//        expected.append("    7   14   21   28   35   42   49   56   63   70   77   84\n");
//        expected.append("    8   16   24   32   40   48   56   64   72   80   88   96\n");
//        expected.append("    9   18   27   36   45   54   63   72   81   90   99  108\n");
//        expected.append("   10   20   30   40   50   60   70   80   90  100  110  120\n");
//        expected.append("   11   22   33   44   55   66   77   88   99  110  121  132\n");
//        expected.append("   12   24   36   48   60   72   84   96  108  120  132  144\n");


        multiplyManny.outputMultiplicationTable();
        assertEquals(expected, multiplyManny.getMultiplicationTable());
    }
}