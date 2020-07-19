package org.system.base;

import tk.mybatis.mapper.common.*;
import tk.mybatis.mapper.common.special.InsertListMapper;

public interface Mapper<T>
        extends
        tk.mybatis.mapper.common.BaseMapper<T>,
        ConditionMapper<T>,
        IdsMapper<T>,
        InsertListMapper<T>,
        RowBoundsMapper<T>,
        ExampleMapper<T>
{
}
