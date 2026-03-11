// ============================================================================
// AppointmentConflictException.java - Custom Exception
// ============================================================================
// TASK 14: This class is an empty shell. Students must complete it.
//
// Requirements:
// - It should be a CHECKED exception (extends Exception)
// - It should store: patientName, requestedDateTime, conflictDescription
// - It should have a descriptive message
// - It should have getter methods for all fields
// ============================================================================



public class AppointmentConflictException extends Exception {


    private final String patientName; //
    private final String requestedDateTime;
    private final String conflictDescription;

    public AppointmentConflictException(String patientName, String requestedDateTime,
                                        String conflictDescription) {
        super("Scheduling conflict for " + patientName + " at " + requestedDateTime + ": " + conflictDescription);
        this.patientName = patientName;
        this.requestedDateTime = requestedDateTime;
        this.conflictDescription = conflictDescription;
    }

    public String getPatientName() {
        return patientName;
    }
    public String getRequestedDateTime() {
        return requestedDateTime;
    }
    public String getConflictDescription() {
        return conflictDescription;
    }
}