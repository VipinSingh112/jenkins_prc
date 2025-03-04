/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.nbp.osi.insolvency.application.form.services.model.CompanyTotalLiability;
import com.nbp.osi.insolvency.application.form.services.service.CompanyTotalLiabilityLocalServiceUtil;

/**
 * The extended model base implementation for the CompanyTotalLiability service. Represents a row in the &quot;nbp_osi_insolv_total_liab&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CompanyTotalLiabilityImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CompanyTotalLiabilityImpl
 * @see CompanyTotalLiability
 * @generated
 */
public abstract class CompanyTotalLiabilityBaseImpl
	extends CompanyTotalLiabilityModelImpl implements CompanyTotalLiability {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a company total liability model instance should use the <code>CompanyTotalLiability</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			CompanyTotalLiabilityLocalServiceUtil.addCompanyTotalLiability(
				this);
		}
		else {
			CompanyTotalLiabilityLocalServiceUtil.updateCompanyTotalLiability(
				this);
		}
	}

}