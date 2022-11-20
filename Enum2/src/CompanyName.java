public enum CompanyName {
        GOOGLE(1995, "Google was founded in 1998 by Larry Page and Sergey Brin while"),
        MICROSOFT(1975, "Microsoft Corporation is a technology company with headquarters in Redmond,Washington");

        private int createdYear;
        final private String description;

        private CompanyName(int cYear, String desc) {
            this.description = desc;
            this.createdYear = cYear;
        }

        public String getDescription(){
            return this.createdYear + " " + this.description;
        }
}
