//layer 关闭当前弹出的页面
function doClose(){
	var index = parent.layer.getFrameIndex(window.name); 
	parent.layer.close(index); 
}

//刷新当前页面
function refreshPage(){
	window.location.reload();
}