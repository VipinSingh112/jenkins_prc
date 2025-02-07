/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the EducationalQualification service. Represents a row in the &quot;nbp_osi_education_details&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see EducationalQualificationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.osi.application.form.services.model.impl.EducationalQualificationImpl"
)
@ProviderType
public interface EducationalQualification
	extends EducationalQualificationModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.osi.application.form.services.model.impl.EducationalQualificationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<EducationalQualification, Long>
		EDUCATIONAL_DETAIL_ID_ACCESSOR =
			new Accessor<EducationalQualification, Long>() {

				@Override
				public Long get(
					EducationalQualification educationalQualification) {

					return educationalQualification.getEducationalDetailId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<EducationalQualification> getTypeClass() {
					return EducationalQualification.class;
				}

			};

}