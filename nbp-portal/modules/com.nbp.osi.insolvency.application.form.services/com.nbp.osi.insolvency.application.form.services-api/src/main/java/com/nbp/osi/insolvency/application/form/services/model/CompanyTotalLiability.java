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
 * The extended model interface for the CompanyTotalLiability service. Represents a row in the &quot;nbp_osi_insolv_total_liab&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CompanyTotalLiabilityModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.osi.insolvency.application.form.services.model.impl.CompanyTotalLiabilityImpl"
)
@ProviderType
public interface CompanyTotalLiability
	extends CompanyTotalLiabilityModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.osi.insolvency.application.form.services.model.impl.CompanyTotalLiabilityImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CompanyTotalLiability, Long>
		COMPANY_TOTAL_LIABILITY_ID_ACCESSOR =
			new Accessor<CompanyTotalLiability, Long>() {

				@Override
				public Long get(CompanyTotalLiability companyTotalLiability) {
					return companyTotalLiability.getCompanyTotalLiabilityId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<CompanyTotalLiability> getTypeClass() {
					return CompanyTotalLiability.class;
				}

			};

}