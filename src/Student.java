import javax.xml.crypto.Data;

@DBTable(name = "Student")
public class Student {
    @SQLString(name = "sid", value = 16)
    String sid;
    @SQLString(name = "sname", value = 30)
    String sname;
    @SQLData(name = "sbirthday", constraint = @Constraints(allowNull = true))
    Data sbirthday;
}
