package SEE;

import CIE.Personal;

public class External extends Personal {
    public int[] externalMarks = new int[5];

    public External(String USN, String name, int sem, int[] marks) {
        super(USN, name, sem);
        for (int i = 0; i < 5; i++) {
            externalMarks[i] = marks[i];
        }
    }
}

