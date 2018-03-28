function login(){
	var username = $("#username").val();
	var password = $("#password").val();
	
	var requestid = 123;
	var managerid = 56165365653276367376;
	var passwords = ['a','b','c'];
	var verficationcode = ['c','d','e'];
	
	
	$.ajax({
		url:"/",
		data:{requestid:requestid,managerid:managerid,passwords:passwords,verficationcode:verficationcode},
		type: 'POST',
		success:function(data){
			console.log(data);
			if(data.returnCode == "0000"){
				alert(data.returnDesc);
			}else{
				alert(data.returnDesc);
			}
        }
	});
}

