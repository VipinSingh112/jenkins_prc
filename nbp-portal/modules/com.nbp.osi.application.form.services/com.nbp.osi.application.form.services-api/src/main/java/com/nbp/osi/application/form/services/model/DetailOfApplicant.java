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
 * The extended model interface for the DetailOfApplicant service. Represents a row in the &quot;nbp_osi_applicant_details&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfApplicantModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.osi.application.form.services.model.impl.DetailOfApplicantImpl"
)
@ProviderType
public interface DetailOfApplicant
	extends DetailOfApplicantModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.osi.application.form.services.model.impl.DetailOfApplicantImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<DetailOfApplicant, Long>
		DETAIL_OF_APPLICANT_ID_ACCESSOR =
			new Accessor<DetailOfApplicant, Long>() {

				@Override
				public Long get(DetailOfApplicant detailOfApplicant) {
					return detailOfApplicant.getDetailOfApplicantId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<DetailOfApplicant> getTypeClass() {
					return DetailOfApplicant.class;
				}

			};

}