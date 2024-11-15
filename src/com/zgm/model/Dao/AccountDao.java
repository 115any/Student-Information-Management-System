package com.zgm.model.Dao;
import com.zgm.model.bean.User;

/**
 * account表Dao接口
 * 包含涉及account表的各种操作
 */
public interface AccountDao {
    /**
     * 查询account表，验证账号并返回登录用户类型
     * @return User
     */
    User queryAccount(String account, String password);

    /** 修改密码 */
    boolean updatePassword(String account, String newPassword);

    /** 添加账户 */
    boolean addUser(String number, String type);

    /** 删除账户 */
    boolean deleteUser(String number);

}
