/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.nbp.janaac.application.form.service.model.AddFdaPersonnelThird;
import com.nbp.janaac.application.form.service.service.AddFdaPersonnelThirdLocalServiceUtil;

/**
 * The extended model base implementation for the AddFdaPersonnelThird service. Represents a row in the &quot;nbp_janaac_add_fda_per_third&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AddFdaPersonnelThirdImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaPersonnelThirdImpl
 * @see AddFdaPersonnelThird
 * @generated
 */
public abstract class AddFdaPersonnelThirdBaseImpl
	extends AddFdaPersonnelThirdModelImpl implements AddFdaPersonnelThird {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a add fda personnel third model instance should use the <code>AddFdaPersonnelThird</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			AddFdaPersonnelThirdLocalServiceUtil.addAddFdaPersonnelThird(this);
		}
		else {
			AddFdaPersonnelThirdLocalServiceUtil.updateAddFdaPersonnelThird(
				this);
		}
	}

}