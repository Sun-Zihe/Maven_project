package com.fc.service.impl;

import com.fc.dao.AlleviationMapper;
import com.fc.entity.Alleviation;
import com.fc.entity.VolunteerRecruitment;
import com.fc.service.AlleviationService;
import com.fc.vo.DataVO;
import com.fc.vo.ReturnMessageVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AlleviationServiceImpl implements AlleviationService {

    @Autowired
    AlleviationMapper alleviationMapper;

    @Override
    public ReturnMessageVO click(Long id, Date lastClickTime) {

        if (lastClickTime == null) {
            lastClickTime = new Date();
        }

        Integer affectedRows = alleviationMapper.click(id, lastClickTime);

        ReturnMessageVO vo;

        if (affectedRows > 0) {
<<<<<<< HEAD
            vo = new ReturnMessageVO(200, "播放量加1成功！！", true, null);
=======
            vo = new ReturnMessageVO(1000, "播放量加1成功！！", true, null);
>>>>>>> origin/master
        } else {
            vo = new ReturnMessageVO(5000, "播放量加1失败！！", false, null);
        }

        return vo;
    }

    @Override
    public ReturnMessageVO getList(Integer pageNum, Integer pageSize, Long id) {
        // 返回给前端的结果
        ReturnMessageVO resultVO;

        // 分页相关的参数
        DataVO<Alleviation> dataVO;

        // 结果中data对应的用户数组
        List<Alleviation> alleviations;

        // 说明传递了id，那就是findById
        if (id != null) {
            alleviations = new ArrayList<>();

            // 查询
            Alleviation alleviation = alleviationMapper.selectByPrimaryKey(id);

            // 没有查到用户的情况
            if (alleviation == null) {
                dataVO = new DataVO<>(0L, alleviations, pageNum, pageSize);

                resultVO = new ReturnMessageVO(4000, "没有这条扶贫政策!", false, dataVO);
            } else {
                // 如果是查询单个，那么点击量应该加1
                click(alleviation.getId(), null);

                // 更新点击的次数
                alleviation.setClickNum(alleviation.getClickNum() + 1);

                // 查到了用户扔到集合中
                alleviations.add(alleviation);

                dataVO = new DataVO<>(1L, alleviations, pageNum, pageSize);

<<<<<<< HEAD
                resultVO = new ReturnMessageVO(200, "查到了该政策!", true, dataVO);
=======
                resultVO = new ReturnMessageVO(1000, "查到了该政策!", true, dataVO);
>>>>>>> origin/master
            }
        } else {
            // 开启分页
            PageHelper.startPage(pageNum, pageSize);

            alleviations = alleviationMapper.selectByExample(null);

            // 如果数据库是空的，一个人都没查到
            if (alleviations.size() == 0) {
                dataVO = new DataVO<>(0L, alleviations, pageNum, pageSize);

                resultVO = new ReturnMessageVO(4100, "没有扶贫政策!!!", false, dataVO);
                // 查到了
            } else {
                // 封装pageInfo，为了获取总数据量
                PageInfo<Alleviation> pageInfo = new PageInfo<>(alleviations);

                dataVO = new DataVO<>(pageInfo.getTotal(), alleviations, pageNum, pageSize);

<<<<<<< HEAD
                resultVO = new ReturnMessageVO(200, "扶贫政策查询成功！！！!", true, dataVO);
=======
                resultVO = new ReturnMessageVO(1100, "扶贫政策查询成功！！！!", true, dataVO);
>>>>>>> origin/master

            }
        }

        return resultVO;
    }

    @Override
    public ReturnMessageVO add(Alleviation alleviation) {
        ReturnMessageVO vo;
        // 判断是否存在创建时间，没有就自己加上
        if (alleviation.getCreateTime() == null) {
            alleviation.setCreateTime(new Date());
        }

        // 新创建的扶贫政策，点击量应该是0
        alleviation.setClickNum(0);
        alleviation.setLastClickTime(null);

        int affectedRows = alleviationMapper.insertSelective(alleviation);

        if (affectedRows > 0) {
<<<<<<< HEAD
            vo = new ReturnMessageVO(200, "添加政策成功！！", true, alleviation);
=======
            vo = new ReturnMessageVO(1000, "添加政策成功！！", true, alleviation);
>>>>>>> origin/master
        } else {
            vo = new ReturnMessageVO(5000, "添加政策失败！！", false, null);
        }

        return vo;
    }

    @Override
    public ReturnMessageVO update(Alleviation alleviation) {
        int affectedRows = alleviationMapper.updateByPrimaryKeySelective(alleviation);

        ReturnMessageVO vo;

        if (affectedRows > 0) {
            // 修改完成之后，再重新查询一次，保证返回给前端的是最新最全的数据
            alleviation = alleviationMapper.selectByPrimaryKey(alleviation.getId());

<<<<<<< HEAD
            vo = new ReturnMessageVO(200, "修改政策成功！！", true, alleviation);
=======
            vo = new ReturnMessageVO(1000, "修改政策成功！！", true, alleviation);
>>>>>>> origin/master
        } else {
            vo = new ReturnMessageVO(5000, "修改政策失败！！", false, null);
        }

        return vo;
    }

    @Override
    public ReturnMessageVO delete(Long id) {
        int affectedRows = alleviationMapper.deleteByPrimaryKey(id);

        ReturnMessageVO vo;

        if (affectedRows > 0) {
<<<<<<< HEAD
            vo = new ReturnMessageVO(200, "删除政策成功！！", true, null);
=======
            vo = new ReturnMessageVO(1000, "删除政策成功！！", true, null);
>>>>>>> origin/master
        } else {
            vo = new ReturnMessageVO(5000, "删除政策失败！！", false, null);
        }

        return vo;
    }
}
