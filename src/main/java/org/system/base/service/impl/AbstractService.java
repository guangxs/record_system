package org.system.base.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.system.base.Mapper;
import org.system.base.service.Service;
import tk.mybatis.mapper.entity.Condition;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * 基于通用MyBatis Mapper插件的Service接口的实现
 */
public abstract class AbstractService<M extends Mapper<T>, T> implements Service<T> {

    @Autowired
    protected M mapper;

    /**
     * 当前泛型真实类型的Class
     */
    private Class<T> modelClass;

    public AbstractService() {
        ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
        modelClass = (Class<T>) pt.getActualTypeArguments()[0];
    }

    /**
     * 持久化
     *
     * @param model
     */
    @Override
    public int save(T model) {
        return mapper.insertSelective(model);
    }

    /**
     * 批量持久化
     *
     * @param models
     */
    @Override
    public int save(List<T> models) {
        return mapper.insertList(models);
    }

    /**
     * 通过主鍵刪除
     *
     * @param id
     */
    @Override
    public void deleteById(String id) {
        mapper.deleteByPrimaryKey(id);
    }

    /**
     * 批量刪除 eg：ids -> “1,2,3,4”
     *
     * @param ids
     */
    @Override
    public int deleteByIds(String ids) {

        String[] idsArr = ids.split(",");
        if (idsArr.length == 1) {
            return mapper.deleteByPrimaryKey(Long.parseLong(ids));
        } else {
            int n = 0;
            for (String id : idsArr) {
                n += mapper.deleteByPrimaryKey(Long.parseLong(id));
            }
            return n;
        }
    }

    /**
     * 更新
     *
     * @param model
     */
    @Override
    public int update(T model) {
        return mapper.updateByPrimaryKeySelective(model);
    }

    /**
     * 通过ID查找
     *
     * @param id
     * @return
     */
    @Override
    public T findById(Object id) {
        return mapper.selectByPrimaryKey(id);
    }

    /**
     * 通过Model中某个成员变量名称（非数据表中column的名称）查找,value需符合unique约束
     *
     * @param fieldName
     * @param value
     * @return
     * @throws Exception
     */
    @Override
    public T findBy(String fieldName, Object value) throws Exception {
        try {
            T model = modelClass.newInstance();
            Field field = modelClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(model, value);
            return mapper.selectOne(model);
        } catch (ReflectiveOperationException e) {
            throw new Exception(e.getMessage(), e);
        }
    }

    /**
     * 通过多个ID查找//eg：ids -> “1,2,3,4”
     *
     * @param ids
     * @return
     */
    @Override
    public List<T> findByIds(String ids) {
        return mapper.selectByIds(ids);
    }

    /**
     * 根据条件查找
     *
     * @param condition
     * @return
     */
    @Override
    public List<T> findByCondition(Condition condition) {
        return mapper.selectByCondition(condition);
    }

    /**
     * //获取所有
     *
     * @return
     */
    @Override
    public List<T> findAll() {
        return mapper.selectAll();
    }
}