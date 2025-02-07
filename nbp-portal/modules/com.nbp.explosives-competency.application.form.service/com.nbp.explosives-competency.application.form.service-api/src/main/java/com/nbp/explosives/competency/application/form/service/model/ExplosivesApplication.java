/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the ExplosivesApplication service. Represents a row in the &quot;nbp_explosives_application&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosivesApplicationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.explosives.competency.application.form.service.model.impl.ExplosivesApplicationImpl"
)
@ProviderType
public interface ExplosivesApplication
	extends ExplosivesApplicationModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.explosives.competency.application.form.service.model.impl.ExplosivesApplicationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ExplosivesApplication, Long>
		EXPLOSIVES_APPLICATION_ID_ACCESSOR =
			new Accessor<ExplosivesApplication, Long>() {

				@Override
				public Long get(ExplosivesApplication explosivesApplication) {
					return explosivesApplication.getExplosivesApplicationId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<ExplosivesApplication> getTypeClass() {
					return ExplosivesApplication.class;
				}

			};

}