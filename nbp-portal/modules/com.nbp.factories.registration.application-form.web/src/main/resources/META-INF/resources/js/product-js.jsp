<%@ include file="../init.jsp" %>
<portlet:resourceURL var="addProductDetailUrl" id="product/detail"/>
<portlet:resourceURL var="deleteProductDetailUrl" id="delete/product/detail"/>
<script>
function addProductDetail(theSaveandContinue){
	productDetailVal = $("#productDetailVal").val();
	brand = $("#brand").val();
	product = $("#product").val();
	productSize = $("#productSize").val();
	measurementValue = $("#measurementValue").val();
	submitForm = true;
	if(!theSaveandContinue){
		if(!measurementValue){
			$("#measurementValueValidation").removeClass("hide");
			$("#measurementValue").focus();
			submitForm= false;
		}else{
			$("#measurementValueValidation").addClass("hide");
		}
		if(!productSize){
			$("#productSizeValidation").removeClass("hide");
			$("#productSize").focus();
			submitForm= false;
		}else{
			$("#productSizeValidation").addClass("hide");
		}
		if(!product){
			$("#productValidation").removeClass("hide");
			$("#product").focus();
			submitForm= false;
		}else{
			$("#productValidation").addClass("hide");
		}
		if(!brand){
			$("#brandValidation").removeClass("hide");
			$("#brand").focus();
			submitForm= false;
		}else{
			$("#brandValidation").addClass("hide");
		}
	}
	
	if(submitForm){
		if(brand != "" && product != "" && productSize != "" && measurementValue != ""){
			$(".addProductDetailTableBox").removeClass("hide");
			$.ajax({
				type : "POST",
				url : "${addProductDetailUrl}",
				data : {
					"<portlet:namespace/>productDetailVal" : productDetailVal,
				},
				async:false,
				success : function(data) {
					/* APPEND ROW JSP INTO TABLE */
					$(".addProductDetailTable").each(function(index) {
						if (index === 0) {
							$(this).append(data);
	
						} else {
							$cloneRow = $(data).clone();
							$cloneRow.find('td').slice(-2).remove();
							$(this).append($cloneRow);
						}
					});
					/* APPEND DATA INTO TABLE */					
					$(".brand" + productDetailVal).append(brand);
					$(".product" + productDetailVal).append(product);
					$(".productSize" + productDetailVal).append(productSize);
					$(".measurementValue" + productDetailVal).append(measurementValue);
					productDetailData('');
					/* VALUE INCREAMENT */
					
					productDetailVal++;
					$("#productDetailVal").val(productDetailVal);
					
					/* RESET FORM FIELDS */
					$("#brand").val("");
					$("#product").val("");
					$("#productSize").val("");
					$("#measurementValue").val("");
				}
			});
		}
	}
}
function productDetailEditTab(productDetailVal){
	$(".editProductDetailEditTabPopup").modal("show");
	$(".editBrand").attr("id" , "editBrand"+productDetailVal);
	$(".editProduct").attr("id" , "editProduct"+productDetailVal);
	$(".editProductSize").attr("id" , "editProductSize"+productDetailVal);
	$(".editMeasurementValue").attr("id" , "editMeasurementValue"+productDetailVal);
	
	brand = $(".brand"+productDetailVal+":first").text().trim();
	product = $(".product"+productDetailVal+":first").text().trim();
	productSize = $(".productSize"+productDetailVal+":first").text().trim();
	measurementValue = $(".measurementValue"+productDetailVal+":first").text().trim();
	
	
	$("#editBrand"+productDetailVal).val(brand);
	$("#editProduct"+productDetailVal).val(product);
	$("#editProductSize"+productDetailVal).val(productSize);
	$("#editMeasurementValue"+productDetailVal).val(measurementValue);
	
	
	$(".saveEditProductDetailPopupDataBtn").attr("onclick" , "productDetailEditData("+productDetailVal+")");
}
	function productDetailEditData(productDetailVal){
		productDetailData(productDetailVal);
	$(".brand" + productDetailVal).html($("#editBrand"+productDetailVal).val());
	$(".product" + productDetailVal).html($("#editProduct"+productDetailVal).val());
	$(".productSize" + productDetailVal).html($("#editProductSize"+productDetailVal).val());
	$(".measurementValue" + productDetailVal).html($("#editMeasurementValue"+productDetailVal).val());
	
	
	$(".editBrand").val("");
	$(".editProduct").val("");
	$(".editProductSize").val("");
	$(".editMeasurementValue").val("");
	
}
	function productDetailDeleteData(productDetailValData) {
		deleteProductDetail(productDetailValData)
	  var productDetailCountCounter = $("#productDetailVal").val();
	  $("#productDetailVal").val(productDetailCountCounter - 1);
	  var delRowElement = $(".product-details-row" + productDetailValData); 
	  delRowElement.remove();
	  var j = parseInt(productDetailValData) + 1;
	  // Update the row numbers and IDs for each row
	  for (var i = j; i <= productDetailCountCounter; i++) {
	    var prevCounter = i - 1;
	    var rowElement = $(".product-details-row" + i);
	    // Update the IDs for relevant elementsd
	    rowElement.attr("class", "product-details-row" + prevCounter);
	    rowElement.find("td.brand"+i).removeClass("brand"+i).addClass("brand"+prevCounter);
	    rowElement.find("td.product"+i).removeClass("product"+i).addClass("product"+prevCounter);
	    rowElement.find("td.productSize"+i).removeClass("productSize"+i).addClass("productSize"+prevCounter);
	    rowElement.find("td.measurementValue"+i).removeClass("measurementValue"+i).addClass("measurementValue"+prevCounter);
	    rowElement.find("#productDetailDeleteDataTab").attr('onclick', 'productDetailDeleteData(' +prevCounter+ ')');
	    rowElement.find("#productDetailEditTab").attr('onclick', 'productDetailEditTab(' +prevCounter+ ')');
	  }
}
	 function productDetailData(counter){
  	 	 if(counter!=''){
  		  	 productDetailVal=counter;
		 	 brand = $("#editBrand"+counter).val();
			 product = $("#editProduct"+counter).val();
			 productSize = $("#editProductSize"+counter).val();
			 measurementValue = $("#editMeasurementValue"+counter).val();
		    }else{
	  		 productDetailVal = $("#productDetailVal").val();		
			 brand = $("#brand").val();
			 product = $("#product").val();
			 productSize = $("#productSize").val();
			 measurementValue = $("#measurementValue").val();
    	 }
		factoriesApplicationId=$("#factoriesRegistrationApplicationId").val();
  	 	factoriesProductDetailsAddId=$("#productDetail"+counter).val();
		 $.ajax({
			    type: "POST",
			    url: "${productDetailAddUrl}",
			    data: {
			    	 "<portlet:namespace/>counter": productDetailVal,
			    	 "<portlet:namespace/>brand": brand,
			    	 "<portlet:namespace/>product": product,
			    	 "<portlet:namespace/>productSize": productSize,			    	
			    	 "<portlet:namespace/>measurementValue": measurementValue,			    	
			    	 "<portlet:namespace/>factoriesApplicationId": factoriesApplicationId,
			    	 "<portlet:namespace/>factoriesProductDetailsAddId": factoriesProductDetailsAddId,
			      		    },
			    success: function (data) {
			    	var result=data.APP_DATA;
			    	$("#productDetail"+result["counter"]).val(result["factoriesProductDetailsAddId"]);
		    	},
			    error: function (data) {
			    },
			  });
	}
	 function deleteProductDetail(keyForDelete){
		 productDetail=$("#productDetail"+keyForDelete).val();
		 $.ajax({
				type: "POST",
				url: "${deleteProductDetailUrl}", 
				data: {
					"<portlet:namespace/>productDetail": productDetail,
				},
				success: function (data) {
				},
				error: function (data) {
				}
			});
		}
</script>