<script>
    function applicantInfo(){
        nextForm();
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

	 function addBlasterDetailInfo() {
		explosivesApplicationId=$("#explosivesApplicationId").val();
		blasterSurname = $("#blasterSurname").val();
		blasterFistName = $("#blasterFistName").val();
		blasterMiddleName = $("#blasterMiddleName").val();
		blasterGender = $('input[name="blasterGender"]:checked').val();
		blasterOfficeNumber = $("#blasterOfficeNumber").val();
		blasterCellNumber = $("#blasterCellNumber").val();
		blasterTrnNumber = $("#blasterTrnNumber").val();
		blasterDob = $("#blasterDob").val();
		blasterAddress = $("#blasterAddress").val();
		selectedEducBackString = $("#blasterEducationalBackground").val();
		/* var selectedEducBackArray = new Array();
		  $("input:checkbox[name=blasterEducationalBackground]:checked").each(function () {
			  selectedEducBackArray.push($(this).val());
		  });
		var selectedEducBackString = selectedEducBackArray.join(","); */
		blasterCourseParticipated = $('input[name="blasterCourseParticipated"]:checked').val();
		blasterState = $("#blasterState").val();
		blasterCourseName = $("#blasterCoursename").val();
		blasterOrganizer = $("#blasterOrganizer").val();
		blasterDate = $("#blasterDate").val();
		
		$.ajax({
			type : "POST",
			url : '${addBlasterDetailInfo}',
			data : {
				"<portlet:namespace/>explosivesApplicationId" : explosivesApplicationId,
				"<portlet:namespace/>blasterSurname" : blasterSurname,
				"<portlet:namespace/>blasterFistName" : blasterFistName,
				"<portlet:namespace/>blasterMiddleName" : blasterMiddleName,
				"<portlet:namespace/>blasterGender" : blasterGender,
				"<portlet:namespace/>blasterOfficeNumber" : blasterOfficeNumber,
				"<portlet:namespace/>blasterCellNumber" : blasterCellNumber,
				"<portlet:namespace/>blasterTrnNumber" : blasterTrnNumber,
				"<portlet:namespace/>blasterAddress" : blasterAddress,
				"<portlet:namespace/>blasterDob" : blasterDob,
				"<portlet:namespace/>selectedEducBackString" : selectedEducBackString,
				"<portlet:namespace/>blasterCourseParticipated" : blasterCourseParticipated,
				"<portlet:namespace/>blasterState" : blasterState,
				"<portlet:namespace/>blasterCourseName" : blasterCourseName,
				"<portlet:namespace/>blasterOrganizer" : blasterOrganizer,
				"<portlet:namespace/>blasterDate" : blasterDate,
			},
			success : function(data) {
				uploadDocuments('blasterApplicantSignatureBtn','Signature of Applicant','explosivesGenericSupportingDocUrl');
				uploadDocuments('blasterApplicantImageBtn','Image of Applicant','explosivesGenericSupportingDocUrl');
			},
			error : function(data) {

			}
		});
	} 
	 function addPyrotechnicDetailInfo() {
		explosivesApplicationId=$("#explosivesApplicationId").val();
		pyrotechnicSurname = $("#pyrotechnicSurname").val();
		pyrotechnicFistName = $("#pyrotechnicFistName").val();
		pyrotechnicMiddleName = $("#pyrotechnicMiddleName").val();
		pyrotechnicGender = $('input[name="pyrotechnicGender"]:checked').val();
		pyrotechnicOfficeNumber = $("#pyrotechnicOfficeNumber").val();
		pyrotechnicCellNumber = $("#pyrotechnicCellNumber").val();
		pyrotechnicTrnNumber = $("#pyrotechnicTrnNumber").val();
		pyrotechnicDob = $("#pyrotechnicDob").val();
		pyrotechnicAddress = $("#pyrotechnicAddress").val();
		var selectedPyrotechnicEducBackArray = new Array();
		  $("input:checkbox[name=pyrotechnicEducationalBackground]:checked").each(function () {
			  selectedPyrotechnicEducBackArray.push($(this).val());
		  });
		var selectedPyrotechnicEducBackArrayString = selectedPyrotechnicEducBackArray.join(",");
		pyrotechnicCourseParticipated = $('input[name="pyrotechnicCourseParticipated"]:checked').val();
		pyrotechnicState = $("#pyrotechnicState").val();
		pyrotechnicCoursename = $("#pyrotechnicCoursename").val();
		pyrotechnicOrganizer = $("#pyrotechnicOrganizer").val();
		pyrotechnicDate = $("#pyrotechnicDate").val();
		
		$.ajax({
			type : "POST",
			url : '${addPyrotechnicDetailInfo}',
			data : {
				"<portlet:namespace/>explosivesApplicationId" : explosivesApplicationId,
				"<portlet:namespace/>pyrotechnicSurname" : pyrotechnicSurname,
				"<portlet:namespace/>pyrotechnicFistName" : pyrotechnicFistName,
				"<portlet:namespace/>pyrotechnicMiddleName" : pyrotechnicMiddleName,
				"<portlet:namespace/>pyrotechnicGender" : pyrotechnicGender,
				"<portlet:namespace/>pyrotechnicOfficeNumber" : pyrotechnicOfficeNumber,
				"<portlet:namespace/>pyrotechnicCellNumber" : pyrotechnicCellNumber,
				"<portlet:namespace/>pyrotechnicTrnNumber" : pyrotechnicTrnNumber,
				"<portlet:namespace/>pyrotechnicAddress" : pyrotechnicAddress,
				"<portlet:namespace/>pyrotechnicDob" : pyrotechnicDob,
				"<portlet:namespace/>selectedPyrotechnicEducBackArrayString" : selectedPyrotechnicEducBackArrayString,
				"<portlet:namespace/>pyrotechnicCourseParticipated" : pyrotechnicCourseParticipated,
				"<portlet:namespace/>pyrotechnicState" : pyrotechnicState,
				"<portlet:namespace/>pyrotechnicCoursename" : pyrotechnicCoursename,
				"<portlet:namespace/>pyrotechnicOrganizer" : pyrotechnicOrganizer,
				"<portlet:namespace/>pyrotechnicDate" : pyrotechnicDate,
			},
			success : function(data) {
				/* uploadDocuments('processedFoodSignaturefactoriesBtn','Processed Food Act Signature','') */
			},
			error : function(data) {

			}
		});
	} 
    $(document).on('change', '#blasterApplicantSignatureBtn', function() {
        //Get count of selected files
        var countFiles = $(this)[0].files.length;
        var imgPath = $(this)[0].value;
        var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
        var image_holder = $("#blasterSignatureHolder");
        var form1a_image_holder = $("#blasterSignatureHolderPre");
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
    $(document).on('change', '#blasterApplicantImageBtn', function() {
        //Get count of selected files
        var countFiles = $(this)[0].files.length;
        var imgPath = $(this)[0].value;
        var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
        var image_holder = $("#blasterApplicantImageHolder");
        var form1a_image_holder = $("#blasterApplicantImageHolderPre");
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

    $(".preview-edit-button").click(function(){
        $('#explosivesformPreviewFieldset').removeClass("show");
        $('#explosivesFormsFieldset').addClass("show", "400");
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
        $('#explosivesformPreviewFieldset').removeClass("show");
        $('#explosivesSupportingDocumentFieldset').addClass("show", "400");
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
        $('#explosivesformPreviewFieldset').removeClass("show");
        $('#explosivesfeePaymentFieldset').addClass("show", "400");
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
    $('input[name="blasterCourseParticipated"]').change(function(){
        if($(this).val() == "Yes"){
            $(".blasterCourseParticipatedInfo").removeClass("hide");
        }else{
          $(".blasterCourseParticipatedInfo").addClass("hide");
        }
    });
</script>