/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the QuarryApplicatntInformation service. Represents a row in the &quot;nbp_quarry_applicant_info&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicatntInformationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.quary.application.form.service.model.impl.QuarryApplicatntInformationImpl"
)
@ProviderType
public interface QuarryApplicatntInformation
	extends PersistedModel, QuarryApplicatntInformationModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.quary.application.form.service.model.impl.QuarryApplicatntInformationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<QuarryApplicatntInformation, Long>
		AUARRY_APPLICANT_ID_ACCESSOR =
			new Accessor<QuarryApplicatntInformation, Long>() {

				@Override
				public Long get(
					QuarryApplicatntInformation quarryApplicatntInformation) {

					return quarryApplicatntInformation.getAuarryApplicantId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<QuarryApplicatntInformation> getTypeClass() {
					return QuarryApplicatntInformation.class;
				}

			};

}