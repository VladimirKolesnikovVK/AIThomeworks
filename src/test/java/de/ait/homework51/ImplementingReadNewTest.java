package de.ait.homework51;

import nl.altindag.log.LogCaptor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.*;

class ImplementingReadNewTest {
    private LogCaptor logCaptor = LogCaptor.forClass(ImplementingReadNew.class);
    private ImplementingReadNew implementingReadNew;
    @BeforeEach
    private void setUp(){
        implementingReadNew = new ImplementingReadNew();
    }

    @Test
    void testwriteReverseTextToFileSuccess() throws IOException {
        String textToReverse = "Lesson";
        StringReader stringReader = new StringReader(textToReverse);
        StringWriter stringWriter = new StringWriter();
        String expectedInfoMessage = "zapis ";
        ImplementingReadNew.writeReverseTextToFile(stringReader,stringWriter);
        Assertions.assertTrue(logCaptor.getInfoLogs().contains(expectedInfoMessage));
    }

    @Test
    void testReverseStringSuccess() {
        String reverseResult = ImplementingReadNew.reverseString("amazon");
        String reverseResultNumbers = ImplementingReadNew.reverseString("654321");
        Assertions.assertEquals("nozama",reverseResult);
        Assertions.assertEquals("123456",reverseResultNumbers);
    }


}