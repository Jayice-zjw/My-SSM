@RequestMapping(value="/test.do" ,  params={"name" , "age"})   //要求请求中必须携带请求参数 name 与 age

@RequestMapping(value="/test.do" , params={"!name" , "age"})   //要求请求中必须携带请求参数 age，但必须不能携带参数 name

@RequestMapping(value="/test.do" , params={"name=jack" , "age=23"})    //要求请求中必须携带请求参数 name，且其值必须为jack；必须携带参数 age，其值必须为 23

@RequestMapping(value="/test.do" , params="name!=jack")   //要求请求中必须携带请求参数name，且其值必须不能为jac
