package com.dao;

import com.entity.DiscusskeshixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusskeshixinxiVO;
import com.entity.view.DiscusskeshixinxiView;


/**
 * 科室信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-15 20:07:29
 */
public interface DiscusskeshixinxiDao extends BaseMapper<DiscusskeshixinxiEntity> {
	
	List<DiscusskeshixinxiVO> selectListVO(@Param("ew") Wrapper<DiscusskeshixinxiEntity> wrapper);
	
	DiscusskeshixinxiVO selectVO(@Param("ew") Wrapper<DiscusskeshixinxiEntity> wrapper);
	
	List<DiscusskeshixinxiView> selectListView(@Param("ew") Wrapper<DiscusskeshixinxiEntity> wrapper);

	List<DiscusskeshixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusskeshixinxiEntity> wrapper);
	
	DiscusskeshixinxiView selectView(@Param("ew") Wrapper<DiscusskeshixinxiEntity> wrapper);
	

}
