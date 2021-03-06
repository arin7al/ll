//package com.acme.edu.iteration01;
//
//import com.acme.edu.Logger;
//import com.acme.edu.SysoutCaptureAndAssertionAbility;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//public class LoggerTest implements SysoutCaptureAndAssertionAbility {
//    //region given
//    @Before
//    public void setUpSystemOut() throws Exception {
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
//    @Test
//    public void shouldLogChar() throws Exception {
//        //region when
//        Logger.log('a');
//        Logger.log('b');
//        Logger.close();
//        //endregion
//
//        //region then
//        assertSysoutContains("char: ");
//        assertSysoutContains("a");
//        assertSysoutContains("b");
//        //endregion
//    }
//
//    @Test
//    public void shouldLogString() throws Exception {
//        //region when
//        Logger.log("test string 1");
//        Logger.log("other str");
//        Logger.flush();
//        //endregion
//
//        //region then
//
//        assertSysoutContains("string: ");
//        assertSysoutContains("test string 1");
//        assertSysoutContains("other str");
//        //endregion
//    }
//
//    @Test
//    public void shouldLogBoolean() throws Exception {
//        //region when
//        Logger.log(true);
//        Logger.log(false);
//        Logger.flush();
//        //endregion
//
//        //region then
//        assertSysoutContains("primitive: ");
//        assertSysoutContains("true");
//        assertSysoutContains("false");
//        //endregion
//    }
//
//    @Test
//    public void shouldLogReference() throws Exception {
//        //region when
//        Logger.log(new Object());
//        Logger.log(new Object());
//        Logger.flush();
//        //endregion
//
//        //region then
//        assertSysoutContains("reference:");
//        assertSysoutContains("@");
//        //endregion
//    }
//
//}