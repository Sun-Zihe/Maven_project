package com.szh.controller;

import org.springframework.http.ContentDisposition;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Controller
@RequestMapping("file")
public class FileController {

    @RequestMapping("toDownload")
    public String toDownload(Model model,String filename){
        model.addAttribute("img",filename);
        return "/index.jsp";
    }

    @RequestMapping("download")
    public void download(String filename, HttpServletResponse response){
        String path = "D:/server/apache-tomcat-8.5.37/webapps/upload";

        File file = new File(path,filename);

        //设置响应头告知浏览器要以下载的方式打开网页
        response.setHeader("Content-ContentDisposition","attachment;filename="+filename);


        // 文件流分为字节流和字符流
        // 字节流可以读写任意类型的数据，因为字节是最基本的存储单元
        // 字符流只能读写纯文本

        ServletOutputStream outputStream = null;
        BufferedInputStream inputStream = null;

        try {
            outputStream = response.getOutputStream();
            inputStream = new BufferedInputStream(new FileInputStream(file));

            //声明一个缓冲数组
            byte[] buffer = new byte[1024*8];

            while(inputStream.read(buffer)!= -1){
                //写
                outputStream.write(buffer);

                outputStream.flush();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }




}
