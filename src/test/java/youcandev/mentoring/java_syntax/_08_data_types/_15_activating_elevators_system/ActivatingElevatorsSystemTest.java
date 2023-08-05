package youcandev.mentoring.java_syntax._08_data_types._15_activating_elevators_system;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActivatingElevatorsSystemTest {

    @Test
    void createFloorButtonTest() {
        FloorButton floorButton = new FloorButton();
        assertNotNull(floorButton);
    }

    @Test
    void createEmergencyAlarmTest() {
        EmergencyAlarm emergencyAlarm = new EmergencyAlarm();
        assertNotNull(emergencyAlarm);
    }

    @Test
    void createMusicSystemTest() {
        MusicSystem musicSystem = new MusicSystem();
        assertNotNull(musicSystem);
    }

    @Test
    void createVoiceInfoSystemTest() {
        VoiceInfoSystem voiceInfoSystem = new VoiceInfoSystem();
        assertNotNull(voiceInfoSystem);
    }

    @Test
    void createFaceRecognitionSystemTest() {
        FaceRecognitionSystem faceRecognitionSystem = new FaceRecognitionSystem();
        assertNotNull(faceRecognitionSystem);
    }
}
