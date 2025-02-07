package com.agriculture.remote.services.internal.resource.v1_0;

import com.agriculture.application.form.service.exception.NoSuchAgricultureApplicationException;
import com.agriculture.application.form.service.model.AgricultureApplication;
import com.agriculture.application.form.service.service.AgricultureApplicationLocalServiceUtil;
import com.agriculture.remote.services.dto.v1_0.AgricultureApplicationInspection;
import com.agriculture.remote.services.resource.v1_0.AgricultureApplicationInspectionResource;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.agriculture.stages.services.exception.NoSuchAgricultureInspectionException;
import com.nbp.agriculture.stages.services.service.AgricultureInspectionLocalService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author Yogesh Chandra
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/agriculture-application-inspection.properties",
	scope = ServiceScope.PROTOTYPE,
	service = AgricultureApplicationInspectionResource.class
)
public class AgricultureApplicationInspectionResourceImpl
	extends BaseAgricultureApplicationInspectionResourceImpl {
	@Override
	public AgricultureApplicationInspection updateAgricultureApplicationInspection(
			AgricultureApplicationInspection agricultureApplicationInspection) throws Exception {
		AgricultureApplication agricultureApplication=null;
		try {
			agricultureApplication= AgricultureApplicationLocalServiceUtil.getAgricultureBy_CI(agricultureApplicationInspection.getCaseId());
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (Validator.isNotNull(agricultureApplication)) {
			com.nbp.agriculture.stages.services.model.AgricultureInspection agriInspection=_agricultureInspectionLocalService.updateAgricultureInspection(agricultureApplicationInspection.getCaseId(), agricultureApplicationInspection.getDateofInspection());
			return _toAgricultureApplicationInspection(agriInspection);
		}else {
			throw  new Exception("Case Id Not Exist");
		}
	}
	protected AgricultureApplicationInspection _toAgricultureApplicationInspection(com.nbp.agriculture.stages.services.model.AgricultureInspection agriculturePermit) {
		return new AgricultureApplicationInspection() {{
			caseId=agriculturePermit.getCaseId();
		}};
	}
	@Reference
	AgricultureInspectionLocalService _agricultureInspectionLocalService;
}