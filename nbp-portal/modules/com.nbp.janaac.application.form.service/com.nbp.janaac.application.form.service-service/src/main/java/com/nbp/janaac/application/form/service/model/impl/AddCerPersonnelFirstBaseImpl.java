/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.nbp.janaac.application.form.service.model.AddCerPersonnelFirst;
import com.nbp.janaac.application.form.service.service.AddCerPersonnelFirstLocalServiceUtil;

/**
 * The extended model base implementation for the AddCerPersonnelFirst service. Represents a row in the &quot;nbp_janaac_add_cer_per_first&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AddCerPersonnelFirstImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddCerPersonnelFirstImpl
 * @see AddCerPersonnelFirst
 * @generated
 */
public abstract class AddCerPersonnelFirstBaseImpl
	extends AddCerPersonnelFirstModelImpl implements AddCerPersonnelFirst {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a add cer personnel first model instance should use the <code>AddCerPersonnelFirst</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			AddCerPersonnelFirstLocalServiceUtil.addAddCerPersonnelFirst(this);
		}
		else {
			AddCerPersonnelFirstLocalServiceUtil.updateAddCerPersonnelFirst(
				this);
		}
	}

}