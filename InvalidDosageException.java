


public class InvalidDosageException extends Exception {

    private double dosage;

    public InvalidDosageException(double dosage) {
            super(dosage <= 0
                    ? "Invalid dosage: " + dosage + "mg. Dosage must be positive."
                    : "Dangerously high dosage: " + dosage + "mg. Maximum allowed is 5000mg.");
            this.dosage = dosage;
        }
    public double getDosage() {
        	return dosage;
    }
}
