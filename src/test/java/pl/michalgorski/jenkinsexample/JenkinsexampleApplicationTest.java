package pl.michalgorski.jenkinsexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JenkinsexampleApplicationTest {

    @Test
    public void add() {
        JenkinsexampleApplication jenkinsexampleApplication =
                new JenkinsexampleApplication();

        assertEquals(10, jenkinsexampleApplication.add(5, 5));
    }
}