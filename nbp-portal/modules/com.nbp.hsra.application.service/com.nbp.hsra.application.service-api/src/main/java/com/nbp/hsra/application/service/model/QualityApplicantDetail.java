/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the QualityApplicantDetail service. Represents a row in the &quot;nbp_hsra_quality_applicant&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see QualityApplicantDetailModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.hsra.application.service.model.impl.QualityApplicantDetailImpl"
)
@ProviderType
public interface QualityApplicantDetail
	extends PersistedModel, QualityApplicantDetailModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.hsra.application.service.model.impl.QualityApplicantDetailImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<QualityApplicantDetail, Long>
		QUALITY_APPLICANT_DETAIL_ID_ACCESSOR =
			new Accessor<QualityApplicantDetail, Long>() {

				@Override
				public Long get(QualityApplicantDetail qualityApplicantDetail) {
					return qualityApplicantDetail.getQualityApplicantDetailId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<QualityApplicantDetail> getTypeClass() {
					return QualityApplicantDetail.class;
				}

			};

}