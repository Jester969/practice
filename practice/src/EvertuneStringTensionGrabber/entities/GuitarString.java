package EvertuneStringTensionGrabber.entities;

public class GuitarString {

    private final String note;
    private final String caliber;

    GuitarString(String note, String caliber) {
        this.note = note;
        this.caliber = caliber;
    }

    public String getNote() {
        return note;
    }

    public String getCaliber() {
        return caliber;
    }
}