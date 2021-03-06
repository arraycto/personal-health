package com.jiu.collect.mapper;

import com.github.pagehelper.Page;
import com.jiu.api.entity.RunningRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Package com.jiu.collect.mapper
 * ClassName RunningRecordMapper.java
 * Description 跑步记录数据接口
 *
 * @author Jy
 * @version V1.0
 * @date 2019-12-16 14:00
 **/
@Mapper
public interface RunningRecordMapper {

    /**
     * 查询记录
     * @param   runningRecord   参数对象
     * @return  List<RunningRecord>
     */
    List<RunningRecord> select(RunningRecord runningRecord);

    /**
     * 分页查询记录
     * @param   runningRecord
     * @param   pageSize
     * @param   pageNum
     * @return  Page<RunningRecord>
     */
    Page<RunningRecord> findByPageNumSize(RunningRecord runningRecord,@Param("pageNum")  int pageNum,@Param("pageSize") int pageSize);

    /**
     * 新增记录
     * @param   runningRecord   数据
     * @return  int
     */
    int insert(RunningRecord runningRecord);

    /**
     * 修改记录
     * @param   runningRecord   数据
     * @return  int
     */
    int update(RunningRecord runningRecord);

    /**
     * 删除记录
     * @param   runningRecord   数据
     * @return  int
     */
    int delete(RunningRecord runningRecord);

    /**
     * 删除记录
     * @param   array   数据
     * @return  int
     */
    int deleteByBatch(String[] array);

}
