/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.model.impl;

import com.nbp.fire.brigade.application.form.service.model.FireBrigadeMultFloorInfo;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeMultFloorInfoLocalServiceUtil;

/**
 * The extended model base implementation for the FireBrigadeMultFloorInfo service. Represents a row in the &quot;nbp_fire_mul_floor_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FireBrigadeMultFloorInfoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeMultFloorInfoImpl
 * @see FireBrigadeMultFloorInfo
 * @generated
 */
public abstract class FireBrigadeMultFloorInfoBaseImpl
	extends FireBrigadeMultFloorInfoModelImpl
	implements FireBrigadeMultFloorInfo {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a fire brigade mult floor info model instance should use the <code>FireBrigadeMultFloorInfo</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			FireBrigadeMultFloorInfoLocalServiceUtil.
				addFireBrigadeMultFloorInfo(this);
		}
		else {
			FireBrigadeMultFloorInfoLocalServiceUtil.
				updateFireBrigadeMultFloorInfo(this);
		}
	}

}