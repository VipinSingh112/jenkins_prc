/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the ExplosiveApplicationStages service. Represents a row in the &quot;nbp_explosive_app_stages&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveApplicationStagesModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.explosives.competency.stages.service.model.impl.ExplosiveApplicationStagesImpl"
)
@ProviderType
public interface ExplosiveApplicationStages
	extends ExplosiveApplicationStagesModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveApplicationStagesImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ExplosiveApplicationStages, Long>
		EXP_APPLICATION_STAGES_ID_ACCESSOR =
			new Accessor<ExplosiveApplicationStages, Long>() {

				@Override
				public Long get(
					ExplosiveApplicationStages explosiveApplicationStages) {

					return explosiveApplicationStages.
						getExpApplicationStagesId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<ExplosiveApplicationStages> getTypeClass() {
					return ExplosiveApplicationStages.class;
				}

			};

}