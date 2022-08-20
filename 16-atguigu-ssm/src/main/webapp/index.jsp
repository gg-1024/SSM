<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/static/js/jquery-1.12.4.min.js"></script>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <script
            src="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>

    <!-- 员工添加模态框 -->
    <div class="modal fade" id="empAndModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">添加员工</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal">
                        <div class="form-group">
                            <label for="empName_add_input" class="col-sm-2 control-label">员工名字</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="empName_add_input"  name="empName" placeholder="请输入员工姓名">
                                <span class="help-block"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="email_add_input" class="col-sm-2 control-label">email</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="email_add_input" name="email" placeholder="请输入email">
                                <span class="help-block"></span>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="email_add_input" class="col-sm-2 control-label">gender</label>
                            <div class="col-sm-8">
                                <label class="radio-inline">
                                    <input type="radio" name="gender"  id="gender_add_input1" value="F" checked> 男
                                </label>
                                <label class="radio-inline">
                                    <input type="radio" name="gender" id="gender_add_input2" value="M"> 女
                                </label>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="email_add_input" class="col-sm-2 control-label">部门</label>
                            <div class="col-sm-4">
                                <select class="form-control" id="dept_name_list" name="dId"></select>
                            </div>
                        </div>

                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary" id="emp_page_btn">提交</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                </div>
            </div>
        </div>
    </div>

    <!-- 员工修改模态框 -->
    <div class="modal fade" id="empUpdateModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="emp_update_record">修改员工信息</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal">
                        <div class="form-group">
                            <label for="empName_update_static" class="col-sm-2 control-label">员工名字</label>
                            <div class="col-sm-8">
                                <p class="form-control-static" id="empName_update_static"></p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="email_update_input" class="col-sm-2 control-label">email</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="email_update_input" name="email">
                                <span class="help-block"></span>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="email_update_input" class="col-sm-2 control-label">gender</label>
                            <div class="col-sm-8">
                                <label class="radio-inline">
                                    <input type="radio" name="gender"  id="gender_update_input1" value="F" checked> 男
                                </label>
                                <label class="radio-inline">
                                    <input type="radio" name="gender" id="gender_update_input2" value="M"> 女
                                </label>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="email_update_input" class="col-sm-2 control-label">部门</label>
                            <div class="col-sm-4">
                                <select class="form-control" id="dept_update_list" name="dId"></select>
                            </div>
                        </div>

                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary" id="emp_update_btn">修改</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                </div>
            </div>
        </div>
    </div>

    <div class="container">
        <%--标题--%>
        <div class="row">
            <div class="col-md-12">
                <h1>SSM-CRUD</h1>
            </div>
        </div>

        <%--按钮--%>
        <div class="row">
            <div class="col-md-2 col-md-offset-10">
                <button type="button" class="btn btn-success" id="emp_add_model_btn">新增</button>
                <button type="button" class="btn btn-danger">删除</button>
            </div>
        </div>
        <br>

        <%--数据--%>
        <div class="row">
            <div class="col-md-12">
                <table class="table table-hover" id="emp_table">
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>empName</th>
                            <th>gender</th>
                            <th>email</th>
                            <th>department</th>
                            <th>操作</th>
                        </tr>
                    </thead>
                    <tbody>

                    </tbody>
                </table>
            </div>
        </div>

        <%--分页信息--%>
        <div class="row">
            <%--分页文字信息--%>
            <div class="col-md-6" id="record"></div>

            <%--分页条--%>
            <div class="col-md-6">
                <nav aria-label="Page navigation" id="nav"></nav>
            </div>
        </div>

    </div>
    <script type="text/javascript">

        var totalRecord,currentPage;

        //页面加载完成以后，直接去发送ajax请求,要到分页数据
        $(function(){
            to_page(1);
        });

        function to_page(pn){
            $.ajax({
                url:"${pageContext.request.contextPath}/emps",
                data:"pn="+pn,
                type:"GET",
                success:function(result){
                    console.log(result);
                    //1、解析并显示员工数据
                    build_emp_table(result);
                    //2、解析并显示分页信息
                    build_page_Info(result);
                    //3、解析显示分页条数据
                    build_page_nav(result);
                }
            });
        }

        //解析并显示员工数据
        function build_emp_table(result) {
            totalRecord = result.extend.pageInfo.total;
            //因为是ajax请求，页面不更新，所以先清空数据
            $("#emp_table tbody").empty();
            var emps = result.extend.pageInfo.list;

            //循环设置每一行的数据
            $.each(emps,function (index,item) {
                var empId = $("<td></td>").append(item.empId);
                var empName = $("<td></td>").append(item.empName);
                var gender = $("<td></td>").append(item.gender="F"?"女":"男");
                var email = $("<td></td>").append(item.email);
                var department = $("<td></td>").append(item.department.deptName);

                var editBtn = $("<button></button>").addClass("btn btn-info btn-sm edit_btn")
                        .append($("<span></span>").addClass("glyphicon glyphicon-th-list")).append(" 编辑");
                editBtn.attr("edit_id",item.empId);
                var deleteBtn = $("<button></button>").addClass("btn btn-danger btn-sm delete_btn")
                    .append($("<span></span>").addClass("glyphicon glyphicon-trash")).append(" 删除");
                var btn = $("<td></td>").append(editBtn).append(" ").append(deleteBtn);

                $("<tr></tr>").append(empId).append(empName)
                    .append(gender).append(email)
                    .append(department).append(btn).appendTo("#emp_table tbody");
            })
        }

        //解析并显示分页信息
        function build_page_Info(result) {
            $("#record").empty();
            //设置数据信息
            $("<span></span>").append("当前第").append(result.extend.pageInfo.pageNum).append("页，总")
                .append(result.extend.pageInfo.pages).append("页，共").append(result.extend.pageInfo.total)
                .append("条记录").appendTo("#record");
        }

        //解析显示分页条数据
        function build_page_nav(result) {
            $("#nav").empty();

            //设置一个ul，后面要包裹所有的li
            var ul = $("<ul></ul>").addClass("pagination");

            //首页、上一页、下一页、尾页的设置，要有点击事件
            var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
            var prePageLi = prePageLi = $("<li></li>").append($("<a></a>").append($("<span></span>")
                .append("&laquo;").attr("aria-hidden","true")));

            if (result.extend.pageInfo.pageNum != 1){
                firstPageLi.click(function () {
                    to_page(1);
                })
                prePageLi.click(function () {
                    to_page(result.extend.pageInfo.pageNum-1);
                })
            }

            var postPageLi = postPageLi = $("<li></li>").append($("<a></a>").append($("<span></span>")
                .append("&raquo;").attr("aria-hidden","true")));
            var lastPageLi = $("<li></li>").append($("<a></a>").append("尾页").attr("href","#"));

            if (result.extend.pageInfo.pageNum != result.extend.pageInfo.pages){
                postPageLi.click(function () {
                    to_page(result.extend.pageInfo.pageNum+1);
                })
                lastPageLi.click(function () {
                    to_page(result.extend.pageInfo.pages);
                })
            }

            //设置为首页的时候不能点击首页
            if (result.extend.pageInfo.hasPreviousPage == false){
                firstPageLi.addClass("disabled");
                prePageLi.addClass("disabled");
            }
            if (result.extend.pageInfo.hasNextPage == false){
                postPageLi.addClass("disabled");
                lastPageLi.addClass("disabled");
            }

            ul.append(firstPageLi).append(prePageLi);

            var navigatepageNums = result.extend.pageInfo.navigatepageNums;
            $.each(navigatepageNums,function (index, item) {
                var numLi = $("<li></li>").append($("<a></a>").append(item));
                if (item == result.extend.pageInfo.pageNum){
                    numLi.addClass("active");
                }
                numLi.click(function(){
                    to_page(item);
                });
                ul.append(numLi);
            })

            ul.append(postPageLi).append(lastPageLi);
            ul.appendTo("#nav");
        }

        //点击显示模态框
        $("#emp_add_model_btn").click(function () {
            //把上一次对数据的校验信息设置为空
            $("#empName_add_input").next("span").text("");
            $("#email_add_input").next("span").text("");
            // $("#emp_add_model_btn")[0].reset();

            $('#empAndModel').modal({
                backdrop:"static"
            })
            $.ajax({
                url:"${pageContext.request.contextPath}/dept",
                type:"GET",
                success:function(result){
                    $("#dept_name_list").empty();
                    var depts = result.extend.depts;
                    $.each(depts,function (value,item) {
                        var option = $("<option></option>").append(item.deptName)
                            .attr("value",item.deptID).appendTo("#dept_name_list");
                    })
                }
            });
        });

        //校验表单数据
        function validate_add_form(){
            //1、拿到要校验的数据，使用正则表达式
            var empName = $("#empName_add_input").val();
            var regName = /(^[a-zA-Z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})/;
            if(!regName.test(empName)){
                //alert("用户名可以是2-5位中文或者6-16位英文和数字的组合");
                show_validate_msg("#empName_add_input", "error", "用户名可以是2-5位中文或者6-16位英文和数字的组合");
                return false;
            }else{
                show_validate_msg("#empName_add_input", "success", "");
            };

            //2、校验邮箱信息
            var email = $("#email_add_input").val();
            var regEmail = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
            if(!regEmail.test(email)){
                //alert("邮箱格式不正确");
                //应该清空这个元素之前的样式
                show_validate_msg("#email_add_input", "error", "邮箱格式不正确");
                return false;
            }else{
                show_validate_msg("#email_add_input", "success", "");
            }
            return true;
        }

        //显示校验结果的提示信息
        function show_validate_msg(ele,status,msg){
            //清除当前元素的校验状态
            $(ele).parent().removeClass("has-success has-error");
            $(ele).next("span").text("");
            if("success"==status){
                $(ele).parent().addClass("has-success");
                $(ele).next("span").text(msg);
            }else if("error" == status){
                $(ele).parent().addClass("has-error");
                $(ele).next("span").text(msg);
            }
        }

        //动态检查员工信息是否合法
        $("#empName_add_input").change(function () {
            var empName = this.value;
            $.ajax({
                url:"${pageContext.request.contextPath}/checkEmployee",
                type:"GET",
                data:"empName="+empName,
                success:function (result) {
                    if(result.code == 200){
                        show_validate_msg("#empName_add_input","success","用户名可用")
                    }else if (result.code == 500){
                        show_validate_msg("#empName_add_input","error","用户名已被注册")
                    }
                }
            });
        })

        //改变email后动态提示信息
        $("#email_add_input").change(function () {
            var email = $("#email_add_input").val();
            var regEmail = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
            if(!regEmail.test(email)){
                show_validate_msg("#email_add_input", "error", "邮箱格式不正确");
            }else{
                show_validate_msg("#email_add_input", "success", "邮箱格式正确");
            }
        })

        //提交表单数据
        $("#emp_page_btn").click(function () {
            //先校验表单中的数据是否合法
            if (!validate_add_form()){
                return false;
            }

            //模态框填写的表单数据提交给控制器
            $.ajax({
                url:"${pageContext.request.contextPath}/emps",
                type:"POST",
                data:$("#empAndModel form").serialize(),
                success:function (result) {
                    alert(result.msg);

                    //关闭模态框
                    $("#empAndModel").modal("hide");
                    //跳转到最后一页查看插入的数据
                    to_page(totalRecord);
                }
            });
        })

        //添加按钮，绑定事件
        $(document).on("click",".edit_btn",function () {
            //查询员工信息
            $.ajax({
                url:"${pageContext.request.contextPath}/dept",
                type:"GET",
                success:function(result){
                    $("#dept_update_list").empty();
                    var depts = result.extend.depts;
                    $.each(depts,function (value,item) {
                        $("<option></option>").append(item.deptName)
                            .attr("value",item.deptID).appendTo("#dept_update_list");
                    })
                }
            });
            //查询员工信息
            getEmpById($(this).attr("edit_id"));

            $('#empUpdateModel').modal({
                backdrop:"static"
            })
        })

        function getEmpById(empId) {
            $.ajax({
                url:"${pageContext.request.contextPath}/emp/"+empId,
                type:"GET",
                success:function (result) {
                    $("#empName_update_static").text(result.extend.employee.empName);
                    $("#email_update_input").val(result.extend.employee.email)
                    $("#empUpdateModel input[name=gender]").val([result.extend.employee.gender])
                    $("#empUpdateModel select").val([result.extend.employee.did]);
                }
            })
        }

    </script>
</body>
</html>
