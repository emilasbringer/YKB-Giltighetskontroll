public class person {
    private String name;
    private String personalNumber;
    private String company;
    private String companyNumber;
    private String YKBDate;
    private String course1Date;
    private String course2Date;
    private String course3Date;
    private String course4Date;
    private String course5Date;


    public person (String name, String personalNumber, String company, String companyNumber, String YKBDate, String course1Date, String course2Date, String course3Date, String course4Date, String course5Date) {
        this.name = name;
        this.personalNumber = personalNumber;
        this.company = company;
        this.companyNumber = companyNumber;
        this.YKBDate = YKBDate;
        this.course1Date = course1Date;
        this.course2Date = course2Date;
        this.course3Date = course3Date;
        this.course4Date = course4Date;
        this.course5Date = course5Date;
    }

    public String listToString() {
        String output = "";
        output += name + " | ";
        output += personalNumber + " | ";
        output += company + " | ";
        output += companyNumber + " | ";
        int outputStartLength = output.length();
        for (int i = 0; i < 76-outputStartLength; i++) {output += "  ";}
        output += "| " + YKBDate + " | ";
        output += course1Date + " | ";
        output += course2Date + " | ";
        output += course3Date + " | ";
        output += course4Date + " | ";
        output += course5Date + " |";

        return output;
    }

    public String getName() {
        return name;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public String getCompany() {
        return company;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public String getYKBDate() {
        return YKBDate;
    }

    public String getCourse1Date() {
        return course1Date;
    }

    public String getCourse2Date() {
        return course2Date;
    }

    public String getCourse3Date() {
        return course3Date;
    }

    public String getCourse4Date() {
        return course4Date;
    }

    public String getCourse5Date() {
        return course5Date;
    }
}
