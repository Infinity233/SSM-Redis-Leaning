package com.Infinity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/fileupload")
public class FileController {

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public ModelAndView loadMultipartFile(MultipartFile file) {
        ModelAndView mv = new ModelAndView();

        mv.setView(new MappingJackson2JsonView());

        String fileName = file.getOriginalFilename();

        file.getContentType();

        File dest = new File(fileName);

        try {
            file.transferTo(dest);

            mv.addObject("success", true);
            mv.addObject("msg", "上传文件成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return mv;
        }
    }

    @RequestMapping("/uploadPart")
    public ModelAndView uploadPart(Part file) {
        ModelAndView mv = new ModelAndView();

        mv.setView(new MappingJackson2JsonView());
        String fileName = file.getSubmittedFileName();
        File dest = new File(fileName);

        try {
            file.write("d:/tmp/" + fileName);

            mv.addObject("success", true);
            mv.addObject("msg", "上传文件成功");
        } catch (IOException e) {
            mv.addObject("success", false);
            mv.addObject("msg", "上传文件失败");
            e.printStackTrace();
        }

        return mv;
    }
}
