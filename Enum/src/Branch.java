public enum Branch {

    MATH(1),
    PHYSICS(24),
    GEOMETY(3); // semicolon needed when fields / methods follow

    private int fieldId;

    Branch(int _fieldId) {

        this.fieldId = _fieldId;
    }

    public int getFieldId(){
        return fieldId;
    }
}
