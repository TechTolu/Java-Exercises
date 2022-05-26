package chapterThree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeTest {
    @Test
    void gradeScoreTest(){
        //Given
        Grade gradeScore = new Grade("E");
        //WHEN
        gradeScore.setScore(90);
        //ASSERT
        assertEquals("A", gradeScore.getScore());
    }
}
