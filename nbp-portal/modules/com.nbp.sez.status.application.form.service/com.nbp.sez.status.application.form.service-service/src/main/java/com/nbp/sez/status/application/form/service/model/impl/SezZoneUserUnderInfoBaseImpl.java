/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.nbp.sez.status.application.form.service.model.SezZoneUserUnderInfo;
import com.nbp.sez.status.application.form.service.service.SezZoneUserUnderInfoLocalServiceUtil;

/**
 * The extended model base implementation for the SezZoneUserUnderInfo service. Represents a row in the &quot;nbp_sez_zone_user_under_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SezZoneUserUnderInfoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneUserUnderInfoImpl
 * @see SezZoneUserUnderInfo
 * @generated
 */
public abstract class SezZoneUserUnderInfoBaseImpl
	extends SezZoneUserUnderInfoModelImpl implements SezZoneUserUnderInfo {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sez zone user under info model instance should use the <code>SezZoneUserUnderInfo</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			SezZoneUserUnderInfoLocalServiceUtil.addSezZoneUserUnderInfo(this);
		}
		else {
			SezZoneUserUnderInfoLocalServiceUtil.updateSezZoneUserUnderInfo(
				this);
		}
	}

}