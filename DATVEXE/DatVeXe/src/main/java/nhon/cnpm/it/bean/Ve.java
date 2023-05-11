package nhon.cnpm.it.bean;

public class Ve {


    String email;
    String phone;
    String maghe;
    String id_tuyen;
    String id_xe;

    public Ve() {
    }

    public Ve(String email, String phone, String maghe, String id_tuyen, String id_xe) {
        this.email = email;
        this.phone = phone;
        this.maghe = maghe;
        this.id_tuyen = id_tuyen;
        this.id_xe = id_xe;
    }

    public Ve(String maghe, String id_tuyen, String id_xe) {
        this.maghe = maghe;
        this.id_tuyen = id_tuyen;
        this.id_xe = id_xe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMaghe() {
        return maghe;
    }

    public void setMaghe(String maghe) {
        this.maghe = maghe;
    }

    public String getId_tuyen() {
        return id_tuyen;
    }

    public void setId_tuyen(String id_tuyen) {
        this.id_tuyen = id_tuyen;
    }

    public String getId_xe() {
        return id_xe;
    }

    public void setId_xe(String id_xe) {
        this.id_xe = id_xe;
    }

    @Override
    public String toString() {
        return "Ve{" +
                "chaicode='" + maghe + '\'' +
                ", id_tuyen='" + id_tuyen + '\'' +
                ", id_xe='" + id_xe + '\'' +
                '}';
    }
}
