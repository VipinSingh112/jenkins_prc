<%@ include file="../init.jsp" %>
<script>
	function addNursingStaffDetail() {
		nursingStaffDetailVal = $("#nursingStaffDetailVal").val();

		nursingStaffName = $("#nursingStaffName").val();
		nursingStaffQualifications = $("#nursingStaffQualifications").val();
		nursingStaffCategory = $("#nursingStaffCategory").val();
		if (maternityPatientNum != "" || otherPatientNum != "") {
			$(".addNursingStaffDetailTableBox").removeClass("hide");
			$
					.ajax({
						type : "POST",
						url : "${addNursingStaffDetailInfoUrl}",
						data : {
							"<portlet:namespace/>nursingStaffDetailVal" : nursingStaffDetailVal,
						},
						async : false,
						success : function(data) {
							/* APPEND ROW JSP INTO TABLE */
							$(".addNursingStaffDetailTable").each(
									function(index) {
										if (index === 0) {
											$(this).append(data);
										} else {
											$cloneRow = $(data).clone();
											$cloneRow.find('td:last').remove()
													.end();
											$(this).append($cloneRow);
										}
									});
							/* APPEND DATA INTO TABLE */
							$(".nursingStaffName" + nursingStaffDetailVal)
									.append(nursingStaffName);
							$(
									".nursingStaffQualifications"
											+ nursingStaffDetailVal).append(
									nursingStaffQualifications);
							$(".nursingStaffCategory" + nursingStaffDetailVal)
									.append(nursingStaffCategory);

							/* VALUE INCREAMENT */
							nursingStaffData();
							nursingStaffDetailVal++;
							$("#nursingStaffDetailVal").val(
									nursingStaffDetailVal);

							/* RESET FORM FIELDS */
							$("#nursingStaffName").val("");
							$("#nursingStaffQualifications").val("");
							$("#nursingStaffCategory").val("");
						}
					});
		} else {
			$("#maternityPatientNum").focus();
		}
	}
	
	
	/* FORM FUNCTIONS */
	$("#applicantName").on('input', function(){
	    $(".user-name").html($(this).val());
	});

    /* prospecting licence */
	$("#approximatelyArea").on('input', function(){
	    $(".locArea").html($(this).val());
	});
	$("#location").on('input', function(){
	    $(".locBeacon").html($(this).val());
	});
	$("#coordinates").on('input', function(){
	    $(".co-ordinates").html($(this).val());
	});
	$("#northSide").on('input', function(){
	    $(".north").html($(this).val());
	});
	$("#eastSide").on('input', function(){
	    $(".eastOn").html($(this).val());
	});
	$("#north-side").on('input', function(){
	    $(".north1").html($(this).val());
	});
	$("#east-side").on('input', function(){
	    $(".eastApproximate").html($(this).val());
	});
	$("#location-grid").on('input', function(){
	    $(".locGridbe").html($(this).val());
	});
	$("#degrees").on('input', function(){
	    $(".bearingDegrees").html($(this).val());
	});
	$("#secondNorthSide").on('input', function(){
	    $(".northSecond").html($(this).val());
	});
	$("#secondEastSide").on('input', function(){
	    $(".eastSecond").html($(this).val());
	});
	$("#secondLocationGrid").on('input', function(){
	    $(".locationSecond").html($(this).val());
	});
	$("#secondDegrees").on('input', function(){
	    $(".degreesSec").html($(this).val());
	});
	$("#thirdCoordinates").on('input', function(){
	    $(".thirdCorner").html($(this).val());
	});
	$("#thirdNorthSide").on('input', function(){
	    $(".thirdNorth").html($(this).val());
	});
	$("#thirdEastSide").on('input', function(){
	    $(".thirdEastApp").html($(this).val());
	});
	$("#thirdDegrees").on('input', function(){
	    $(".degreesThird").html($(this).val());
	});
	$("#thirdGridLoc").on('input', function(){
	    $(".locationThird").html($(this).val());
	});
	$("#thirdGridL").on('input', function(){
	    $(".gridThird").html($(this).val());
	});
	$("#fourthCoordinates").on('input', function(){
	    $(".coordinatesFourth").html($(this).val());
	});
	$("#fourthNorthSide").on('input', function(){
	    $(".northFourth").html($(this).val());
	});
	$("#fourthEastSide").on('input', function(){
	    $(".eastFourth").html($(this).val());
	});
	$("#fourthDegrees").on('input', function(){
	    $(".approximateFourth").html($(this).val());
	});
	$("#fourthGridLoc").on('input', function(){
	    $(".gridFourth").html($(this).val());
	});
	$("#fourthGridL").on('input', function(){
	    $(".degreeFourth").html($(this).val());
	});
	$("#fifthCoordinates").on('input', function(){
	    $(".coordinatesFifth").html($(this).val());
	});
	$("#fifthNorthSide").on('input', function(){
	    $(".northFifth").html($(this).val());
	});
	$("#fifthEastSide").on('input', function(){
	    $(".eastFifth").html($(this).val());
	});
	$("#fifthDegrees").on('input', function(){
	    $(".gridBeFifth").html($(this).val());
	});
	$("#fifthGridLoc").on('input', function(){
	    $(".degreesFifth").html($(this).val());
	});
	$("#fifthGridL").on('input', function(){
	    $(".cornerFifth").html($(this).val());
	});
	
	/* lease data append */
	$("#leaseSquareKilo").on('input', function(){
	    $(".squareArea").html($(this).val());
	});
	$("#leaseLocation").on('input', function(){
	    $(".beaconLocation").html($(this).val());
	});
	$("#leaseCoordinates").on('input', function(){
	    $(".coordinatesLease").html($(this).val());
	});
	$("#leaseNorthSide").on('input', function(){
	    $(".northLease").html($(this).val());
	});
	$("#leaseEastSide").on('input', function(){
	    $(".eastLease").html($(this).val());
	});
	$("#firstNorthLease").on('input', function(){
	    $(".northLea").html($(this).val());
	});
	$("#firstEastLease").on('input', function(){
	    $(".approximateEast").html($(this).val());
	});
	$("#leaselocationGrid").on('input', function(){
	    $(".locationGridAn").html($(this).val());
	});
	$("#leaseDegrees").on('input', function(){
	    $(".leaseDegreesFirst").html($(this).val());
	});
	$("#secondNorthLease").on('input', function(){
	    $(".northSecondLease").html($(this).val());
	});
	$("#secondEastLease").on('input', function(){
	    $(".eastSecondLease").html($(this).val());
	});
	$("#secondLocationLease").on('input', function(){
	    $(".locationSecondLease").html($(this).val());
	});
	$("#secondDegreesLease").on('input', function(){
	    $(".degreesSecLease").html($(this).val());
	});
	$("#thirdCoordinatesLease").on('input', function(){
	    $(".thirdNorthLe").html($(this).val());
	});
	$("#thirdNorthLease").on('input', function(){
	    $(".thirdEastLe").html($(this).val());
	});
	$("#thirdEastLease").on('input', function(){
	    $(".thirdGridLe").html($(this).val());
	});
	$("#thirdDegreesLease").on('input', function(){
	    $(".degreesThirdLease").html($(this).val());
	});
	$("#thirdLocationLease").on('input', function(){
	    $(".locationThirdIs").html($(this).val());
	});
	$("#thirdGridLease").on('input', function(){
	    $(".ThirdDeLease").html($(this).val());
	});
	$("#fourthCoordinatesLease").on('input', function(){
	    $(".coordinatesFourthLe").html($(this).val());
	});
	$("#fourthNorthLease").on('input', function(){
	    $(".northFourthLea").html($(this).val());
	});
	$("#fourthEastLease").on('input', function(){
	    $(".eastFourthLea").html($(this).val());
	});
	$("#fourthDegreesLease").on('input', function(){
	    $(".approximateFourthLea").html($(this).val());
	});
	$("#fourthGridLease").on('input', function(){
	    $(".gridLocFourth").html($(this).val());
	});
	$("#fourthLocationLease").on('input', function(){
	    $(".degreeFourthLea").html($(this).val());
	});
	$("#fifthCoordinatesLease").on('input', function(){
	    $(".coordinatFifthAt").html($(this).val());
	});
	$("#fifthNorthLease").on('input', function(){
	    $(".northLeaseFifth").html($(this).val());
	});
	$("#fifthEastLease").on('input', function(){
	    $(".eastFifthCon").html($(this).val());
	});
	$("#fifthDegreesLease").on('input', function(){
	    $(".gridBearingFifth").html($(this).val());
	});
	$("#fifthGridLease").on('input', function(){
	    $(".degreesIsFifth").html($(this).val());
	});
	$("#fifthLocationLease").on('input', function(){
	    $(".cornerAppFifth").html($(this).val());
	});
	
