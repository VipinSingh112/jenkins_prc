/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.model.impl;

import com.nbp.factories.registration.application.form.services.model.FactoriesApplicationRegistration;
import com.nbp.factories.registration.application.form.services.service.FactoriesApplicationRegistrationLocalServiceUtil;

/**
 * The extended model base implementation for the FactoriesApplicationRegistration service. Represents a row in the &quot;nbp_factories_application&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FactoriesApplicationRegistrationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesApplicationRegistrationImpl
 * @see FactoriesApplicationRegistration
 * @generated
 */
public abstract class FactoriesApplicationRegistrationBaseImpl
	extends FactoriesApplicationRegistrationModelImpl
	implements FactoriesApplicationRegistration {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a factories application registration model instance should use the <code>FactoriesApplicationRegistration</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			FactoriesApplicationRegistrationLocalServiceUtil.
				addFactoriesApplicationRegistration(this);
		}
		else {
			FactoriesApplicationRegistrationLocalServiceUtil.
				updateFactoriesApplicationRegistration(this);
		}
	}

}