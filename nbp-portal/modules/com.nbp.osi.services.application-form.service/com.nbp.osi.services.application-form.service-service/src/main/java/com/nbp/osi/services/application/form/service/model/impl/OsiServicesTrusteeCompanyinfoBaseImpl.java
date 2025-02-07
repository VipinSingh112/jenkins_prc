/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model.impl;

import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeCompanyinfo;
import com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeCompanyinfoLocalServiceUtil;

/**
 * The extended model base implementation for the OsiServicesTrusteeCompanyinfo service. Represents a row in the &quot;nbp_osi_services_trus_co_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OsiServicesTrusteeCompanyinfoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeCompanyinfoImpl
 * @see OsiServicesTrusteeCompanyinfo
 * @generated
 */
public abstract class OsiServicesTrusteeCompanyinfoBaseImpl
	extends OsiServicesTrusteeCompanyinfoModelImpl
	implements OsiServicesTrusteeCompanyinfo {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a osi services trustee companyinfo model instance should use the <code>OsiServicesTrusteeCompanyinfo</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			OsiServicesTrusteeCompanyinfoLocalServiceUtil.
				addOsiServicesTrusteeCompanyinfo(this);
		}
		else {
			OsiServicesTrusteeCompanyinfoLocalServiceUtil.
				updateOsiServicesTrusteeCompanyinfo(this);
		}
	}

}