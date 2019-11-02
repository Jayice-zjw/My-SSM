@RequestMapping("test.do")
    //不能将@Validated 注解在String类型和基本类型的形参前。
    //BindingResult参数可以获取到所有验证异常的信息
    public ModelAndView test1 (@Validated Student student, BindingResult br){
        ModelAndView mv=new ModelAndView();
        List<ObjectError> allErrors = br.getAllErrors();
        System.out.println(allErrors.size());
        if (allErrors != null && allErrors.size() > 0) {
            FieldError nameError = br.getFieldError("name");
            FieldError ageError = br.getFieldError("age");

            if (nameError != null) {
                mv.addObject("nameError", nameError.getDefaultMessage());
            }
            if (ageError != null) {
                mv.addObject("ageError", ageError.getDefaultMessage());
            }
            mv.setViewName("/form");
            return mv;
        }
        mv.addObject("name", student.getName());
        mv.addObject("age",student.getAge());
        mv.setViewName("/result");
        return mv;
    }
