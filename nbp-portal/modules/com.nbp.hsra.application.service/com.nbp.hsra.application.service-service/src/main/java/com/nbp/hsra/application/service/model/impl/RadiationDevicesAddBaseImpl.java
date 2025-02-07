/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.nbp.hsra.application.service.model.RadiationDevicesAdd;
import com.nbp.hsra.application.service.service.RadiationDevicesAddLocalServiceUtil;

/**
 * The extended model base implementation for the RadiationDevicesAdd service. Represents a row in the &quot;nbp_hsra_radiation_dev&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RadiationDevicesAddImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RadiationDevicesAddImpl
 * @see RadiationDevicesAdd
 * @generated
 */
public abstract class RadiationDevicesAddBaseImpl
	extends RadiationDevicesAddModelImpl implements RadiationDevicesAdd {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a radiation devices add model instance should use the <code>RadiationDevicesAdd</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			RadiationDevicesAddLocalServiceUtil.addRadiationDevicesAdd(this);
		}
		else {
			RadiationDevicesAddLocalServiceUtil.updateRadiationDevicesAdd(this);
		}
	}

}