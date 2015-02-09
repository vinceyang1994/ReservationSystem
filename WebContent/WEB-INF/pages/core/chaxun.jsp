<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<script type="text/javascript" src="js/JQuery/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="js/DateSelector.js"></script>
<style type="text/css">
table {
	border: 0;
	width: 40%;
	margin-left: auto;
	margin-right: auto;
	border-collapse: collapse;
}

td {
	font: normal 12px/17px Arial;
	padding: 2px;
	width: 100px;
}

th {
	font: bold 12px/17px Arial;
	text-align: left;
	padding: 4px;
	border-bottom: 1px solid #333;
	width: 100px;
}

.parent {
	background: #eee;
	cursor: pointer;
} /* 偶数行样式*/
.odd {
	background: #ddd;
} /* 奇数行样式*/
.selected {
	background: #aaa;
	color: #fff;
}
</style>
<script>
	$(document).ready(function() {
		$("button").click(function() {
			$("p").toggle();
		});
	});
</script>
<script type="text/javascript">
	function color() {
		//把表头设为紫色
		var th = document.getElementById("th");
		th.style.background = "violet";
		//1.得到所有<tr>元素
		var trs = document.getElementsByTagName("tr");
		var i;
		for (i = 1; i < trs.length; i++) {
			//2.改变<tr>元素的背景颜色
			if (i % 2 == 0) {
				trs[i].style.background = "yellow";
			} else {
				trs[i].style.background = "olive";
			}
		}
	}
	window.onload = color;
</script>
<script type="text/javascript">
	$(function() {
		$('tr.parent').click(function() { // 获取所谓的父行
			$(this).toggleClass("selected") // 添加/删除高亮
			.siblings('.child_' + this.id).toggle(); // 隐藏/显示所谓的子行
		}).click();
	});
</script>
<script type="text/javascript">
<!--参数传递-->
	//收集所有用户预约参数，包括实验台，日期，时间段
	function collectAllData() {
		//实验台
		var table = $("#table option:selected").val();
		//预约日期
		var yuyuedate = $("#yuyuedate").val();

	}
	function sendJson() {
		//$("#table").
		post("cha-xun",{table:table,yuyuedate:yuyuedate});
	}
	function test() {
		alert("date"+$("#yuyuedate").val());
	}
</script>
<script type="text/javascript">
<!--改变表格样式-->
/* $(#row).each()
contain */
</script>

<br />

<s:select id="table" list="{1,2}" label="实验台" onclick="collectAllData();"></s:select>
<s:label>预约日期：</s:label>
<input id="yuyuedate" type="text" style="width: 90px"
	onmouseover="HS_setDate(this);" 
	value="<s:date name="firstdate" format="yyyy-MM-dd" />">

	
<table id="showtable">
	
	



<s:iterator value="yuyuelist" status="stat" id="sd">
<tr class="parent" id="row_<s:property value = '#stat.count' />">
	<td colspan="6">xi</td>
</tr>
<tr class="child_row_<s:property value = '#stat.count' />">
	<td id="1-1">00:00~02:00</td>
	<td id="1-2">02:00~04:00</td>
	<td id="1-3">04:00~06:00</td>
	<td id="1-4">06:00~08:00</td>
	<td id="1-5">08:00~10:00</td>
	<td id="1-6">10:00~12:00</td>
</tr>
<tr class="child_row_<s:property value = '#stat.count' />">
	<td>12:00~14:00</td>
	<td>14:00~16:00</td>
	<td>16:00~18:00</td>
	<td>18:00~20:00</td>
	<td>20:00~22:00</td>
	<td>22:00~24:00</td>
</tr>

	<%-- <tr align="center">
		<td><s:property value="rid" /></td>
		<td><s:property value="uid" /></td>
		<td><s:property value="rdatetime" /></td>
	</tr> --%>
</s:iterator>
</table>
<button onclick="test();" type="button">测试JS</button>

<s:debug></s:debug>
