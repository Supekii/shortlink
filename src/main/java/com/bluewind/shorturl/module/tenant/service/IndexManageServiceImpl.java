package com.bluewind.shorturl.module.tenant.service;

import com.bluewind.shorturl.module.tenant.dao.IndexManageDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author liuxingyu01
 * @date 2022-05-18 15:25
 * @description
 **/
@Service
public class IndexManageServiceImpl {

    @Autowired
    private IndexManageDaoImpl indexManageDao;

    /**
     * 根据租户账户查询租户信息
     * @param tenantAccount
     * @return
     */
    public Map<String, Object> getTenantInfo(String tenantAccount) {
        return indexManageDao.getTenantInfo(tenantAccount);
    }

    /**
     * 根据租户id查询租户信息
     * @param tenant_id
     * @return
     */
    public Map<String, Object> getTenantInfoById(String tenant_id) {
        return indexManageDao.getTenantInfoById(tenant_id);
    }


    /**
     * 新增一个租户账户
     * @param tenantAccount
     * @param tenantName
     * @param tenantPassword
     * @param tenantEmail
     * @return
     */
    public int addTenantInfo(String tenantAccount, String tenantName, String tenantPassword, String tenantEmail) {
        return indexManageDao.addTenantInfo(tenantAccount, tenantName, tenantPassword, tenantEmail);
    }


    /**
     * 找回租户密码
     * @param tenantAccount
     * @param tenantPassword
     * @return
     */
    public int updatePasswordForFind(String tenantAccount, String tenantPassword) {
        return indexManageDao.updatePasswordForFind(tenantAccount, tenantPassword);
    }


    /**
     * 更新一个租户账户
     * @param tenant_id
     * @param tenant_name
     * @param tenant_email
     * @return
     */
    public int updateProfile(String tenant_id, String tenant_name, String tenant_email) {
        return indexManageDao.updateProfile(tenant_id, tenant_name, tenant_email);
    }


    /**
     * 更新一个租户密码
     * @param tenant_id
     * @param tenant_password
     * @param new_tenant_password
     * @return
     */
    public int updatePassword(String tenant_id, String tenant_password, String new_tenant_password) {
        return indexManageDao.updatePassword(tenant_id, tenant_password, new_tenant_password);
    }


    /**
     * 更新ak和sk
     * @param tenant_id
     * @param accessKey
     * @param accessKeySecret
     * @return
     */
    public int updateAkAndSk(String tenant_id, String accessKey, String accessKeySecret) {
        return indexManageDao.updateAkAndSk(tenant_id, accessKey, accessKeySecret);
    }


}
