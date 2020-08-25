function convertToJsonString()
{
	let name= document.getElementById("name").value;
	   let studentid=document.getElementById("studentid").value;
	   let studyMark1=document.getElementById("studymark1").value;
	   let studyMark2=document.getElementById("studymark2").value;
	   let studyMark3=document.getElementById("studymark3").value;
	   let sportsMark1=document.getElementById("sportsmark1").value;
	   let sportsMark2=document.getElementById("sportsmark2").value;
	    let student={name,studentid,studyMark1,studyMark2,studyMark3,sportsMark1,sportsMark2};
	  // document.write(student.name);
	    let studentJson=JSON.stringify(student);
	//    document.write(studentJson);
	  //  console.log(studentJson);

	   var xmlRequest=new XMLHttpRequest();
	   xmlRequest.open("POST","/createStudent");
	   xmlRequest.setRequestHeader("Content-Type", "application/json");
	   xmlRequest.send(studentJson);



	   function unloadEvt() {

	        document.location.href="/staffinfo.jsp";

	    } 
	   unloadEvt();  
	 /*  $.ajax({
	    type: "POST",
	    url: "/sampleJson",
	    dataType: "json",
	    data: studentJson ,
	    success: function () {
	       alert('Success');

	    },
	    error: function () {
	     alert('Error');
	    }
	}); */


	   
	}
function sample()
{
	document.write("executed!!");
	console.log("Working!!");
	
}