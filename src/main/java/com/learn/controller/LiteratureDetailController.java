package com.learn.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.learn.entity.Literature;
import com.learn.entity.LiteratureDetail;
import com.learn.service.LiteratureDetailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (LiteratureDetail)表控制层
 *
 * @author Du
 * @since 2022-03-15 19:00:11
 */
@RestController
@RequestMapping("literatureDetail")
public class LiteratureDetailController {
    /**
     * 服务对象
     */
    @Resource
    private LiteratureDetailService literatureDetailService;

    //实现分页功能
    @GetMapping
    public PageInfo<LiteratureDetail> dividePage(
            @RequestParam(value = "CurrentPage",required = false,defaultValue = "1")
                    Integer CurrentPage,Integer literatureClassifyId,
             Integer literature_id){
        PageHelper.startPage(CurrentPage,8);
        List<LiteratureDetail> LiteratureDetails = literatureDetailService.dividePage(literatureClassifyId,literature_id);
        PageInfo<LiteratureDetail> pageInfo = new PageInfo<>(LiteratureDetails);
        return pageInfo;
    }
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<LiteratureDetail> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.literatureDetailService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param literatureDetail 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<LiteratureDetail> add(LiteratureDetail literatureDetail) {
        return ResponseEntity.ok(this.literatureDetailService.insert(literatureDetail));
    }

    /**
     * 编辑数据
     *
     * @param literatureDetail 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<LiteratureDetail> edit(LiteratureDetail literatureDetail) {
        return ResponseEntity.ok(this.literatureDetailService.update(literatureDetail));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.literatureDetailService.deleteById(id));
    }

}

