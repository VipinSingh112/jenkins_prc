/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the FactoriesApplicationStage service. Represents a row in the &quot;nbp_factories_app_stage&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesApplicationStageModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.factories.registration.stage.services.model.impl.FactoriesApplicationStageImpl"
)
@ProviderType
public interface FactoriesApplicationStage
	extends FactoriesApplicationStageModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.factories.registration.stage.services.model.impl.FactoriesApplicationStageImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<FactoriesApplicationStage, Long>
		FACTORIES_APPLICATION_STAGE_ID_ACCESSOR =
			new Accessor<FactoriesApplicationStage, Long>() {

				@Override
				public Long get(
					FactoriesApplicationStage factoriesApplicationStage) {

					return factoriesApplicationStage.
						getFactoriesApplicationStageId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<FactoriesApplicationStage> getTypeClass() {
					return FactoriesApplicationStage.class;
				}

			};

}