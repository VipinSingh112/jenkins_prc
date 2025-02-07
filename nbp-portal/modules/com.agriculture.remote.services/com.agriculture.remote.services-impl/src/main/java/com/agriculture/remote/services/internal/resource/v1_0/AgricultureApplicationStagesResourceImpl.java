package com.agriculture.remote.services.internal.resource.v1_0;

import com.agriculture.application.form.service.exception.NoSuchAgriApplicationCurrentStageException;
import com.agriculture.application.form.service.model.AgricultureApplication;
import com.agriculture.application.form.service.service.AgricultureApplicationLocalServiceUtil;
import com.agriculture.remote.services.dto.v1_0.AgricultureApplicationStages;
import com.agriculture.remote.services.resource.v1_0.AgricultureApplicationStagesResource;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.agriculture.stages.services.constants.AgricultureStagesConstants;
import com.nbp.agriculture.stages.services.service.AgricultureApplicationStagesLocalService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author Yogesh Chandra
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/agriculture-application-stages.properties",
	scope = ServiceScope.PROTOTYPE,
	service = AgricultureApplicationStagesResource.class
)
public class AgricultureApplicationStagesResourceImpl
	extends BaseAgricultureApplicationStagesResourceImpl {
	
	@Override
		public AgricultureApplicationStages updateAgricultureApplicationStage(
				AgricultureApplicationStages agricultureApplicationStages) throws Exception {
		AgricultureApplication agricultureApplication=null;
		try {
			agricultureApplication=AgricultureApplicationLocalServiceUtil.getAgricultureBy_CI(agricultureApplicationStages.getCaseId());
			
		}catch (Exception e) {
		}
		if(Validator.isNotNull(agricultureApplication)){
		com.nbp.agriculture.stages.services.model.AgricultureApplicationStages applicationStages =null;
		agricultureApplication.setAppCurrentStageName(_toStageName(agricultureApplicationStages.getStageName()));
		AgricultureApplicationLocalServiceUtil.updateAgricultureApplication(agricultureApplication);
		applicationStages=_agricultureApplicationStagesLocalService.updateAgricultureStages(agricultureApplicationStages.getCaseId(), _toStageName(agricultureApplicationStages.getStageName()), agricultureApplicationStages.getStageStartDate(), agricultureApplicationStages.getStageEndDate(), agricultureApplicationStages.getDuration(),_toStatus(agricultureApplicationStages.getStatus()));
		return _toPharmaApplicationStages(applicationStages);
		}else {
			throw new NoSuchAgriApplicationCurrentStageException("Case Id Not Exist");
		}
		}
	
	protected AgricultureApplicationStages _toPharmaApplicationStages(
			com.nbp.agriculture.stages.services.model.AgricultureApplicationStages pv) throws Exception {
		return new AgricultureApplicationStages() {
			{
				caseId:pv.getCaseId();
			}
		};
	}
	protected String _toStatus(final AgricultureApplicationStages.Status status) {
		switch (status) {
		case OPEN:
			return AgricultureStagesConstants.OPEN;
		case IN_PROGRESS:
			return AgricultureStagesConstants.IN_PROGRESS;
		case ON_HOLD:
			return AgricultureStagesConstants.ON_HOLD;
		case CLOSED:
			return AgricultureStagesConstants.CLOSED;

		}
		return null;
	}

	protected String _toStageName(final AgricultureApplicationStages.StageName stageName) {
		
		switch (stageName) {
		case DATA_VERIFICATION:
			return AgricultureStagesConstants.DATA_VERIFICATION;
		case REFERRAL_TO_JCA:
			return AgricultureStagesConstants.REFERRAL_TO_JCA;
		case INSPECTION_RADA:
			return AgricultureStagesConstants.INSPECTION_RADA;
		case JCA_RECOMMENDATIONS:
			return AgricultureStagesConstants.JCA_RECOMMENDATIONS;
		case ISSUANCE_OF_PERMIT_EXEMPTION_CERTIFICATE_OR_REFUSAL_LETTER:
			return AgricultureStagesConstants.ISSUANCE_OF_PERMIT_EXEMPTION_CERTIFICATE_OR_REFUSAL_LETTER;

		}
		return null;
	}
	@Reference
	AgricultureApplicationStagesLocalService _agricultureApplicationStagesLocalService;
}