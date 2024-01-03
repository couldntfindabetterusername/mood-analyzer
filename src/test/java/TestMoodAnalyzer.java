import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.MoodAnalyzer;

public class TestMoodAnalyzer {
    public MoodAnalyzer moodAnalyzer;

    @BeforeEach
    public void setUp() {
        moodAnalyzer = new MoodAnalyzer();
    }

    @Test
    public void testAnalazyMoodSad() {
        String message = "I am in Sad mood";
        String result = moodAnalyzer.analyzeMood(message);

        assertEquals("SAD", result);
    }

    @Test
    public void testAnalazyMoodHappy() {
        String message = "I am in Any mood";
        String result = moodAnalyzer.analyzeMood(message);

        assertEquals("HAPPY", result);
    }

    @Test
    public void testDefaultMood() {
        String result = moodAnalyzer.analyzeMood();
        assertEquals("HAPPY", result);
    }
}
