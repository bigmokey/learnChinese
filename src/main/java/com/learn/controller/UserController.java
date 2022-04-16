package com.learn.controller;

import com.learn.entity.User;
import com.learn.service.UserService;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.model.PutObjectRequest;
import com.qcloud.cos.model.PutObjectResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * (User)表控制层
 *
 * @author Du
 * @since 2022-03-31 17:31:23
 */
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;
    @Resource
    private COSClient cosClient;
    @PostMapping("/upload")
    public int upload(MultipartFile file, long id) throws IOException {
        if (file==null){
            return -1;
        }
        File localFile = File.createTempFile("temp",null);
        file.transferTo(localFile);
        String fileName = System.currentTimeMillis() + file.getOriginalFilename();
        // 指定文件将要存放的存储桶
        String bucketName = "";
        // 指定文件上传到 COS 上的路径，即对象键。例如对象键为folder/picture.jpg，则表示将文件 picture.jpg 上传到 folder 路径下
//        String key = "4756/img/v2.jpg";
        String key = "4756/img/"+fileName;
        PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, key, localFile);
        PutObjectResult putObjectResult = cosClient.putObject(putObjectRequest);
        //https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/4756/img/v2.jpg

        return userService.addAvatar("https:/" + fileName,id);

    }
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<User> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.userService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param user 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<User> add(@RequestBody User user) {
        return ResponseEntity.ok(this.userService.insert(user));
    }
    @PostMapping("/login")
    public ResponseEntity<User> userLogin(@RequestBody User user) {
        return ResponseEntity.ok(this.userService.userLogin(user));
    }
    /**
     * 编辑数据
     *
     * @param user 实体
     * @return 编辑结果
     */
    @PatchMapping
    public ResponseEntity<User> edit(@RequestBody User user) {
        return ResponseEntity.ok(this.userService.update(user));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.userService.deleteById(id));
    }

}

