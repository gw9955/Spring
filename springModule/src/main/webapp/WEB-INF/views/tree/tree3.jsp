<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/jstree.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/themes/default/style.min.css" />
<link rel="stylesheet" href="/resources/css/bootstrap.min.css" />
<title>Insert title here</title>
<style type="text/css">
    #sidetree input { width:150px; color:#000; }
    #sidetree i { margin:0px; }
    #sidetree button { height:30px; vertical-align:-1px; }
</style>
<script type="text/javascript">
    $(document).ready(function(){
        var tree_list = $.parseJSON('{"tree_1":{"tree_id":"tree_1","tree_value":"\uc6b4\uc601\ud300"},"tree_1_1":{"tree_id":"tree_1_1","tree_value":"\uc6b4\uc601\uc9c0\uc6d0\ud300"},"tree_2":{"tree_id":"tree_2","tree_value":"\uc9c0\uc6d0\ud300"},"tree_2_1":{"tree_id":"tree_2_1","tree_value":"\uac1c\ubc1c\ud300"},"tree_2_2":{"tree_id":"tree_2_2","tree_value":"\ub514\uc790\uc778\ud300"},"tree_3":{"tree_id":"tree_3","tree_value":"\uc0c1\ub2f4\ud300"}}');
        for(var key in tree_list)
        {
            var row = tree_list[key];
            add_tree_tag(row['tree_id'], row['tree_value']);
        }
    });

    function add_tree(parent_tree_id)
    {
        var parent_depth = parent_tree_id.split("_").length;
        var tree_id_last = "";
        $("#tree li").each(function(){
            if($(this).attr("id").indexOf(parent_tree_id + "_") != -1)
            {
                if($(this).attr("id").split("_").length == parent_depth + 1){
                    tree_id_last = $(this).attr("id");
                }
            }
        });

        var next_tree_number = "";
        if(tree_id_last == ""){ //1depth
            next_tree_number = "1";
        }
        else
        {
            var tree_id_last_split = tree_id_last.split("_");
            var next_tree_number = parseInt(tree_id_last_split[tree_id_last_split.length - 1]) + 1;
        }

        var create_tree_id = parent_tree_id + "_" + next_tree_number;
        tree_value = "";
        //var tree_value = create_tree_id;

        add_tree_tag(create_tree_id, tree_value);
    }

    function add_tree_tag(create_tree_id, tree_value)
    {
        var parent_tree_id = new Array();
        var create_tree_id_split = create_tree_id.split("_");
        create_tree_id_split.pop();
        for(var key in create_tree_id_split){
            parent_tree_id.push(create_tree_id_split[key]);
        }
        parent_tree_id = parent_tree_id.join("_");

        var btn_tag = "";
        btn_tag += "<button type='button' class='btn btn-info' onclick=\"add_tree('"+create_tree_id+"')\">+</button>";
        btn_tag += "<button type='button' class='btn btn-danger' onclick=\"del_tree('"+create_tree_id+"','del')\">-</button>";

        var tree_tag = "<li id='"+create_tree_id+"'><input type='text' name='"+create_tree_id+"' value='"+tree_value+"' /> "+btn_tag+"</li>";

        //console.log(parent_tree_id + " => " + create_tree_id);
        $("#" + parent_tree_id).append(tree_tag);
    }

    function del_tree(tree_id){
        $("#" + tree_id).remove();
    }
</script>
</head>
<body>
	<div id="sidetree">
		<div class="panel panel-default">
			<div class="panel-heading">
				<h6 class="panel-title">
					<i class="fa fa-building-o" aria-hidden="true"
						style="margin-right: 5px;"></i>
				</h6>
			</div>
			<div class="panel-body">
				<!--<div id="sidetreecontrol"><a href="?#">전체 닫기</a> | <a href="?#">전체 열기</a></div>-->
				<div class="form-group">
					<label class="col-sm-1 control-label"><button type="button"
							class="btn btn-info" onclick="add_tree('tree');">
							<i class="fa fa-plus"></i> 부서추가
						</button></label>
					<div class="col-sm-11">
						<form id="organ_form">
							<ul id="tree"></ul>
						</form>
					</div>
					<div class="col-sm-12">
						<button type="button" class="btn btn-success"
							onclick="set_organ();">
							<i class="fa fa-save"></i> 저장
						</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>