/* 	prospecting licence renewal */
    $("#renApproximatelyArea").on('input', function(){
	    $(".locAreaRenewal").html($(this).val());
	});
    $("#renewalLocation").on('input', function(){
	    $(".locBeaconRenewal").html($(this).val());
	});
    $("#renewalCoordinates").on('input', function(){
	    $(".coordinatesRenewal").html($(this).val());
	});
    $("#renewalNorthSide").on('input', function(){
	    $(".northRenewal").html($(this).val());
	});
    $("#renewalEastSide").on('input', function(){
	    $(".eastOnRenewal").html($(this).val());
	});
    $("#renewalFirstNorth").on('input', function(){
	    $(".northAreaRenewal").html($(this).val());
	});
    $("#renewalFirstEast").on('input', function(){
	    $(".renewalEastApp").html($(this).val());
	});
    $("#renewalFirstLocation").on('input', function(){
	    $(".locGridRenewal").html($(this).val());
	});
    $("#renewalFirstDegrees").on('input', function(){
	    $(".beDegreesRenewal").html($(this).val());
	});
    $("#renewalSecondNorth").on('input', function(){
	    $(".northSecRenewal").html($(this).val());
	});
    $("#renewalSecondEast").on('input', function(){
	    $(".eastSecRenewal").html($(this).val());
	});
	$("#renewalSecondLocation").on('input', function(){
	    $(".locationSecRenewal").html($(this).val());
	});
	$("#renewalSecondDegrees").on('input', function(){
	    $(".degreesSecRenewal").html($(this).val());
	});
	$("#renewalThirdCoordinates").on('input', function(){
	    $(".thirdCornerRenewal").html($(this).val());
	});
	$("#renewalThirdNorth").on('input', function(){
	    $(".thirdNorthRenewal").html($(this).val());
	});
	$("#renewalThirdEast").on('input', function(){
	    $(".thirdEastAppRenewal").html($(this).val());
	});
	$("#renewalThirdDegrees").on('input', function(){
	    $(".degreesThirdRenewal").html($(this).val());
	});
	$("#renewalThirdGridLoc").on('input', function(){
	    $(".locationThirdRenewal").html($(this).val());
	});
	$("#renewalThirdBearing").on('input', function(){
	    $(".gridThirdRenewal").html($(this).val());
	});
	
	/* signature */
	$(document).on('change', '#applicantSignatureBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#applicantSignatureImageHolder");
	    var form1a_image_holder = $("#applicantSignatureImageHolderPre");
	    image_holder.empty();
	    form1a_image_holder.empty();
	    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
	      if (typeof(FileReader) != "undefined") {
	        //loop for each file selected for uploaded.
	        for (var i = 0; i < countFiles; i++) 
	        {
	          var reader = new FileReader();
	          reader.onload = function(e) {
	            $("<img />", {
	              "src": e.target.result,
	              "class": "thumb-image",
	              "height":"100",
	              "width":"100"
	            }).appendTo(image_holder);
	            $("<img />", {
	                "src": e.target.result,
	                "class": "thumb-image",
	                "height":"100",
	                "width":"100"
	              })
	              .appendTo(form1a_image_holder);
	          }
	          image_holder.show();
	          reader.readAsDataURL($(this)[0].files[i]);
	        }
	      } else {
	        alert("This browser does not support FileReader.");
	      }
	    } else {
	      alert("Pls select only images");
	    }
	  });
   
    /* Licence sign */
    $(document).on('change', '#applicantSignatureMiningBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#applicantSignatureMiningImageHolder");
	    var form1a_image_holder = $("#applicantSignatureImageLicencePre");
	    image_holder.empty();
	   form1a_image_holder.empty();
	    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
	      if (typeof(FileReader) != "undefined") {
	        //loop for each file selected for uploaded.
	        for (var i = 0; i < countFiles; i++) 
	        {
	          var reader = new FileReader();
	          reader.onload = function(e) {
	            $("<img />", {
	              "src": e.target.result,
	              "class": "thumb-image",
	              "height":"100",
	              "width":"100"
	            }).appendTo(image_holder);
	            $("<img />", {
	                "src": e.target.result,
	                "class": "thumb-image",
	                "height":"100",
	                "width":"100"
	              })
	              .appendTo(form1a_image_holder);
	          }
	          image_holder.show();
	          reader.readAsDataURL($(this)[0].files[i]);
	        }
	      } else {
	        alert("This browser does not support FileReader.");
	      }
	    } else {
	      alert("Pls select only images");
	    }
	  });

   /* lease Sign */
   $(document).on('change', '#applicantSignatureLeaseBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#applicantSignatureLeaseImgHolder");
	    var form1a_image_holder = $("#applicantSignatureImageLeasePre");
	    image_holder.empty();
	    form1a_image_holder.empty();
	    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
	      if (typeof(FileReader) != "undefined") {
	        //loop for each file selected for uploaded.
	        for (var i = 0; i < countFiles; i++) 
	        {
	          var reader = new FileReader();
	          reader.onload = function(e) {
	            $("<img />", {
	              "src": e.target.result,
	              "class": "thumb-image",
	              "height":"100",
	              "width":"100"
	            }).appendTo(image_holder);
	            $("<img />", {
	                "src": e.target.result,
	                "class": "thumb-image",
	                "height":"100",
	                "width":"100"
	              })
	              .appendTo(form1a_image_holder);
	          }
	          image_holder.show();
	          reader.readAsDataURL($(this)[0].files[i]);
	        }
	      } else {
	        alert("This browser does not support FileReader.");
	      }
	    } else {
	      alert("Pls select only images");
	    }
	  });
   /* renewal-licence sign */
   $(document).on('change', '#applicantSignatureRenewalBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#applicantSignatureRenewalImageHolder");
	    var form1a_image_holder = $("#applicantSignatureImageRenewalPre");
	    image_holder.empty();
	    form1a_image_holder.empty();
	    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
	      if (typeof(FileReader) != "undefined") {
	        //loop for each file selected for uploaded.
	        for (var i = 0; i < countFiles; i++) 
	        {
	          var reader = new FileReader();
	          reader.onload = function(e) {
	            $("<img />", {
	              "src": e.target.result,
	              "class": "thumb-image",
	              "height":"100",
	              "width":"100"
	            }).appendTo(image_holder);
	            $("<img />", {
	                "src": e.target.result,
	                "class": "thumb-image",
	                "height":"100",
	                "width":"100"
	              })
	              .appendTo(form1a_image_holder);
	          }
	          image_holder.show();
	          reader.readAsDataURL($(this)[0].files[i]);
	        }
	      } else {
	        alert("This browser does not support FileReader.");
	      }
	    } else {
	      alert("Pls select only images");
	    }
	  });
   
    /* renewal-lease sign */
    $(document).on('change', '#applicantSignatureRenewalLeaseBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#applicantSignatureRenewalLeaseImageHolder");
	    var form1a_image_holder = $("#applicantSignatureImageRenewalLeasePre");
	    image_holder.empty();
	    form1a_image_holder.empty();
	    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
	      if (typeof(FileReader) != "undefined") {
	        //loop for each file selected for uploaded.
	        for (var i = 0; i < countFiles; i++) 
	        {
	          var reader = new FileReader();
	          reader.onload = function(e) {
	            $("<img />", {
	              "src": e.target.result,
	              "class": "thumb-image",
	              "height":"100",
	              "width":"100"
	            }).appendTo(image_holder);
	            $("<img />", {
	                "src": e.target.result,
	                "class": "thumb-image",
	                "height":"100",
	                "width":"100"
	              })
	              .appendTo(form1a_image_holder);
	          }
	          image_holder.show();
	          reader.readAsDataURL($(this)[0].files[i]);
	        }
	      } else {
	        alert("This browser does not support FileReader.");
	      }
	    } else {
	      alert("Pls select only images");
	    }
	  });
    
    /* transfer sign */
    $(document).on('change', '#applicantSignaturetransferBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#applicantSignaturetransferImageHolder");
	    var form1a_image_holder = $("#applicantSignatureImagetransferPre");
	    image_holder.empty();
	    form1a_image_holder.empty();
	    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
	      if (typeof(FileReader) != "undefined") {
	        //loop for each file selected for uploaded.
	        for (var i = 0; i < countFiles; i++) 
	        {
	          var reader = new FileReader();
	          reader.onload = function(e) {
	            $("<img />", {
	              "src": e.target.result,
	              "class": "thumb-image",
	              "height":"100",
	              "width":"100"
	            }).appendTo(image_holder);
	            $("<img />", {
	                "src": e.target.result,
	                "class": "thumb-image",
	                "height":"100",
	                "width":"100"
	              })
	              .appendTo(form1a_image_holder);
	          }
	          image_holder.show();
	          reader.readAsDataURL($(this)[0].files[i]);
	        }
	      } else {
	        alert("This browser does not support FileReader.");
	      }
	    } else {
	      alert("Pls select only images");
	    }
	  });
    
    $(document).on('change', '#applicantSignaturetransferCoBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#applicantSignaturetransferCoImageHolder");
	    var form1a_image_holder = $("#applicantSignatureImagetransferCoPre");
	    image_holder.empty();
	    form1a_image_holder.empty();
	    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
	      if (typeof(FileReader) != "undefined") {
	        //loop for each file selected for uploaded.
	        for (var i = 0; i < countFiles; i++) 
	        {
	          var reader = new FileReader();
	          reader.onload = function(e) {
	            $("<img />", {
	              "src": e.target.result,
	              "class": "thumb-image",
	              "height":"100",
	              "width":"100"
	            }).appendTo(image_holder);
	            $("<img />", {
	                "src": e.target.result,
	                "class": "thumb-image",
	                "height":"100",
	                "width":"100"
	              })
	              .appendTo(form1a_image_holder);
	          }
	          image_holder.show();
	          reader.readAsDataURL($(this)[0].files[i]);
	        }
	      } else {
	        alert("This browser does not support FileReader.");
	      }
	    } else {
	      alert("Pls select only images");
	    }
	  });
    
    $(document).on('change', '#applicantSignatureMiningMinisterBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#applicantSignatureImgtransferMinister");
	    var form1a_image_holder = $("#applicantSignatureImgtransferMinisterPre");
	    image_holder.empty();
	    form1a_image_holder.empty();
	    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
	      if (typeof(FileReader) != "undefined") {
	        //loop for each file selected for uploaded.
	        for (var i = 0; i < countFiles; i++) 
	        {
	          var reader = new FileReader();
	          reader.onload = function(e) {
	            $("<img />", {
	              "src": e.target.result,
	              "class": "thumb-image",
	              "height":"100",
	              "width":"100"
	            }).appendTo(image_holder);
	            $("<img />", {
	                "src": e.target.result,
	                "class": "thumb-image",
	                "height":"100",
	                "width":"100"
	              })
	              .appendTo(form1a_image_holder);
	          }
	          image_holder.show();
	          reader.readAsDataURL($(this)[0].files[i]);
	        }
	      } else {
	        alert("This browser does not support FileReader.");
	      }
	    } else {
	      alert("Pls select only images");
	    }
	  });
    
    $(document).on('change', '#holderSignaturesurrenderBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#holderSignaturesurrenderImgHolder");
	    var form1a_image_holder = $("#holderSignatureImageSurrenderPre");
	    image_holder.empty();
	    form1a_image_holder.empty();
	    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
	      if (typeof(FileReader) != "undefined") {
	        //loop for each file selected for uploaded.
	        for (var i = 0; i < countFiles; i++) 
	        {
	          var reader = new FileReader();
	          reader.onload = function(e) {
	            $("<img />", {
	              "src": e.target.result,
	              "class": "thumb-image",
	              "height":"100",
	              "width":"100"
	            }).appendTo(image_holder);
	            $("<img />", {
	                "src": e.target.result,
	                "class": "thumb-image",
	                "height":"100",
	                "width":"100"
	              })
	              .appendTo(form1a_image_holder);
	          }
	          image_holder.show();
	          reader.readAsDataURL($(this)[0].files[i]);
	        }
	      } else {
	        alert("This browser does not support FileReader.");
	      }
	    } else {
	      alert("Pls select only images");
	    }
	  });
    
    $(document).on('change', '#ministerSignaturesurrenderBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#ministerSignaturesurrenderImgHolder");
	    var form1a_image_holder = $("#ministerSignatureImageSurrenderCoPre");
	    image_holder.empty();
	    form1a_image_holder.empty();
	    if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
	      if (typeof(FileReader) != "undefined") {
	        //loop for each file selected for uploaded.
	        for (var i = 0; i < countFiles; i++) 
	        {
	          var reader = new FileReader();
	          reader.onload = function(e) {
	            $("<img />", {
	              "src": e.target.result,
	              "class": "thumb-image",
	              "height":"100",
	              "width":"100"
	            }).appendTo(image_holder);
	            $("<img />", {
	                "src": e.target.result,
	                "class": "thumb-image",
	                "height":"100",
	                "width":"100"
	              })
	              .appendTo(form1a_image_holder);
	          }
	          image_holder.show();
	          reader.readAsDataURL($(this)[0].files[i]);
	        }
	      } else {
	        alert("This browser does not support FileReader.");
	      }
	    } else {
	      alert("Pls select only images");
	    }
	  });

	/* NEXT FORM JS */
	function applicantInfo(){
		nextForm();
		pendingMiningApplication();
	}
	function nextForm(){
		var $active = $('.nav-tabs li>.active');
		$active.parent().next().find('.nav-link').removeClass('disabled');
		$active.parent().next().find('.nav-link span').removeClass('gray');
		nextTab($active);
		const formSections = document.getElementsByClassName('form-wizard');
	    for (const formSection of formSections) {
		 	formSection.scrollIntoView({ behavior: 'smooth', block: 'start' });
		 }
	}
	function nextTab(elem) {
		$(elem).parent().next()
				.find('a[data-toggle="tab"]').click();
	}
	
	<!-- Separate Value on Enter -->
	$(document).ready(function () {
		$('input[name="applicantTelephone"],input[name="applicantTelephoneLicence"]').tagsinput({
			trimValue: true,
			confirmKeys: [13],
			focusClass: 'my-focus-class'
		});
		
		$('.bootstrap-tagsinput input').on('focus', function() {
			$(this).closest('.bootstrap-tagsinput').addClass('has-focus');
		}).on('blur', function() {
			$(this).closest('.bootstrap-tagsinput').removeClass('has-focus');
		});
	});
	
	
	/* ADD MORE FORMS JS */
	 
	 function addDirectorDetail(){
		 directorDetailVal = $("#directorDetailVal").val();
		 
		 companyDirectorName = $("#companyDirectorName").val();
		 companyDirectorNationality = $("#companyDirectorNationality").val();
		 companyDirectorPartnership = $("#companyDirectorPartnership").val();

		 if(companyDirectorName != "" || companyDirectorNationality !="" || companyDirectorPartnership !=""){
			$(".addDirectorDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addDirectorDetailInfoUrl}",
				data : {
					"<portlet:namespace/>directorDetailVal" : directorDetailVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".adddirectorDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */					
					$(".companyDirectorName" + directorDetailVal).append(companyDirectorName);
					$(".companyDirectorNationality" + directorDetailVal).append(companyDirectorNationality);
					$(".companyDirectorPartnership" + directorDetailVal).append(companyDirectorPartnership);
					licenceDirectorInfo("","");
					/* VALUE INCREAMENT */
					/* exclusiveLicenseDirectorsDetailInfo(); */
					directorDetailVal++;
					$("#directorDetailVal").val(directorDetailVal);
					
					/* RESET FORM FIELDS */
					$("#companyDirectorName").val("");
					$("#companyDirectorNationality").val("");
					$("#companyDirectorPartnership").val("");
				}
			});
		}else{
			$("#companyDirectorName").focus();
		}
	}
	/* Mining Director Detail */
	 function addMiningDirectorDetail(){
		 miningDirectorDetailVal = $("#miningDirectorDetailVal").val();
		 
		 miningCompanyDirectorName = $("#miningCompanyDirectorName").val();
		 miningCompanyDirectorNationality = $("#miningCompanyDirectorNationality").val();
		 miningCompanyDirectorPartnership = $("#miningCompanyDirectorPartnership").val();

		 if(miningCompanyDirectorName != "" || miningCompanyDirectorNationality !="" || miningCompanyDirectorPartnership !=""){
			$(".addMiningDirectorDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addMiningDirectorDetailInfoUrl}",
				data : {
					"<portlet:namespace/>miningDirectorDetailVal" : miningDirectorDetailVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addMiningDirectorDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */					
					$(".miningCompanyDirectorName" + miningDirectorDetailVal).append(miningCompanyDirectorName);
					$(".miningCompanyDirectorNationality" + miningDirectorDetailVal).append(miningCompanyDirectorNationality);
					$(".miningCompanyDirectorPartnership" + miningDirectorDetailVal).append(miningCompanyDirectorPartnership);
					miningDirectorInfo("");
					/* VALUE INCREAMENT */
					/* leaseDirectorDetailsInfo(); */
					miningDirectorDetailVal++;
					$("#miningDirectorDetailVal").val(miningDirectorDetailVal);
					
					/* RESET FORM FIELDS */
					$("#miningCompanyDirectorName").val("");
					$("#miningCompanyDirectorNationality").val("");
					$("#miningCompanyDirectorPartnership").val("");
				}
			});
		}else{
			$("#miningCompanyDirectorName").focus();
		}
	}
	 /* Transfer Director Detail */
	 function addTransferDirectorDetail(){
		 transferDirectorDetailVal = $("#transferDirectorDetailVal").val();
		 
		 transferCompanyDirectorName = $("#transferCompanyDirectorName").val();
		 transferCompanyDirectorNationality = $("#transferCompanyDirectorNationality").val();
		 transferCompanyDirectorPartnership = $("#transferCompanyDirectorPartnership").val();

		 if(transferCompanyDirectorName != "" || transferCompanyDirectorNationality !="" || transferCompanyDirectorPartnership !=""){
			$(".addTransferDirectorDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addTransferDirectorDetailInfoUrl}",
				data : {
					"<portlet:namespace/>transferDirectorDetailVal" : transferDirectorDetailVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addTransferDirectorDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */					
					$(".transferCompanyDirectorName" + transferDirectorDetailVal).append(transferCompanyDirectorName);
					$(".transferCompanyDirectorNationality" + transferDirectorDetailVal).append(transferCompanyDirectorNationality);
					$(".transferCompanyDirectorPartnership" + transferDirectorDetailVal).append(transferCompanyDirectorPartnership);
					transferDirectorInfo("");
					
					/* VALUE INCREAMENT */
					/* addLicDirectorDetailTransferFormNine(); */
					transferDirectorDetailVal++;
					$("#transferDirectorDetailVal").val(transferDirectorDetailVal);
					
					/* RESET FORM FIELDS */
					$("#transferCompanyDirectorName").val("");
					$("#transferCompanyDirectorNationality").val("");
					$("#transferCompanyDirectorPartnership").val("");
				}
			});
		}else{
			$("#transferCompanyDirectorName").focus();
		}
	}
	 /* resource function for delete */
	 function licenceDirectorInfo(counter,deleteKey){
			if(counter!=''&&deleteKey==''){
		    directorDetailVal=counter;
			directorDetailId = $("#directorDetailId"+counter).val();
			companyDirectorName = $("#editCompanyDirectorName"+counter).val();
			companyDirectorNationality = $("#editCompanyDirectorNationality"+counter).val();
			companyDirectorPartnership = $("#editCompanyDirectorPartnership"+counter).val();
			}else{
			directorDetailVal = $("#directorDetailVal").val();
			companyDirectorName = $("#companyDirectorName").val();
			companyDirectorNationality = $("#companyDirectorNationality").val();
			companyDirectorPartnership = $("#companyDirectorPartnership").val();
			directorDetailId = $("#directorDetailId").val();
			}
			miningLeaseApplicationId = $("#miningLeaseApplicationId").val();
			directorDetailId = $("#directorDetailId"+counter).val();
			  $.ajax({
					type: "POST",
					url: "${licDirectorDetailAddForm}", 
					data: {
						"<portlet:namespace/>companyDirectorName": companyDirectorName,
						"<portlet:namespace/>companyDirectorNationality": companyDirectorNationality,
						"<portlet:namespace/>companyDirectorPartnership": companyDirectorPartnership,
						"<portlet:namespace/>miningLeaseApplicationId": miningLeaseApplicationId,
						"<portlet:namespace/>directorDetailId": directorDetailId,
						"<portlet:namespace/>counter": directorDetailVal,
						"<portlet:namespace/>deleteKey": deleteKey,
					},
					success: function (data) {
						var result=data.APP_DATA;
						var counter=result["counter"];
						$("#directorDetailId"+counter).val(result["directorDetailId"]);
					},
					error: function (data) {
					}
				});
			}
	 
	 function miningDirectorInfo(leaseCounter){
			if(leaseCounter!=""){
				miningDirectorDetailId = $("#miningDirectorDetailId"+leaseCounter).val();
				miningCompanyDirectorName = $("#editMiningCompanyDirectorName"+leaseCounter).val();
				miningCompanyDirectorNationality = $("#editMiningCompanyDirectorNationality"+leaseCounter).val();
				miningCompanyDirectorPartnership = $("#editMiningCompanyDirectorPartnership"+leaseCounter).val();
			}else{
			leaseCounterDirector = $("#miningDirectorDetailVal").val();
			miningCompanyDirectorName = $("#miningCompanyDirectorName").val();
			miningCompanyDirectorNationality = $("#miningCompanyDirectorNationality").val();
			miningCompanyDirectorPartnership = $("#miningCompanyDirectorPartnership").val();
			miningDirectorDetailId = $("#miningDirectorDetailId").val();
			}
			miningLeaseApplicationId = $("#miningLeaseApplicationId").val();
			leaseCounterDirector = $("#miningDirectorDetailVal").val();
			  $.ajax({
					type: "POST",
					url: "${leaseDirectorDetailAddForm}", 
					data: {
						"<portlet:namespace/>miningCompanyDirectorName": miningCompanyDirectorName,
						"<portlet:namespace/>miningCompanyDirectorNationality": miningCompanyDirectorNationality,
						"<portlet:namespace/>miningCompanyDirectorPartnership": miningCompanyDirectorPartnership,
						"<portlet:namespace/>miningLeaseApplicationId": miningLeaseApplicationId,
						"<portlet:namespace/>miningDirectorDetailId": miningDirectorDetailId,
						"<portlet:namespace/>leaseCounterDirector": leaseCounterDirector,
					},
					success: function (data) {
						var result=data.APP_DATA;
						var counter=result["leaseCounter"];
						$("#miningDirectorDetailId"+counter).val(result["miningDirectorId"]);
					},
					error: function (data) {
					}
				});
			}
	 
	 function transferDirectorInfo(transferCounter){
			if(transferCounter!=""){
				transferDirectorDetailId = $("#transferDirectorDetailId"+transferCounter).val();
				transferCompanyDirectorName = $("#editTransferCompanyDirectorName"+transferCounter).val();
				transferCompanyDirectorNationality = $("#editTransferCompanyDirectorNationality"+transferCounter).val();
				transferCompanyDirectorPartnership = $("#editTransferCompanyDirectorPartnership"+transferCounter).val();
			}else{
			transferCounterDirector = $("#transferDirectorDetailVal").val();
			transferCompanyDirectorName = $("#transferCompanyDirectorName").val();
			transferCompanyDirectorNationality = $("#transferCompanyDirectorNationality").val();
			transferCompanyDirectorPartnership = $("#transferCompanyDirectorPartnership").val();
			transferDirectorDetailId = $("#transferDirectorDetailId").val();
			}
			miningLeaseApplicationId = $("#miningLeaseApplicationId").val();
			transferCounterDirector = $("#transferDirectorDetailVal").val();
			  $.ajax({
					type: "POST",
					url: "${transferDirectorDetailAddForm}", 
					data: {
						"<portlet:namespace/>transferCompanyDirectorName": transferCompanyDirectorName,
						"<portlet:namespace/>transferCompanyDirectorNationality": transferCompanyDirectorNationality,
						"<portlet:namespace/>transferCompanyDirectorPartnership": transferCompanyDirectorPartnership,
						"<portlet:namespace/>miningLeaseApplicationId": miningLeaseApplicationId,
						"<portlet:namespace/>transferDirectorDetailId": transferDirectorDetailId,
						"<portlet:namespace/>transferCounterDirector": transferCounterDirector,
					},
					success: function (data) {
						var result=data.APP_DATA;
						var transferCounter=result["transferCounter"];
						$("#transferDirectorDetailId"+transferCounter).val(result["transferDirectorDetailId"]);
					},
					error: function (data) {
					}
				});
			}
	 
	 /*--- DIRECTOR DETAILS EDIT n DELETE TAB ---*/
	 function directorDetailEdit(directorDetailVal) {
		$(".editLicenceDirectorDetailEditTabPopup").modal("show");
		$(".editCompanyDirectorName").attr("id","editCompanyDirectorName" + directorDetailVal);
		$(".editCompanyDirectorNationality").attr("id","editCompanyDirectorNationality" + directorDetailVal);
		$(".editCompanyDirectorPartnership").attr("id","editCompanyDirectorPartnership" + directorDetailVal);

		companyDirectorName = $(".companyDirectorName" + directorDetailVal + ":first").text().trim();
		companyDirectorNationality = $(".companyDirectorNationality" + directorDetailVal+ ":first").text().trim();
		companyDirectorPartnership = $(".companyDirectorPartnership" + directorDetailVal + ":first").text().trim();

		$("#editCompanyDirectorName" + directorDetailVal).val(companyDirectorName);
		$("#editCompanyDirectorNationality" + directorDetailVal).val(companyDirectorNationality);
		$("#editCompanyDirectorPartnership" + directorDetailVal).val(companyDirectorPartnership);

		$(".saveEditLicenceDirectorDetailPopupDataBtn").attr("onclick","directorEditData(" + directorDetailVal + ")");
	}
	function directorEditData(directorDetailVal) {
		licenceDirectorInfo(directorDetailVal,'');
		$(".companyDirectorName" + directorDetailVal).html($("#editCompanyDirectorName" + directorDetailVal).val());
		$(".companyDirectorNationality" + directorDetailVal).html($("#editCompanyDirectorNationality" + directorDetailVal).val());
		$(".companyDirectorPartnership" + directorDetailVal).html($("#editCompanyDirectorPartnership" + directorDetailVal).val());

		$(".editCompanyDirectorName").val("");
		$(".editCompanyDirectorNationality").val("");
		$(".editCompanyDirectorPartnership").val("");

	}
	function directorDetailDeleteData(directorDetailVal) {
		licenceDirectorInfo(directorDetailVal,'deleteApplicant');
		  var directorDetailCounter = $("#directorDetailVal").val();
		  $("#directorDetailVal").val(directorDetailCounter - 1);
		  var delRowElement = $(".director-detail-prospecting-row" + directorDetailVal); 
		  delRowElement.remove();
		  var j = parseInt(directorDetailVal) + 1;
		  // Update the row numbers and IDs for each row
		  for (var i = j; i <= directorDetailCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".director-detail-prospecting-row" + i);
		    // Update the IDs for relevant elementsd
		    rowElement.attr("class", "director-detail-prospecting-row" + prevCounter);
		    rowElement.find("td.companyDirectorName"+i).removeClass("companyDirectorName"+i).addClass("companyDirectorName"+prevCounter);
		    rowElement.find("td.companyDirectorNationality"+i).removeClass("companyDirectorNationality"+i).addClass("companyDirectorNationality"+prevCounter);
		    rowElement.find("td.companyDirectorPartnership"+i).removeClass("companyDirectorPartnership"+i).addClass("companyDirectorPartnership"+prevCounter);
		    rowElement.find("#directorDetailEdit").attr('onclick', 'directorDetailEdit(' +prevCounter+ ')');
		    rowElement.find("#directorDetailDeleteData").attr('onclick', 'directorDetailDeleteData(' +prevCounter+ ')');
		  }
	}
	/* transfer */
	function transferDirectorDetailEditTab(transferDirectorDetailVal) {
		$(".editTransferDirectorDetailEditTabPopup").modal("show");
		$(".editTransferCompanyDirectorName").attr("id","editTransferCompanyDirectorName" + transferDirectorDetailVal);
		$(".editTransferCompanyDirectorNationality").attr("id","editTransferCompanyDirectorNationality" + transferDirectorDetailVal);
		$(".editTransferCompanyDirectorPartnership").attr("id","editTransferCompanyDirectorPartnership" + transferDirectorDetailVal);

		transferCompanyDirectorName = $(".transferCompanyDirectorName" + transferDirectorDetailVal + ":first").text().trim();
		transferCompanyDirectorNationality = $(".transferCompanyDirectorNationality" + transferDirectorDetailVal+ ":first").text().trim();
		transferCompanyDirectorPartnership = $(".transferCompanyDirectorPartnership" + transferDirectorDetailVal + ":first").text().trim();

		$("#editTransferCompanyDirectorName" + transferDirectorDetailVal).val(transferCompanyDirectorName);
		$("#editTransferCompanyDirectorNationality" + transferDirectorDetailVal).val(transferCompanyDirectorNationality);
		$("#editTransferCompanyDirectorPartnership" + transferDirectorDetailVal).val(transferCompanyDirectorPartnership);

		$(".saveEditTransferDirectorDetailPopupDataBtn").attr("onclick","transferDirectorEditData(" + transferDirectorDetailVal + ")");
	}
	function transferDirectorEditData(transferDirectorDetailVal) {
		transferDirectorInfo(transferDirectorDetailVal);
		$(".transferCompanyDirectorName" + transferDirectorDetailVal).html($("#editTransferCompanyDirectorName" + transferDirectorDetailVal).val());
		$(".transferCompanyDirectorNationality" + transferDirectorDetailVal).html($("#editTransferCompanyDirectorNationality" + transferDirectorDetailVal).val());
		$(".transferCompanyDirectorPartnership" + transferDirectorDetailVal).html($("#editTransferCompanyDirectorPartnership" + transferDirectorDetailVal).val());

		$(".editTransferCompanyDirectorName").val("");
		$(".editTransferCompanyDirectorNationality").val("");
		$(".editTransferCompanyDirectorPartnership").val("");

	}
	function transferDirectorDetailDeleteData(transferDirectorDetailValData) {
		  var transferDirectorDetailCounter = $("#transferDirectorDetailVal").val();
		  $("#transferDirectorDetailVal").val(transferDirectorDetailCounter - 1);
		  var delRowElement = $(".director-detail-row" + transferDirectorDetailValData); 
		  delRowElement.remove();
		  var j = parseInt(transferDirectorDetailValData) + 1;
		  // Update the row numbers and IDs for each row
		  for (var i = j; i <= transferDirectorDetailCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".director-detail-row" + i);
		    // Update the IDs for relevant elementsd
		    rowElement.attr("class", "director-detail-row" + prevCounter);
		    rowElement.find("td.transferCompanyDirectorName"+i).removeClass("transferCompanyDirectorName"+i).addClass("transferCompanyDirectorName"+prevCounter);
		    rowElement.find("td.transferCompanyDirectorNationality"+i).removeClass("transferCompanyDirectorNationality"+i).addClass("transferCompanyDirectorNationality"+prevCounter);
		    rowElement.find("td.transferCompanyDirectorPartnership"+i).removeClass("transferCompanyDirectorPartnership"+i).addClass("transferCompanyDirectorPartnership"+prevCounter);
		    rowElement.find("#transferDirectorDetailDeleteData").attr('onclick', 'transferDirectorDetailDeleteData(' +prevCounter+ ')');
		    rowElement.find("#directorDetailEditTab").attr('onclick', 'transferDirectorDetailEditTab(' +prevCounter+ ')');
		  }
	}
	 /* MINING */
	 function miningDirectorDetailEditTab(miningDirectorDetailVal) {
		$(".editMiningDirectorDetailEditTabPopup").modal("show");
		$(".editMiningCompanyDirectorName").attr("id","editMiningCompanyDirectorName" + miningDirectorDetailVal);
		$(".editMiningCompanyDirectorNationality").attr("id","editMiningCompanyDirectorNationality" + miningDirectorDetailVal);
		$(".editMiningCompanyDirectorPartnership").attr("id","editMiningCompanyDirectorPartnership" + miningDirectorDetailVal);

		miningCompanyDirectorName = $(".miningCompanyDirectorName" + miningDirectorDetailVal + ":first").text().trim();
		miningCompanyDirectorNationality = $(".miningCompanyDirectorNationality" + miningDirectorDetailVal+ ":first").text().trim();
		miningCompanyDirectorPartnership = $(".miningCompanyDirectorPartnership" + miningDirectorDetailVal + ":first").text().trim();

		$("#editMiningCompanyDirectorName" + miningDirectorDetailVal).val(miningCompanyDirectorName);
		$("#editMiningCompanyDirectorNationality" + miningDirectorDetailVal).val(miningCompanyDirectorNationality);
		$("#editMiningCompanyDirectorPartnership" + miningDirectorDetailVal).val(miningCompanyDirectorPartnership);

		$(".saveEditTransferDirectorDetailPopupDataBtn").attr("onclick","miningDirectorEditData(" + miningDirectorDetailVal + ")");
	}
	function miningDirectorEditData(miningDirectorDetailVal) {
		miningDirectorInfo(miningDirectorDetailVal);
		$(".miningCompanyDirectorName" + miningDirectorDetailVal).html($("#editMiningCompanyDirectorName" + miningDirectorDetailVal).val());
		$(".miningCompanyDirectorNationality" + miningDirectorDetailVal).html($("#editMiningCompanyDirectorNationality" + miningDirectorDetailVal).val());
		$(".miningCompanyDirectorPartnership" + miningDirectorDetailVal).html($("#editMiningCompanyDirectorPartnership" + miningDirectorDetailVal).val());

		$(".editMiningCompanyDirectorName").val("");
		$(".editMiningCompanyDirectorNationality").val("");
		$(".editMiningCompanyDirectorPartnership").val("");

	}
	function miningDirectorDetailDeleteData(miningDirectorDetailVal) {
		  var miningDirectorDetailCounter = $("#miningDirectorDetailVal").val();
		  $("#miningDirectorDetailVal").val(miningDirectorDetailCounter - 1);
		  var delRowElement = $(".mining-director-detail-row" + miningDirectorDetailVal); 
		  delRowElement.remove();
		  var j = parseInt(miningDirectorDetailVal) + 1;
		  // Update the row numbers and IDs for each row
		  for (var i = j; i <= miningDirectorDetailCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".mining-director-detail-row" + i);
		    // Update the IDs for relevant elementsd
		    rowElement.attr("class", "mining-director-detail-row" + prevCounter);
		    rowElement.find("td.miningCompanyDirectorName"+i).removeClass("miningCompanyDirectorName"+i).addClass("miningCompanyDirectorName"+prevCounter);
		    rowElement.find("td.miningCompanyDirectorNationality"+i).removeClass("miningCompanyDirectorNationality"+i).addClass("miningCompanyDirectorNationality"+prevCounter);
		    rowElement.find("td.miningCompanyDirectorPartnership"+i).removeClass("miningCompanyDirectorPartnership"+i).addClass("miningCompanyDirectorPartnership"+prevCounter);
		    rowElement.find("#miningDirectorDetailDeleteData").attr('onclick', 'miningDirectorDetailDeleteData(' +prevCounter+ ')');
		    rowElement.find("#miningDirectorDetailEditTab").attr('onclick', 'miningDirectorDetailEditTab(' +prevCounter+ ')');
		  }
	}
	
	function deleteTransferDirectorDetailData(transferDirectorDetailValData){
		transferDirectorDetailId=$("#transferDirectorDetailId"+transferDirectorDetailValData);
		 $.ajax({
				type: "POST",
				url: "${deleteTransferDirectorDetailAddForm}", 
				data: {
					"<portlet:namespace/>transferDirectorDetailId": transferDirectorDetailId,
				},
				success: function (data) {
				},
				error: function (data) {
				}
			});
		}
	function deleteLeaseDirectorDetailData(miningDirectorDetailValData){
		/* primary key */
		miningDirectorDetailId=$("#miningDirectorDetailId"+miningDirectorDetailValData);
		 $.ajax({
				type: "POST",
				url: "${deleteLeaseDirectorDetailAddForm}", 
				data: {
					"<portlet:namespace/>miningDirectorDetailId": miningDirectorDetailId,
				},
				success: function (data) {
				},
				error: function (data) {
				}
			});
		}
</script>