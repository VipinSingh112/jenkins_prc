/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.nbp.osi.insolvency.application.form.services.model.OsiComSecurityTotal;
import com.nbp.osi.insolvency.application.form.services.service.OsiComSecurityTotalLocalServiceUtil;

/**
 * The extended model base implementation for the OsiComSecurityTotal service. Represents a row in the &quot;nbp_insolv_com_security_tot&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OsiComSecurityTotalImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiComSecurityTotalImpl
 * @see OsiComSecurityTotal
 * @generated
 */
public abstract class OsiComSecurityTotalBaseImpl
	extends OsiComSecurityTotalModelImpl implements OsiComSecurityTotal {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a osi com security total model instance should use the <code>OsiComSecurityTotal</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			OsiComSecurityTotalLocalServiceUtil.addOsiComSecurityTotal(this);
		}
		else {
			OsiComSecurityTotalLocalServiceUtil.updateOsiComSecurityTotal(this);
		}
	}

}