package EvertuneStringTensionGrabber;

enum CaliberEnum {

    S0070("007"),
    S0080("008"),
    S0085("0085"),
    S0090("009"),
    S0095("0095"),
    S0100("010"),
    S0105("0105"),
    S0110("011"),
    S0115("0115"),
    S0120("012"),
    S0130("013"),
    S0135("0135"),
    S0140("014"),
    S0150("015"),
    S0160("016"),
    S0170("017"),
    S0180("018"),
    S0190("019"),
    S0200("020"),
    S0210("021"),
    S0220("022"),
    S0240("024"),
    S0260("026"),
    S0280("028"),
    S0300("030"),
    S0320("032"),
    S0340("034"),
    S0360("036"),
    S0380("038"),
    S0390("039"),
    S0420("042"),
    S0440("044"),
    S0460("046"),
    S0480("048"),
    S0490("049"),
    S0520("052"),
    S0540("054"),
    S0560("056"),
    S0590("059"),
    S0600("060"),
    S0620("062"),
    S0640("064"),
    S0660("066"),
    S0680("068"),
    S0700("070"),
    S0720("072"),
    S0740("074");


    private String caliber;

    CaliberEnum(String noteName) {
        this.caliber = noteName;
    }

    public String getCaliber() {
        return caliber;
    }
}
