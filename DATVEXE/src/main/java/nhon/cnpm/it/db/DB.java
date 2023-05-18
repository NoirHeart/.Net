package nhon.cnpm.it.db;


import nhon.cnpm.it.bean.AbBean;

public class DB {
    private static DB install;

    public static DB me() {
        if(install==null) install = new DB();
        return install;
    }

    public DB() {
    }

    public boolean insert(AbBean bean) {
        return bean.insert(JDBIConnector.me());
    }


}
