import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.MoodAnalyzer;

public class TestMoodAnalyzer {
    public MoodAnalyzer moodAnalyzer;

    @Test
    public void testAnalazyMoodSad() {
        moodAnalyzer = new MoodAnalyzer("I am in Sad mood");
        String result = moodAnalyzer.analyzeMood();

        assertEquals("SAD", result);
    }

    @Test
    public void testAnalazyMoodHappy() {
        moodAnalyzer = new MoodAnalyzer("I am in Any mood");
        String result = moodAnalyzer.analyzeMood();

        assertEquals("HAPPY", result);
    }

    @Test
    public void testAnalyzeNullMood() {
        moodAnalyzer = new MoodAnalyzer(null);
        String result = moodAnalyzer.analyzeMood();

        assertEquals("HAPPY", result);
    }
}
