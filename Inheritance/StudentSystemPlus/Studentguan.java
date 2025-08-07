package StudentSystemPlus;

public class Studentguan {
    private String name;
    private String password;
    private String ID;
    private String phone;

    public Studentguan() {
    }

    public Studentguan(String name, String password, String ID, String phone) {
        this.name = name;
        this.password = password;
        this.ID = ID;
        this.phone = phone;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return ID
     */
    public String getID() {
        return ID;
    }

    /**
     * 设置
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * 获取
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return "Studentguan{name = " + name + ", password = " + password + ", ID = " + ID + ", phone = " + phone + "}";
    }
}
