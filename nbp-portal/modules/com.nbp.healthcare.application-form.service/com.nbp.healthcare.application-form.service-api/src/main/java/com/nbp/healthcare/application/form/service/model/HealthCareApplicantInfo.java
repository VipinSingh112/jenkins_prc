/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the HealthCareApplicantInfo service. Represents a row in the &quot;nbp_healthcare_applicant&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareApplicantInfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.healthcare.application.form.service.model.impl.HealthCareApplicantInfoImpl"
)
@ProviderType
public interface HealthCareApplicantInfo
	extends HealthCareApplicantInfoModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareApplicantInfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<HealthCareApplicantInfo, Long>
		HEALTH_CARE_APPLICANT_INFO_ID_ACCESSOR =
			new Accessor<HealthCareApplicantInfo, Long>() {

				@Override
				public Long get(
					HealthCareApplicantInfo healthCareApplicantInfo) {

					return healthCareApplicantInfo.
						getHealthCareApplicantInfoId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<HealthCareApplicantInfo> getTypeClass() {
					return HealthCareApplicantInfo.class;
				}

			};

}