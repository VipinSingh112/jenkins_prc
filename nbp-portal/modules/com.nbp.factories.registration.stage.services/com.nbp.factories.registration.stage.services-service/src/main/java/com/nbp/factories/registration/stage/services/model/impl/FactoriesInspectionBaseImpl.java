/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.model.impl;

import com.nbp.factories.registration.stage.services.model.FactoriesInspection;
import com.nbp.factories.registration.stage.services.service.FactoriesInspectionLocalServiceUtil;

/**
 * The extended model base implementation for the FactoriesInspection service. Represents a row in the &quot;nbp_factories_inspection&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FactoriesInspectionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesInspectionImpl
 * @see FactoriesInspection
 * @generated
 */
public abstract class FactoriesInspectionBaseImpl
	extends FactoriesInspectionModelImpl implements FactoriesInspection {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a factories inspection model instance should use the <code>FactoriesInspection</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			FactoriesInspectionLocalServiceUtil.addFactoriesInspection(this);
		}
		else {
			FactoriesInspectionLocalServiceUtil.updateFactoriesInspection(this);
		}
	}

}