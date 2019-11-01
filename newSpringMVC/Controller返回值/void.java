//void返回值在前端使用jquery框架，而且要返回json格式的时候比较常见

@RequestMapping("/ajaxRequest.do")
    public void ajaxRequest(HttpServletRequest request, HttpServletResponse response, Student student) throws Exception{
        PrintWriter out=response.getWriter();
        String jsonString = JSON.toJSONString(student);
        out.write(jsonString);
    }
