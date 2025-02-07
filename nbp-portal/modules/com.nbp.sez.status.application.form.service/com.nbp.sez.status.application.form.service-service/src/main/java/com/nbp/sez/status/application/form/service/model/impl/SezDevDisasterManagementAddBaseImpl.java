/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.nbp.sez.status.application.form.service.model.SezDevDisasterManagementAdd;
import com.nbp.sez.status.application.form.service.service.SezDevDisasterManagementAddLocalServiceUtil;

/**
 * The extended model base implementation for the SezDevDisasterManagementAdd service. Represents a row in the &quot;nbp_sez_dev_disast_manag_add&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SezDevDisasterManagementAddImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevDisasterManagementAddImpl
 * @see SezDevDisasterManagementAdd
 * @generated
 */
public abstract class SezDevDisasterManagementAddBaseImpl
	extends SezDevDisasterManagementAddModelImpl
	implements SezDevDisasterManagementAdd {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sez dev disaster management add model instance should use the <code>SezDevDisasterManagementAdd</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			SezDevDisasterManagementAddLocalServiceUtil.
				addSezDevDisasterManagementAdd(this);
		}
		else {
			SezDevDisasterManagementAddLocalServiceUtil.
				updateSezDevDisasterManagementAdd(this);
		}
	}

}