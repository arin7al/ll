//package com.acme.edu.FileOutputTest;
//
//import com.acme.edu.Logger;
//import com.acme.edu.SysoutCaptureAndAssertionAbility;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.io.IOException;
//
//public class LoggerTest implements SysoutCaptureAndAssertionAbility {
//    //region given
//    @Before
//    public void setUpSystemOut() throws IOException {
//        resetOut();
//        captureSysout();
//    }
//
//    @After
//    public void tearDown() {
//        resetOut();
//    }
//    //endregion
//
//
//
//    @Test
//    public void shouldLogSequentIntegersAsSum() throws Exception {
//        //region when
//        Logger.log("str 1");
//        Logger.log(1);
//        Logger.log(2);
//        Logger.log("str 2");
//        Logger.log(0);
//        Logger.close();
//        //endregion
//
//        //region then
//        assertSysoutContains("str 1");
//        assertSysoutContains("primitive: 3");
//        assertSysoutContains("str 2");
//        assertSysoutContains("primitive: 0");
//        //endregion
//    }
//
//    @Test
//    public void shouldLogCorrectlyIntegerPositiveOverflowWhenSequentIntegers() {
//        //region when
//        Logger.log("str 1");
//        Logger.log(10);
//        Logger.log(Integer.MAX_VALUE);
//        Logger.log("str 2");
//        Logger.log(0);
//        Logger.flush();
//        //endregion
//
//        //region then
//        assertSysoutContains("str 1");
//        assertSysoutContains("10");
//        assertSysoutContains(String.valueOf(Integer.MAX_VALUE));
//        assertSysoutContains("str 2");
//        assertSysoutContains("0");
//        //endregion
//    }
//
//    @Test
//    public void shouldLogCorrectlyIntegerNegativeOverflowWhenSequentIntegers() {
//        //region when
//        Logger.log("str 1");
//        Logger.log(-10);
//        Logger.log(Integer.MIN_VALUE);
//        Logger.log("str 2");
//        Logger.log(0);
//        Logger.flush();
//        //endregion
//
//        //region then
//        assertSysoutContains("str 1");
//        assertSysoutContains("-10");
//        assertSysoutContains(String.valueOf(Integer.MIN_VALUE));
//        assertSysoutContains("str 2");
//        assertSysoutContains("0");
//        //endregion
//    }
//
//
//    @Test
//    public void shouldLogCorrectlyBytePositiveOverflowWhenSequentBytes() {
//        //region when
//        Logger.log("str 1");
//        Logger.log((byte)10);
//        Logger.log((byte)5);
//        Logger.log(Byte.MAX_VALUE);
//        Logger.log("str 2");
//        Logger.log(0);
//        Logger.flush();
//        //endregion
//
//
//        //region then
//        assertSysoutContains("str 1");
//        assertSysoutContains("15");
//        assertSysoutContains(String.valueOf(Byte.MAX_VALUE));
//        assertSysoutContains("str 2");
//        assertSysoutContains("0");
//
//        //endregion
//    }
//
//    @Test
//    public void shouldLogCorrectlyByteNegativeOverflowWhenSequentBytes() {
//        //region when
//        Logger.log("str 1");
//        Logger.log((byte)-10);
//        Logger.log((byte)-5);
//        Logger.log(Byte.MIN_VALUE);
//        Logger.log("str 2");
//        Logger.log(0);
//        Logger.flush();
//        //endregion
//
//
//        //region then
//        assertSysoutContains("str 1");
//        assertSysoutContains("-15");
//        assertSysoutContains(String.valueOf(Byte.MIN_VALUE));
//        assertSysoutContains("str 2");
//        assertSysoutContains("0");
//
//        //endregion
//    }
//
//    @Test
//    public void shouldLogSameSubsequentStringsWithoutRepeat() throws IOException {
//        //region when
//        Logger.log("str 1");
//        Logger.log("str 2");
//        Logger.log("str 2");
//        Logger.log(0);
//        Logger.log("str 2");
//        Logger.log("str 3");
//        Logger.log("str 3");
//        Logger.log("str 3");
//        Logger.flush();
//        //endregion
//
//        //region then
//        assertSysoutContains("str 1");
//        assertSysoutContains("str 2 (x2)");
//        assertSysoutContains("0");
//        assertSysoutContains("str 2");
//        assertSysoutContains("str 3 (x3)");
//        //endregion
//    }
//
//}