/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AgriApplicationCurrentStage service. Represents a row in the &quot;nbp_agriculture_stage&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AgriApplicationCurrentStageModel
 * @generated
 */
@ImplementationClassName(
	"com.agriculture.application.form.service.model.impl.AgriApplicationCurrentStageImpl"
)
@ProviderType
public interface AgriApplicationCurrentStage
	extends AgriApplicationCurrentStageModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.agriculture.application.form.service.model.impl.AgriApplicationCurrentStageImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AgriApplicationCurrentStage, Long>
		AGRI_APPLICATION_CURRENT_STAGE_ID_ACCESSOR =
			new Accessor<AgriApplicationCurrentStage, Long>() {

				@Override
				public Long get(
					AgriApplicationCurrentStage agriApplicationCurrentStage) {

					return agriApplicationCurrentStage.
						getAgriApplicationCurrentStageId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AgriApplicationCurrentStage> getTypeClass() {
					return AgriApplicationCurrentStage.class;
				}

			};

}