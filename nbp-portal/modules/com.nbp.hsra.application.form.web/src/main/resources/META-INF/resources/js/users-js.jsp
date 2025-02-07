<script>
$('input[type=checkbox][name=categoryFive]').change(function() {
	  if (this.value === 'Other') {
		  $(".categoryFiveOtherBox").toggleClass("hide", !this.checked);
	  } 
});
$('input[type=checkbox][name=categoryOne]').change(function() {
	  if (this.value === 'Other') {
		  $(".categoryOneOtherBox").toggleClass("hide", !this.checked);
	  } 
});
$('input[type=checkbox][name=categoryTwo]').change(function() {
	  if (this.value === 'Other') {
		  $(".categoryTwoOtherBox").toggleClass("hide", !this.checked);
	  } 
});
$('input[type=checkbox][name=categoryThree]').change(function() {
	  if (this.value === 'Other') {
		  $(".categoryThreeOtherBox").toggleClass("hide", !this.checked);
	  } 
});
$('input[type=checkbox][name=categoryFour]').change(function() {
	  if (this.value === 'Other') {
		  $(".categoryFourOtherBox").toggleClass("hide", !this.checked);
	  } 
});


/* Nuclear Safety */
$(document).ready(function () {
	$('input[name="businessType"]').tagsinput({
		trimValue: true,
		confirmKeys: [13],
		focusClass: 'my-focus-class'
	});
	
	$('.bootstrap-tagsinput input').on('focus', function() {
		$(this).closest('.bootstrap-tagsinput').addClass('has-focus');
	}) .on('blur', function() {
		$(this).closest('.bootstrap-tagsinput').removeClass('has-focus');
	}); 
});

