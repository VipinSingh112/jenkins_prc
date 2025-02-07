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
 * The extended model interface for the OsiAssessmentSignature service. Represents a row in the &quot;nbp_osi_insolvecy_asses_sign&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OsiAssessmentSignatureModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.osi.insolvency.application.form.services.model.impl.OsiAssessmentSignatureImpl"
)
@ProviderType
public interface OsiAssessmentSignature
	extends OsiAssessmentSignatureModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiAssessmentSignatureImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<OsiAssessmentSignature, Long>
		OSI_ASSESSMENT_SIGNATURE_ID_ACCESSOR =
			new Accessor<OsiAssessmentSignature, Long>() {

				@Override
				public Long get(OsiAssessmentSignature osiAssessmentSignature) {
					return osiAssessmentSignature.getOsiAssessmentSignatureId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<OsiAssessmentSignature> getTypeClass() {
					return OsiAssessmentSignature.class;
				}

			};

}