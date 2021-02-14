package Dao;

public class mySqlDao implements Dao{
    @Override
    public void getUser() {
        System.out.println("通过mysql获取用户数据！");
    }
}
