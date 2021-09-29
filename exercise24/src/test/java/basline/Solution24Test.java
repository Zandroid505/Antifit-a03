package basline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    @Test
    void CheckIfIsAnagramMethodWorks() {
        Solution24 solCheck = new Solution24();
        String word1 = "tar";
        String word2 = "rat";

        boolean expected = true;
        boolean actual = solCheck.isAnagram(word1, word2);
    }

}