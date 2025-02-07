/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.model.impl;

import com.nbp.explosives.competency.application.form.service.model.ExplosivesApplication;
import com.nbp.explosives.competency.application.form.service.service.ExplosivesApplicationLocalServiceUtil;

/**
 * The extended model base implementation for the ExplosivesApplication service. Represents a row in the &quot;nbp_explosives_application&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ExplosivesApplicationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExplosivesApplicationImpl
 * @see ExplosivesApplication
 * @generated
 */
public abstract class ExplosivesApplicationBaseImpl
	extends ExplosivesApplicationModelImpl implements ExplosivesApplication {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a explosives application model instance should use the <code>ExplosivesApplication</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			ExplosivesApplicationLocalServiceUtil.addExplosivesApplication(
				this);
		}
		else {
			ExplosivesApplicationLocalServiceUtil.updateExplosivesApplication(
				this);
		}
	}

}