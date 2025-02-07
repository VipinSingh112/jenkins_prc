/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the CreativeCompanyApplicantInformation service. Represents a row in the &quot;nbp_creative_com_appli_info&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyApplicantInformationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.creative.application.form.service.model.impl.CreativeCompanyApplicantInformationImpl"
)
@ProviderType
public interface CreativeCompanyApplicantInformation
	extends CreativeCompanyApplicantInformationModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyApplicantInformationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CreativeCompanyApplicantInformation, Long>
		CREATIVE_COMPANY_APPLICANT_INFO_ID_ACCESSOR =
			new Accessor<CreativeCompanyApplicantInformation, Long>() {

				@Override
				public Long get(
					CreativeCompanyApplicantInformation
						creativeCompanyApplicantInformation) {

					return creativeCompanyApplicantInformation.
						getCreativeCompanyApplicantInfoId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<CreativeCompanyApplicantInformation>
					getTypeClass() {

					return CreativeCompanyApplicantInformation.class;
				}

			};

}