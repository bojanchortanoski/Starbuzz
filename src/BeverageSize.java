public enum BeverageSize {
    TALL,
    SMALL,
    GRANDE,
    MEDIUM,
    VENTI,
    LARGE;

    public String size() {
        switch(this) {
            case TALL:
            case SMALL: return "tall";
            case GRANDE:
            case MEDIUM: return "grande";
            case VENTI:
            case LARGE: return "venti";
            default: return "Sir this is Starbuzz. Talk American dammit!";
        }
    }
}
