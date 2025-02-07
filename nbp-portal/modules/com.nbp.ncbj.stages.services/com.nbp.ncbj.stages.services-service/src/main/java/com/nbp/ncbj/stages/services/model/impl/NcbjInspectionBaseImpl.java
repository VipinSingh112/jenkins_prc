/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.model.impl;

import com.nbp.ncbj.stages.services.model.NcbjInspection;
import com.nbp.ncbj.stages.services.service.NcbjInspectionLocalServiceUtil;

/**
 * The extended model base implementation for the NcbjInspection service. Represents a row in the &quot;nbp_ncbj_inspection&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link NcbjInspectionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjInspectionImpl
 * @see NcbjInspection
 * @generated
 */
public abstract class NcbjInspectionBaseImpl
	extends NcbjInspectionModelImpl implements NcbjInspection {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a ncbj inspection model instance should use the <code>NcbjInspection</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			NcbjInspectionLocalServiceUtil.addNcbjInspection(this);
		}
		else {
			NcbjInspectionLocalServiceUtil.updateNcbjInspection(this);
		}
	}

}