/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the FactoriesRegstCurrentStage service. Represents a row in the &quot;nbp_factories_current_stage&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesRegstCurrentStageModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.factories.registration.application.form.services.model.impl.FactoriesRegstCurrentStageImpl"
)
@ProviderType
public interface FactoriesRegstCurrentStage
	extends FactoriesRegstCurrentStageModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesRegstCurrentStageImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<FactoriesRegstCurrentStage, Long>
		FACTORIES_CURRENT_STAGE_ID_ACCESSOR =
			new Accessor<FactoriesRegstCurrentStage, Long>() {

				@Override
				public Long get(
					FactoriesRegstCurrentStage factoriesRegstCurrentStage) {

					return factoriesRegstCurrentStage.
						getFactoriesCurrentStageId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<FactoriesRegstCurrentStage> getTypeClass() {
					return FactoriesRegstCurrentStage.class;
				}

			};

}