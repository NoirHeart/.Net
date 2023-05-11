package nhon.cnpm.it.service;

import nhon.cnpm.it.bean.User;
import nhon.cnpm.it.db.JDBIConnector;
import org.jdbi.v3.core.Handle;

public class UserService {
    private static UserService instance;

    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }
        return instance;
    }
    // lấy password của user đang đăng nhập dựa trên id
    public String getPasswordById(String Id) {
        try (Handle handle = JDBIConnector.get().open()) {
            String sql = "SELECT pass FROM user WHERE id = ?";
            return handle.createQuery(sql)
                    .bind(0, Id)
                    .mapTo(String.class)
                    .first();

        }
    }
        //thay đổi password
    public void changePassword(String newPass, String Id) {
        JDBIConnector.get().withHandle(handle -> {
            String sql = "UPDATE User SET pass=? WHERE id =?";
            return handle.createUpdate(sql)
                    .bind(0, newPass)
                    .bind(1, Id)
                    .execute();
        });
    }

}