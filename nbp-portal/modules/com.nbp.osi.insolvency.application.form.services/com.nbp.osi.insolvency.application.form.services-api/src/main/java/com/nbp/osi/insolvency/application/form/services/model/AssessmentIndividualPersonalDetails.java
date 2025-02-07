/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AssessmentIndividualPersonalDetails service. Represents a row in the &quot;nbp_osi_assessment_detail&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AssessmentIndividualPersonalDetailsModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.osi.insolvency.application.form.services.model.impl.AssessmentIndividualPersonalDetailsImpl"
)
@ProviderType
public interface AssessmentIndividualPersonalDetails
	extends AssessmentIndividualPersonalDetailsModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.osi.insolvency.application.form.services.model.impl.AssessmentIndividualPersonalDetailsImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AssessmentIndividualPersonalDetails, Long>
		ASSESSMENT_DETAILS_ID_ACCESSOR =
			new Accessor<AssessmentIndividualPersonalDetails, Long>() {

				@Override
				public Long get(
					AssessmentIndividualPersonalDetails
						assessmentIndividualPersonalDetails) {

					return assessmentIndividualPersonalDetails.
						getAssessmentDetailsId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AssessmentIndividualPersonalDetails>
					getTypeClass() {

					return AssessmentIndividualPersonalDetails.class;
				}

			};

}