package com.dao;

import com.entity.YuyuequxiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuyuequxiaoVO;
import com.entity.view.YuyuequxiaoView;


/**
 * 预约取消
 * 
 * @author 
 * @email 
 * @date 2022-04-15 20:07:29
 */
public interface YuyuequxiaoDao extends BaseMapper<YuyuequxiaoEntity> {
	
	List<YuyuequxiaoVO> selectListVO(@Param("ew") Wrapper<YuyuequxiaoEntity> wrapper);
	
	YuyuequxiaoVO selectVO(@Param("ew") Wrapper<YuyuequxiaoEntity> wrapper);
	
	List<YuyuequxiaoView> selectListView(@Param("ew") Wrapper<YuyuequxiaoEntity> wrapper);

	List<YuyuequxiaoView> selectListView(Pagination page,@Param("ew") Wrapper<YuyuequxiaoEntity> wrapper);
	
	YuyuequxiaoView selectView(@Param("ew") Wrapper<YuyuequxiaoEntity> wrapper);
	

}
