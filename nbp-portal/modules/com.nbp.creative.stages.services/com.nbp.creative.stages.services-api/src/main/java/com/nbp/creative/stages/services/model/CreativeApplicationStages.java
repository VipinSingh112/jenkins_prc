/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the CreativeApplicationStages service. Represents a row in the &quot;nbp_creative_app_stages&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeApplicationStagesModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.creative.stages.services.model.impl.CreativeApplicationStagesImpl"
)
@ProviderType
public interface CreativeApplicationStages
	extends CreativeApplicationStagesModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.creative.stages.services.model.impl.CreativeApplicationStagesImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CreativeApplicationStages, Long>
		CREATIVE_APPLICATION_STAGES_ID_ACCESSOR =
			new Accessor<CreativeApplicationStages, Long>() {

				@Override
				public Long get(
					CreativeApplicationStages creativeApplicationStages) {

					return creativeApplicationStages.
						getCreativeApplicationStagesId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<CreativeApplicationStages> getTypeClass() {
					return CreativeApplicationStages.class;
				}

			};

}