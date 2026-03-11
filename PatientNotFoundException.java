// ============================================================================
// PatientNotFoundException.java - Custom Exception
// ============================================================================
// BUG 1: This exception extends RuntimeException (UNCHECKED), but it
// should extend Exception (CHECKED). A patient not being found is a
// recoverable user error (they can try a different ID), NOT a
// programming bug. Fix: change RuntimeException to Exception.
// ============================================================================



public class PatientNotFoundException extends Exception {
    private final int patientId;

    public PatientNotFoundException(int patientId) {
        super("Patient #" + patientId + " was not found in the system.");
        this.patientId = patientId;
    }

    public int getPatientId() {
        return patientId;
    }
}