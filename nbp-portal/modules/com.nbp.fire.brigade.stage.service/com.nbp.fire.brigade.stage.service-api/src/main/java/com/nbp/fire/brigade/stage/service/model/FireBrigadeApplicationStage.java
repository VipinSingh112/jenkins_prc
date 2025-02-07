/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the FireBrigadeApplicationStage service. Represents a row in the &quot;nbp_fire_brigade_app_stage&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeApplicationStageModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeApplicationStageImpl"
)
@ProviderType
public interface FireBrigadeApplicationStage
	extends FireBrigadeApplicationStageModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeApplicationStageImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<FireBrigadeApplicationStage, Long>
		FIRE_BRIGADE_APP_STAGE_ID_ACCESSOR =
			new Accessor<FireBrigadeApplicationStage, Long>() {

				@Override
				public Long get(
					FireBrigadeApplicationStage fireBrigadeApplicationStage) {

					return fireBrigadeApplicationStage.
						getFireBrigadeAppStageId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<FireBrigadeApplicationStage> getTypeClass() {
					return FireBrigadeApplicationStage.class;
				}

			};

}