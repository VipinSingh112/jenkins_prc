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
 * The extended model interface for the CompanyFinancialPosition service. Represents a row in the &quot;nbp_osi_comp_financial_pos&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CompanyFinancialPositionModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.osi.insolvency.application.form.services.model.impl.CompanyFinancialPositionImpl"
)
@ProviderType
public interface CompanyFinancialPosition
	extends CompanyFinancialPositionModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.osi.insolvency.application.form.services.model.impl.CompanyFinancialPositionImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CompanyFinancialPosition, Long>
		COMPANY_FINANCIAL_POSITION_ID_ACCESSOR =
			new Accessor<CompanyFinancialPosition, Long>() {

				@Override
				public Long get(
					CompanyFinancialPosition companyFinancialPosition) {

					return companyFinancialPosition.
						getCompanyFinancialPositionId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<CompanyFinancialPosition> getTypeClass() {
					return CompanyFinancialPosition.class;
				}

			};

}