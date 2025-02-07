<fieldset class="wizard-fieldset" id="ncraFeePaymentFieldset" name="APPLICATION FEES PAYMENT">
	<section class="application-fees">
		<div class="row">
			<div class="col-md-12">
				<div class="first-heading">
					<h1 class="common-heading">No Fee payment is due upon submission</h1>
				</div>
			</div>
		</div>
		<div class="hide credit-type" id="credit-box">
			<div class="row">
				<div class="col-md-12">
					<p class="common-section-small-heading">What is your Credit Status with the NCRA? Select the most appropriate option below.</p>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-6">
					<div class="application-type-card wizard-card  <%=thirtyDayCreditActive %>">
						<a href="javascript:;" class="d-block">
							<div class="application-type-card-content">
								<p class="application-type-card-title wizard-title f2">30 Days Credit</p>
							</div>
						</a>
					</div>
				</div>
				<div class="col-lg-6">
					<div class="application-type-card wizard-card  <%=paymentUpfrontActive %>">
						<a href="javascript:;" class="d-block">
							<div class="application-type-card-content">
								<p class="application-type-card-title wizard-title f2">Payment Upfront</p>
							</div>
						</a>
					</div>
				</div>
				<input type="hidden" id="ncra-fee-payment-option-value" name="ncra-fee-payment-option-value">
			</div>
		</div>
	</section>
	<%@ include file="/ncra-wizard-buttons.jsp" %>
</fieldset>