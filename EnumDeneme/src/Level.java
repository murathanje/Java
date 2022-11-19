enum Level {
    HIGH(300, "dangerous"),
    MEDIUM(200, "okay"),
    LOW(100, "too easy");

    int height;
    private String desc;

    private Level(int h, String d) {
        this.height = h;
        this.desc = d;
    }

    public String getDesc() {
        return desc;
    }
}
