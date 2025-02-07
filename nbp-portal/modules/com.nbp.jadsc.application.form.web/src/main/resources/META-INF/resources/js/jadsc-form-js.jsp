<%@ include file="/init.jsp" %>
<portlet:resourceURL id="doc/served/address" var="addDocServedAddressUrl"/>
<portlet:resourceURL id="deleteServiceApplicant" var="deleteServiceApplicant"/>
<portlet:resourceURL id="checklist/item" var="addchecklistUrl"/>
<portlet:resourceURL id="/add/Checklist/Detail/Data" var="addChecklistDetailDataUrl"/>

<script>
    console.log("JS JSP Calling");
    $("#investigationType").on('input', function(){
        $(".investigation-type").html($(this).val());
    });
    $("#partyName").on('input', function(){
        $(".party-name").html($(this).val());
    });
    $("#requestReason").on('input', function(){
        $(".request-reason").html($(this).val());
    });
    $("#comOfficial").on('input', function(){
        $(".company-official").html($(this).val());
    });
    $("#signatureDate").on('input', function(){
        $(".signature-date").html($(this).val());
    });
    $(document).on('change', '#submitterSignatureBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#submitterSignatureImageHolder");
	    var form1a_image_holder = $("#submitterSignatureImageHolderPre");
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
	              }).appendTo(form1a_image_holder);
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
    $(document).on('change', '#justicePeaceBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#justicePeaceImageHolder");
	    var form1a_image_holder = $("#justicePeaceImageHolderPre");
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
	              }).appendTo(form1a_image_holder);
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

    // CERTIFICATE SERVICE FORM
    $("#docSubmitDate").on('input', function(){
        $(".doc-submit-date").html($(this).val());
    });

    $(document).on('change', '#signedBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#signedImageHolder");
	    var form1a_image_holder = $("#signedImageHolderPre");
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
	              }).appendTo(form1a_image_holder);
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

    // CERTIFICATE VERACITY FORM
    $("#veracityComName").on('input', function(){
        $(".veracity-com-name").html($(this).val());
    });
    $("#veracityComPosition").on('input', function(){
        $(".veracity-com-position").html($(this).val());
    });
    $("#veracityComCompany").on('input', function(){
        $(".veracity-com-company").html($(this).val());
    });
    
    $(document).on('change', '#veracitySignedBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#veracitySignedImageHolder");
	    var form1a_image_holder = $("#veracitySignedImageHolderPre");
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
	              }).appendTo(form1a_image_holder);
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
    
    $(document).on('change', '#veracityPeaceJusticeBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#veracityPeaceJusticeImageHolder");
	    var form1a_image_holder = $("#veracityPeaceJusticeImageHolderPre");
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
	              }).appendTo(form1a_image_holder);
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

    // APPEARANCE NOTICE
	$("#appearanceNoticeFullName").on('input', function(){
        $(".appearance-notice-full-name").html($(this).val());
    });
	$("#appearanceNoticeDate").on('input', function(){
        $(".appearance-notice-date").html($(this).val());
    });
	$("#appearanceNoticeAddressOne").on('input', function(){
        $(".appearance-notice-address-one").html($(this).val());
    });
	
	$(document).on('change', '#appearanceNoticeSignatureBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#appearanceNoticeSignatureImageHolder");
	    var form1a_image_holder = $("#appearanceNoticeSignatureImageHolderPre");
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
	              }).appendTo(form1a_image_holder);
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
	
	// ADD FORM FUNCTIONALITY
	function addDocServedAddressDetail(){
		docServedAddressVal = $("#docServedAddressVal").val();
		
		 docServeName = $("#docServeName").val();
		 docServeCom = $("#docServeCom").val();
		 docServeAddress = $("#docServeAddress").val();
		 if(docServeName != "" || docServeCom !="" || docServeAddress !=""){
			$(".addDocServedAddressDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addDocServedAddressUrl}",
				data : {
					"<portlet:namespace/>docServedAddressVal" : docServedAddressVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addDocServedAddressDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */					
					$(".docServeName" + docServedAddressVal).append(docServeName);
					$(".docServeCom" + docServedAddressVal).append(docServeCom);
					$(".docServeAddress" + docServedAddressVal).append(docServeAddress);
					/* VALUE INCREAMENT */
					setCertificationOfServiceAddFormInfo('','');
					docServedAddressVal++;
					$("#docServedAddressVal").val(docServedAddressVal);
					
					/* RESET FORM FIELDS */
					$("#docServeName").val("");
					$("#docServeCom").val("");
					$("#docServeAddress").val("");
				}
			});
		}else{
			$("#docServeName").focus();
		}
	}

	function docServedAddressEditTab(docServedAddressVal){
		$(".editDocServedAddressTabPopup").modal("show");
		$(".editDocServeName").attr("id" , "editDocServeName"+docServedAddressVal);
		$(".editDocServeCom").attr("id" , "editDocServeCom"+docServedAddressVal);
		$(".editDocServeAddress").attr("id" , "editDocServeAddress"+docServedAddressVal);
		
		docServeName = $(".docServeName"+docServedAddressVal+":first").text().trim();
		docServeCom = $(".docServeCom"+docServedAddressVal+":first").text().trim();
		docServeAddress = $(".docServeAddress"+docServedAddressVal+":first").text().trim();
		
		$("#editDocServeName"+docServedAddressVal).val(docServeName);
		$("#editDocServeCom"+docServedAddressVal).val(docServeCom);
		$("#editDocServeAddress"+docServedAddressVal).val(docServeAddress);
		
		$(".saveEditDocServedAddressPopupDataBtn").attr("onclick" , "docServedAddressEditData("+docServedAddressVal+")");
	}
	function docServedAddressEditData(docServedAddressVal){
		setCertificationOfServiceAddFormInfo(docServedAddressVal,'');
		$(".docServeName" + docServedAddressVal).html($("#editDocServeName"+docServedAddressVal).val());
		$(".docServeCom" + docServedAddressVal).html($("#editDocServeCom"+docServedAddressVal).val());
		$(".docServeAddress" + docServedAddressVal).html($("#editDocServeAddress"+docServedAddressVal).val());
		
		$(".editDocServeName").val("");
		$(".editDocServeCom").val("");
		$(".editDocServeAddress").val("");
	}
	
	function docServedAddressDeleteData(docServedAddressValData) {
		setCertificationOfServiceAddFormInfo(docServedAddressValData,'deleteApplicant');
			var docServedAddressCounter = $("#docServedAddressVal").val();
			$("#docServedAddressVal").val(docServedAddressCounter - 1);
			var delRowElement = $(".doc-served-address-row" + docServedAddressValData); 
			delRowElement.remove();
			var j = parseInt(docServedAddressValData) + 1;
			// Update the row numbers and IDs for each row
			for (var i = j; i <= docServedAddressCounter; i++) {
			var prevCounter = i - 1;
			var rowElement = $(".doc-served-address-row" + i);
			// Update the IDs for relevant elementsd
			rowElement.attr("class", "doc-served-address-row" + prevCounter);
			rowElement.find("td.docServeName"+i).removeClass("docServeName"+i).addClass("docServeName"+prevCounter);
			rowElement.find("td.docServeCom"+i).removeClass("docServeCom"+i).addClass("docServeCom"+prevCounter);
			rowElement.find("td.docServeAddress"+i).removeClass("docServeAddress"+i).addClass("docServeAddress"+prevCounter);
			rowElement.find("#docServedAddressDeleteDataTab").attr('onclick', 'docServedAddressDeleteData(' +prevCounter+ ')');
			rowElement.find("#docServedAddressEditTab").attr('onclick', 'docServedAddressEditTab(' +prevCounter+ ')');
			}
	}

	function addChecklistDetail(){
		checklistVal = $("#checklistVal").val();
		
		checklistItem = $("#checklistItem").val();
		 if(checklistItem != ""){
			$(".addChecklistDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addchecklistUrl}",
				data : {
					"<portlet:namespace/>checklistVal" : checklistVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addChecklistDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);

						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */					
					$(".checklistItem" + checklistVal).append(checklistItem);
					addChecklistDetailData("");
					/* VALUE INCREAMENT */
					checklistVal++;
					$("#checklistVal").val(checklistVal);
					
					/* RESET FORM FIELDS */
					$("#checklistItem").val("");
				}
			});
		}else{
			$("#checklistItem").focus();
		}
	}
	function checklistDetailEditTab(checklistVal){
		$(".editChecklistDetailEditTabPopup").modal("show");
		$(".editChecklistItem").attr("id" , "editChecklistItem"+checklistVal);
		
		checklistItem = $(".checklistItem"+checklistVal+":first").text().trim();
		
		$("#editChecklistItem"+checklistVal).val(checklistItem);

		$(".saveEditChecklistDetailPopupDataBtn").attr("onclick" , "checklistEditTab("+checklistVal+")");
	}
	function checklistEditTab(checklistVal){
		$(".checklistItem" + checklistVal).html($("#editChecklistItem"+checklistVal).val());
		
		$(".editChecklistItem").val("");
		
	}
	
	function checklistItemDeleteData(checklistValData) {
		  var checklistDetailCountCounter = $("#checklistVal").val();
		  $("#checklistVal").val(checklistDetailCountCounter - 1);
		  var delRowElement = $(".checklist-item-row" + checklistValData); 
		  delRowElement.remove();
		  var j = parseInt(checklistValData) + 1;
		  // Update the row numbers and IDs for each row
		  for (var i = j; i <= checklistDetailCountCounter; i++) {
		    var prevCounter = i - 1;
		    var rowElement = $(".checklist-item-row" + i);
		    // Update the IDs for relevant elementsd
		    rowElement.attr("class", "checklist-item-row" + prevCounter);
		    rowElement.find("td.checklistItem"+i).removeClass("checklistItem"+i).addClass("checklistItem"+prevCounter);
		    rowElement.find("#checklistItemDeleteDataTab").attr('onclick', 'checklistItemDeleteData(' +prevCounter+ ')');
		    rowElement.find("#checklistDetailEditTab").attr('onclick', 'checklistDetailEditTab(' +prevCounter+ ')');
		  }
	}
	
    <!-- Separate Value on Enter -->
	$(document).ready(function () {
		$('input[name="products"]').tagsinput({
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
	
	 function deleteApplicantInfo(keyForDelete){
		    $.ajax({
					    type: "POST",
					    url: "${deleteServiceApplicant}",
					    data: {
					    	 "<portlet:namespace/>keyForDelete": KeyForDelete,
					      		    },
					    success: function (data) {
				    },
					    error: function (data) {
				    },
				});
			 }
		function addChecklistDetailData(counter) {
			if (counter != "") {
				checklistItemId = $("#checklistItemId" +counter).val();
				checklistItem = $("#checklistItem" +counter).val();
			} else {
				checklistItemId = $("#checklistItemId").val();
				checklistItem = $("#checklistItem").val();
				
			    }
			jadscApplicationId = $("#jadscApplicationId").val();
			counterChecklistVal=$("#checklistVal").val();
			$
					.ajax({
						type : "POST",
						url : "${addChecklistDetailDataUrl}",
						data : {
							"<portlet:namespace/>checklistItem" : checklistItem,
							"<portlet:namespace/>checklistItemId" : checklistItemId,
							"<portlet:namespace/>jadscApplicationId" : jadscApplicationId,
							"<portlet:namespace/>counterChecklistVal" : counterChecklistVal,
						},
						success : function(data) {
							var result = data.APP_DATA;
							var counter = result["counter"];
							$("#checklistItemId"+counter).val(result["checklistItemId"]);
						},
						error : function(data) {
						}
					});
		}
</script>