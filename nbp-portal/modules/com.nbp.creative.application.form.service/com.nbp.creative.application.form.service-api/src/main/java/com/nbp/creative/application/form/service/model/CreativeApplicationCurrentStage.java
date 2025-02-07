/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the CreativeApplicationCurrentStage service. Represents a row in the &quot;nbp_creative_current_stage&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeApplicationCurrentStageModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.creative.application.form.service.model.impl.CreativeApplicationCurrentStageImpl"
)
@ProviderType
public interface CreativeApplicationCurrentStage
	extends CreativeApplicationCurrentStageModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.creative.application.form.service.model.impl.CreativeApplicationCurrentStageImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CreativeApplicationCurrentStage, Long>
		CREATIVE_APPLI_CURRENT_STAGE_ID_ACCESSOR =
			new Accessor<CreativeApplicationCurrentStage, Long>() {

				@Override
				public Long get(
					CreativeApplicationCurrentStage
						creativeApplicationCurrentStage) {

					return creativeApplicationCurrentStage.
						getCreativeAppliCurrentStageId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<CreativeApplicationCurrentStage> getTypeClass() {
					return CreativeApplicationCurrentStage.class;
				}

			};

}