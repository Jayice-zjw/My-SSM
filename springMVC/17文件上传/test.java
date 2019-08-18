package com.monkey1024.controller;

import java.io.File;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class test {
	@RequestMapping("/upload1.do")
	public ModelAndView upload1(MultipartFile photo, HttpSession session) throws Exception {

		ModelAndView mv = new ModelAndView();
		//若上传了图片
		if (!photo.isEmpty()) {
			// 获取服务器上传的文件路径
			String path = session.getServletContext().getRealPath("/upload");
			// 获取文件名称
			String filename = photo.getOriginalFilename();
			// 限制文件上传的类型。只接收png格式
			if ("image/png".equals(photo.getContentType())) {
				File file = new File(path, filename);
				// 完成文件上传	
				photo.transferTo(file);
			} else {
				mv.addObject("msg", "请选择png格式的文件上传");
				mv.setViewName("upload-fail");

				return mv;
			}

		}else {
			mv.addObject("msg", "请上传文件");
			mv.setViewName("upload-fail");

			return mv;
		}

		mv.setViewName("upload-success");
		return mv;
	}
}
