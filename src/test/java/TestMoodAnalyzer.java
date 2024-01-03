import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.example.MoodAnalyzer;
import com.example.MoodAnalyzerException;
import com.example.MoodAnalyzerExceptionEnum;

public class TestMoodAnalyzer {
    public MoodAnalyzer moodAnalyzer;

    @Test
    public void testAnalazyMoodSad() {
        try {
            moodAnalyzer = new MoodAnalyzer("I am in Sad mood");
            String result = moodAnalyzer.analyzeMood();

            assertEquals("SAD", result);
        } catch (MoodAnalyzerException e) {
            fail(e.getMessage());
        }

    }

    @Test
    public void testAnalazyMoodHappy() {

        try {
            moodAnalyzer = new MoodAnalyzer("I am in Any mood");
            String result = moodAnalyzer.analyzeMood();

            assertEquals("HAPPY", result);

        } catch (MoodAnalyzerException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testAnalyzeNullMood() {
        try {
            moodAnalyzer = new MoodAnalyzer(null);
            moodAnalyzer.analyzeMood();

            fail("Exxpected a null string");
        } catch (MoodAnalyzerException e) {
            if (e.type == MoodAnalyzerExceptionEnum.NullStringException)
                assertEquals("String is null", e.getMessage());
            else
                fail("Expected a null string instead got an empty string");
        }
    }

    @Test
    public void testAnalyzeEmptyMood() {
        try {
            moodAnalyzer = new MoodAnalyzer("");
            moodAnalyzer.analyzeMood();

            fail("Exxpected an empty string");
        } catch (MoodAnalyzerException e) {
            if (e.type == MoodAnalyzerExceptionEnum.EmptyStringException)
                assertEquals("String is empty", e.getMessage());
            else
                fail("Expected an empty string instead got a null string");
        }
    }
}
