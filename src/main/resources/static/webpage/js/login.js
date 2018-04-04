function login(){
	
	//var username = $("#username").val();
	//var password = $("#password").val();

	var username = "derek";
	var password = "helloworld";
	var requestid = "7a329632-36f1-11e8-b467-0ed5f89f718b";
	var messageid = "0x8001";
	var verficationcode = "hellocode";
	
	
	$.ajax({
		url: "/login",
		data:{messageid:messageid,requestid:requestid,username:username,password:password,verficationcode:verficationcode},
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