$(document).ready(function () {
	$('input[name="businessTypeBroker"]').tagsinput({
		trimValue: true,
		confirmKeys: [13],
		focusClass: 'my-focus-class'
	});
	
	$('.bootstrap-tagsinput input').on('focus', function() {
		$(this).closest('.bootstrap-tagsinput').addClass('has-focus');
	}) .on('blur', function() {
		$(this).closest('.bootstrap-tagsinput').removeClass('has-focus');
	}); 
});
$("input[name='equipmentProtection']").change(function(){
    var targetData = $(this).attr('id');
    $("." + targetData).toggleClass("hide");
    if($(this).val() == 'Respiratory protection'){
        $(".otherSpecifyHerePro, .otherSpecifyHereProPreview").toggleClass("hide");
    }
});
$("input[name='equipmentProtection']").change(function(){
    var targetData = $(this).attr('id');
    $("." + targetData).toggleClass("hide");
    if($(this).val() == 'Tongs/forceps/other remote handling tool'){
        $(".otherSpecifyHere, .otherSpecifyHerePreview").toggleClass("hide");
    }
});
$("input[name='applicationType']").change(function(){
    var targetData = $(this).attr('id');
    $("." + targetData).toggleClass("hide");
    if($(this).val() == 'Renewal'){
        $(".otherSpecifyValue, .otherSpecifyValuePreview").toggleClass("hide");
    }
});
$("input[name='applicationType']").change(function(){
    var targetData = $(this).attr('id');
    $("." + targetData).toggleClass("hide");
    if($(this).val() == 'Variation'){
        $(".otherVariation, .otherVariationPreview").toggleClass("hide");
    }
});
/* other Representative sign */
 $(document).on('change', '#applicantRepresentativeSignatureBtn', function() {
    //Get count of selected files
    var countFiles = $(this)[0].files.length;
    var imgPath = $(this)[0].value;
    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
    var image_holder = $("#applicantRepresentativeSignature");
    var form1a_image_holder = $("#applicantRepresentativeSignaturePreview");
    image_holder.empty();
   /*  form1a_image_holder.empty(); */ 
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
/* Acknowledgement Medical-add-sign */
$(document).on('change', '#acknowledgementMedicalSignatureUpload', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#acknowledgementMedicalSignature");
	   /*  var form1a_image_holder = $("#applicantStampWaterSportEmployeeImageHolderPreview"); */
	    image_holder.empty();
	   /* form1a_image_holder.empty(); */ 
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
	             /*   .appendTo(form1a_image_holder); */
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
/* Applicant Signature-add-sign */
$(document).on('change', '#applicantSignaturelegalSignatureUpload', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#applicantSignaturelegalSignature");
	   /*  var form1a_image_holder = $("#applicantStampWaterSportEmployeeImageHolderPreview"); */
	    image_holder.empty();
	   /* form1a_image_holder.empty(); */ 
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
	             /*   .appendTo(form1a_image_holder); */
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

	  /* Declaration Signature-add-sign */
	$(document).on('change', '#signatureOperatorBtn', function() {
	    //Get count of selected files
	    var countFiles = $(this)[0].files.length;
	    var imgPath = $(this)[0].value;
	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	    var image_holder = $("#signatureOperatorImageHolder");
	   var form1a_image_holder = $("#signatureOperatorImageHolderPreview");
	    image_holder.empty();
	   /* form1a_image_holder.empty(); */ 
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
	/* Broker add sign */
	$(document).on('change', '#signatureBrokerBtn', function() {  
	  	    //Get count of selected files
	  	    var countFiles = $(this)[0].files.length;
	  	    var imgPath = $(this)[0].value;
	  	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	  	    var image_holder = $("#signatureBrokerImageHolder");
	  	   var form1a_image_holder = $("#signatureBrokerImageHolderPreview");
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
	  /* Declearation Signature*/
	  $(document).on('change', '#declearationSignBtn', function() {
	  	    //Get count of selected files
	  	    var countFiles = $(this)[0].files.length;
	  	    var imgPath = $(this)[0].value;
	  	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	  	    var image_holder = $("#signatureOperatorImageHolder");
	  	   /*  var form1a_image_holder = $("#applicantStampWaterSportEmployeeImageHolderPreview"); */
	  	    image_holder.empty();
	  	   /* form1a_image_holder.empty(); */ 
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
	  	             /*   .appendTo(form1a_image_holder); */
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
	  /* Legal Person Signature*/
	  $(document).on('change', '#legalPersonSignatureBtn', function() {
	  	    //Get count of selected files
	  	    var countFiles = $(this)[0].files.length;
	  	    var imgPath = $(this)[0].value;
	  	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	  	    var image_holder = $("#legalPersonSignature");
	  	   /*  var form1a_image_holder = $("#applicantStampWaterSportEmployeeImageHolderPreview"); */
	  	    image_holder.empty();
	  	   /* form1a_image_holder.empty(); */ 
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
	  	             /*   .appendTo(form1a_image_holder); */
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
	  /* Qualified Expert Signature*/
	  $(document).on('change', '#expertSignatureBtn', function() {
	  	    //Get count of selected files
	  	    var countFiles = $(this)[0].files.length;
	  	    var imgPath = $(this)[0].value;
	  	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	  	    var image_holder = $("#expertSignatureImageHolder");
	  	   var form1a_image_holder = $("#expertSignatureImageHolderPreview");
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
	  
	  $('input[type=radio][name=materialTechnology]').change(function() {
	      if (this.value == 'Yes') {
	          $("#other-copy, #otherCopyPreview").removeClass("hide");
	      }
	      else{
	      	$("#other-copy, #otherCopyPreview").addClass("hide");
	      }
	  });
	  $('input[type=radio][name=facilityAssociated]').change(function() {
	      if (this.value == 'Yes') {
	          $("#tableBox, #tableBoxPreview").removeClass("hide");
	      }
	      else{
	      	$("#tableBox, #tableBoxPreview").addClass("hide");
	      }
	  });
	  $('input[type=radio][name=creditfacility]').change(function() {
	      if (this.value == 'Yes') {
	          $("#nextBox, #nextBoxPreview").removeClass("hide");
	      }
	      else{
	      	$("#nextBox, #nextBoxPreview").addClass("hide");
	      }
	  });
	  $('input[type=radio][name=sealedSource]').change(function() {
	      if (this.value == 'Yes') {
	          $("#sealedManu, #sealedManuPreview").removeClass("hide");
	          $(".sealNoMenu, .sealNoMenuPreview").addClass("hide");
	      }
	      else{
	      	$("#sealedManu, #sealedManuPreview").addClass("hide");
	      	$(".sealNoMenu, .sealNoMenuPreview").removeClass("hide");
	      }
	  });
	  $('input[type=radio][name=modelNo]').change(function() {
	      if (this.value == 'No') {
	          $("#modelNumber, #modelNumberPreview").removeClass("hide");
	      }
	      else{
	      	$("#modelNumber, #modelNumberPreview").addClass("hide");
	      }
	  });
	  $("#organizationNameD").on('input', function(){
	      $(".appliName").html($(this).val());
	  });
	  $("#applicantDateBirth").on('input', function(){
	      $(".bornDate").html($(this).val());
	  });
	  $("#parishArea").on('input', function(){
	      $(".parishName").html($(this).val());
	  });
	  $("#applicantCountry").on('input', function(){
	      $(".countryName").html($(this).val());
	  });
	  $("#applicantTownName").on('input', function(){
	      $(".residingTown").html($(this).val());
	  });
	  $("#dateApplicant").on('input', function(){
	      $(".dateCertificate").html($(this).val());
	  });
	  $("#expertFirstName").on('input', function(){
	      $(".appliNameD").html($(this).val());
	  });

	  /* Qualified Declaration Expert Signature*/
	  $(document).on('change', '#declarationSignBtn', function() {
	  	    //Get count of selected files
	  	    var countFiles = $(this)[0].files.length;
	  	    var imgPath = $(this)[0].value;
	  	    var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
	  	    var image_holder = $("#declarationSignImageHolder");
	  	   var form1a_image_holder = $("#declarationSignImageHolderPreview");
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
	  
	  
	  
/* 	  function addUnsealedSourcesDetail(){
		  
	  } */
	  
	  
	  /* wizard js */
	  function showSelectedCategoryForm(){
		 	$(".medical-practices, .industrial-radiography, .vetrinary-nuclear-medicine, .other-industries, .gauges, .petroleum-exploration, .serivicing, .manufacturing").addClass("hide");
		    var selectedSpecificApplicableType = new Array();
		    $("#specificApplicableType").find(".wizard-card.active .wizard-title").each(function () {
		    	selectedSpecificApplicableType.push($(this).html());
		    });
		    applicantType = $("#applicantTypeVal").val();
		    if(applicantType == "Users of Radiation Sources"){
		    	if(selectedSpecificApplicableType.includes("(a)Medical Practices")){
			    	$(".medical-practices").removeClass("hide");
			    }
			    if(selectedSpecificApplicableType.includes("(b)Industrial Radiography")){
			    	$(".industrial-radiography").removeClass("hide");
			    }
			    if(selectedSpecificApplicableType.includes("(c)Veterinary Nuclear Medicine")){
			    	$(".vetrinary-nuclear-medicine").removeClass("hide");
			    }
			    if(selectedSpecificApplicableType.includes("(d)Other Industries that use Nuclear Material")){
			    	$(".other-industries").removeClass("hide");
			    }
			    if(selectedSpecificApplicableType.includes("(e)Gauges (Fixed &amp; Portable)")){
			    	$(".gauges").removeClass("hide");
			    }
			    if(selectedSpecificApplicableType.includes("(f)Petroleum Exploration (Well Logging)")){
			    	$(".petroleum-exploration").removeClass("hide");
			    }
			    if(selectedSpecificApplicableType.includes("(g)Servicing")){
			    	$(".serivicing").removeClass("hide");
			    }
			    if(selectedSpecificApplicableType.includes("(h)Manufacturing")){
			    	$(".manufacturing").removeClass("hide");
			    }
			    var selectedQualifiedAreaType = new Array();
			    $("#qualifiedAreaType").find(".wizard-card.active .wizard-title").each(function () {
			    	selectedQualifiedAreaType.push($(this).html());
			    });
		    }
		    if(applicantType == "Service Providers"){
		    	$(".serivicing").removeClass("hide");
		    }
		    
	 }
	 function activeSelectForm(){
		applicantType = $("#applicantTypeVal").val();
		$(".tab-pane").removeClass("active");
		$("#side-tabs .nav-link").removeClass("active");
		/* $("#side-tabs .nav-link").addClass("disabled"); */
		if(applicantType == "Users of Radiation Sources"){
			$(".nuclear-safety-forms .tab-pane:first").addClass("active");
			$(".nuclear-safety-forms .nav-link:first").addClass("active");
			$(".nuclear-safety-forms .nav-link:first").removeClass("disabled");
		}else if(applicantType == "Service Providers"){
			$(".nuclear-safety-forms .tab-pane:first").addClass("active");
			$(".nuclear-safety-forms .nav-link:first").addClass("active");
			$(".nuclear-safety-forms .nav-link:first").removeClass("disabled");
		}else if(applicantType == "Brokers"){
			$(".broker-registration-forms .tab-pane:first").addClass("active");
			$(".broker-registration-forms .nav-link:first").addClass("active");
			$(".broker-registration-forms .nav-link:first").removeClass("disabled");
		}else if(applicantType == "Qualified Experts"){
			$(".qualified-expert-forms .tab-pane:first").addClass("active");
			$(".qualified-expert-forms .nav-link:first").addClass("active");
			$(".qualified-expert-forms .nav-link:first").removeClass("disabled");
		}	
	}
	 
	 /* / Render document in preview / */
	 function showDocsPreview(docRenderCount){
	 		var requiredDoc = $("#requiredCounter").val();
	 		var notRequiredDoc = $("#notRequiredCounter").val();
	 		var j;
	 		// Parse the string values to numbers
	 		requiredDoc = parseInt(requiredDoc);
	 		notRequiredDoc = parseInt(notRequiredDoc);
	 		var notRequireDocCount;
	 		if(docRenderCount == "1"){
	 				var requireDocPreview = document.querySelector('#requireDocPreview');
	 				requireDocPreview.innerHTML="";
	 				var notRequireDocPreview = document.querySelector('#notRequireDocPreview');
	 				notRequireDocPreview.innerHTML="";
	 			if(requiredDoc > 1){
	 				j = requiredDoc+1;
	 				notRequireDocCount = requiredDoc + notRequiredDoc;
	 				$("#requireDocPreviewSection").removeClass("hide");
	 				for(i=1;i<=requiredDoc;i++){
	 					requiredDocPre = $("#requiredDoc"+i).html();
	 					fileUrl = $("#fileUrl"+i).val();
	 					var requireDocPreview = document.querySelector('#requireDocPreview');
	 					var previewData = document.createElement('div');
	 					previewData.innerHTML = '<p class="sub_heading">'+requiredDocPre+'</p><a class="sub_heading_content" id="requireDocNamePreview'+i+'" href="'+fileUrl+'"></a>';
	 					requireDocPreview.append(previewData);
	 				}
	 			}else{
	 				j = 1;
	 				notRequireDocCount = notRequiredDoc;
	 			}
	 			if(notRequiredDoc > 1){
	 				$("#notRequireDocPreviewSection").removeClass("hide");
	 				for(i=j;i<=notRequireDocCount;i++){
	 					notRequiredDocPre = $("#notRequiredDoc"+i).html();
	 					fileUrl = $("#fileUrl"+i).val();
	 					documentName = $("#document-name"+i).html();
	 					var notRequireDocPreview = document.querySelector('#notRequireDocPreview');
	 					var previewData = document.createElement('div');
	 					previewData.innerHTML = '<p class="sub_heading">'+notRequiredDocPre+'</p><a class="sub_heading_content" id="nonRequireDocNamePreview'+i+'" href="'+fileUrl+'"></a>';
	 					notRequireDocPreview.append(previewData);
	 				}
	 			}
	 		}
	 		/ TO APPEND DOC NAME /
	 		if(requiredDoc > 0){
	 			for(i=1;i<=requiredDoc;i++){
	 				documentName = $("#document-name"+i).html();
	 				$("#requireDocNamePreview"+i).html(documentName);
	 			}
	 		}
	 		if(notRequiredDoc > 0){
	 			for(i=j;i<=notRequireDocCount;i++){
	 				documentName = $("#document-name"+i).html();
	 				$("#nonRequireDocNamePreview"+i).html(documentName);
	 			}
	 		}
	 	}

	 $(".preview-edit-button").click(function(){
	 	$('#hsraFormPreviewFieldset').removeClass("show");
	 	$('#hsraFormsFieldset').addClass("show", "400");
	 	$(".form-wizard-next-btn ").show();
	 	$(".form-wizard-save-btn").show();
	 	$(".final-submit").addClass("hide");
	 	$(".final-submit-container").addClass("hide");
	 	formTabId = $(this).prop('id')+"FormTab";
	     $("#"+formTabId).trigger("click");
	 	$(".form-section").addClass("active");
	 	$(".rm, .form-section").removeClass("activated");
	 	$(".last-step").removeClass("activated");
	 	$(".last-step").removeClass("active");
        scrollToPageTop();
	 });
	 $("#supporting-doc-edit-tab").click(function(){
	 	$('#hsraFormPreviewFieldset').removeClass("show");
	 	$('#hsraSupportingDocumentFieldset').addClass("show", "400");
	 	$(".form-wizard-next-btn ").show();
	 	$(".form-wizard-save-btn").show();
	 	$(".final-submit").addClass("hide");
	 	$(".final-submit-container").addClass("hide");
	 	$(".supporting-documents").addClass("active");
	 	$(".rm, .supporting-documents").removeClass("activated");
	 	$(".last-step").removeClass("activated");
	 	$(".last-step").removeClass("active");
		 scrollToPageTop();
	 });
	 $("#fee-payment-edit-tab").click(function(){
	 	$('#hsraFormPreviewFieldset').removeClass("show");
	 	$('#hsrafeePaymentFieldset').addClass("show", "400");
	 	$(".form-wizard-next-btn ").show();
	 	$(".form-wizard-save-btn").show();
	 	$(".final-submit").addClass("hide");
	 	$(".final-submit-container").addClass("hide");
	 	$(".fee-payment").addClass("active");
	 	$(".fp, .fee-payment").removeClass("activated");
	 	$(".last-step").removeClass("activated");
	 	$(".last-step").removeClass("active");
		 scrollToPageTop();
	 });

</script>