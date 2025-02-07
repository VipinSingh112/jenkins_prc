/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model.impl;

import com.nbp.creative.application.form.service.model.CreativeCompanyApplicantInformation;
import com.nbp.creative.application.form.service.service.CreativeCompanyApplicantInformationLocalServiceUtil;

/**
 * The extended model base implementation for the CreativeCompanyApplicantInformation service. Represents a row in the &quot;nbp_creative_com_appli_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CreativeCompanyApplicantInformationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyApplicantInformationImpl
 * @see CreativeCompanyApplicantInformation
 * @generated
 */
public abstract class CreativeCompanyApplicantInformationBaseImpl
	extends CreativeCompanyApplicantInformationModelImpl
	implements CreativeCompanyApplicantInformation {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a creative company applicant information model instance should use the <code>CreativeCompanyApplicantInformation</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			CreativeCompanyApplicantInformationLocalServiceUtil.
				addCreativeCompanyApplicantInformation(this);
		}
		else {
			CreativeCompanyApplicantInformationLocalServiceUtil.
				updateCreativeCompanyApplicantInformation(this);
		}
	}

}