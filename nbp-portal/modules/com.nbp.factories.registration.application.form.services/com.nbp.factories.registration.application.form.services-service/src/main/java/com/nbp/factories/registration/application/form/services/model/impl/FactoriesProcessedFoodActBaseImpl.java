/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.model.impl;

import com.nbp.factories.registration.application.form.services.model.FactoriesProcessedFoodAct;
import com.nbp.factories.registration.application.form.services.service.FactoriesProcessedFoodActLocalServiceUtil;

/**
 * The extended model base implementation for the FactoriesProcessedFoodAct service. Represents a row in the &quot;nbp_factories_pro_food_act&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FactoriesProcessedFoodActImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesProcessedFoodActImpl
 * @see FactoriesProcessedFoodAct
 * @generated
 */
public abstract class FactoriesProcessedFoodActBaseImpl
	extends FactoriesProcessedFoodActModelImpl
	implements FactoriesProcessedFoodAct {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a factories processed food act model instance should use the <code>FactoriesProcessedFoodAct</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			FactoriesProcessedFoodActLocalServiceUtil.
				addFactoriesProcessedFoodAct(this);
		}
		else {
			FactoriesProcessedFoodActLocalServiceUtil.
				updateFactoriesProcessedFoodAct(this);
		}
	}

}