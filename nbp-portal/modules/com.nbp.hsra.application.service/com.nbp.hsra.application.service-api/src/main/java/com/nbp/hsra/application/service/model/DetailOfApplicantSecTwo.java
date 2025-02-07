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
 * The extended model interface for the DetailOfApplicantSecTwo service. Represents a row in the &quot;nbp_hsra_detail_applicant&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfApplicantSecTwoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.hsra.application.service.model.impl.DetailOfApplicantSecTwoImpl"
)
@ProviderType
public interface DetailOfApplicantSecTwo
	extends DetailOfApplicantSecTwoModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.hsra.application.service.model.impl.DetailOfApplicantSecTwoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<DetailOfApplicantSecTwo, Long>
		DETAIL_OF_APPLI_SEC_TWO_ID_ACCESSOR =
			new Accessor<DetailOfApplicantSecTwo, Long>() {

				@Override
				public Long get(
					DetailOfApplicantSecTwo detailOfApplicantSecTwo) {

					return detailOfApplicantSecTwo.getDetailOfAppliSecTwoId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<DetailOfApplicantSecTwo> getTypeClass() {
					return DetailOfApplicantSecTwo.class;
				}

			};

}