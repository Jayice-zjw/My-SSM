@RequestMapping("/sohu.do")
    public String sohu(Model model){
        model.addAttribute("username","jayice");
        model.addAttribute("age",19);
        return "result";
    }
