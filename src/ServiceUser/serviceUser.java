package ServiceUser;

import Dao.mySqlDao;

public class serviceUser implements User{
    @Override
    public void getUser() {
        mySqlDao mySqlDao = new mySqlDao();
        mySqlDao.getUser();
    }
}
