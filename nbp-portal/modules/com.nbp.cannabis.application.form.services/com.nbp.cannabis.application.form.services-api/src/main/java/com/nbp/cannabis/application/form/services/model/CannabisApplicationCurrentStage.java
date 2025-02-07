/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the CannabisApplicationCurrentStage service. Represents a row in the &quot;nbp_cannabis_stage&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationCurrentStageModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCurrentStageImpl"
)
@ProviderType
public interface CannabisApplicationCurrentStage
	extends CannabisApplicationCurrentStageModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationCurrentStageImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CannabisApplicationCurrentStage, Long>
		CANNABIS_STAGE_ID_ACCESSOR =
			new Accessor<CannabisApplicationCurrentStage, Long>() {

				@Override
				public Long get(
					CannabisApplicationCurrentStage
						cannabisApplicationCurrentStage) {

					return cannabisApplicationCurrentStage.getCannabisStageId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<CannabisApplicationCurrentStage> getTypeClass() {
					return CannabisApplicationCurrentStage.class;
				}

			};

}