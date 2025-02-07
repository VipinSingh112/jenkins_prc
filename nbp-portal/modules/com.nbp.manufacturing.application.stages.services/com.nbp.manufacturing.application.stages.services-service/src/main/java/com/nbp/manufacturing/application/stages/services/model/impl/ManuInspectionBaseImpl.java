/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.model.impl;

import com.nbp.manufacturing.application.stages.services.model.ManuInspection;
import com.nbp.manufacturing.application.stages.services.service.ManuInspectionLocalServiceUtil;

/**
 * The extended model base implementation for the ManuInspection service. Represents a row in the &quot;nbp_manufacturing_inspec&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ManuInspectionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuInspectionImpl
 * @see ManuInspection
 * @generated
 */
public abstract class ManuInspectionBaseImpl
	extends ManuInspectionModelImpl implements ManuInspection {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a manu inspection model instance should use the <code>ManuInspection</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			ManuInspectionLocalServiceUtil.addManuInspection(this);
		}
		else {
			ManuInspectionLocalServiceUtil.updateManuInspection(this);
		}
	}

}