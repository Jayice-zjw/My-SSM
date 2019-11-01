/*同样，在使用json传输时，用得比较多*/

    @RequestMapping("/object.do")
    @ResponseBody   //要加上这
    public Object test(String name){
        Map<String,String> map=new HashMap();
        map.put("hello","1");
        map.put("2","2");
        return map;
    }
    
    
    
//jsp中
$(function () {
       $("#ajaxRequest").click(function () {
           $.ajax({
               method:"post",
               url:"/returnString.do",
               success:function (result) {
               //获取Object中的值
                   alert(result.hello);
               }
           });
       });
    });
