/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AgricultureApplicationStages service. Represents a row in the &quot;nbp_agriculture_app_stages&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureApplicationStagesModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.agriculture.stages.services.model.impl.AgricultureApplicationStagesImpl"
)
@ProviderType
public interface AgricultureApplicationStages
	extends AgricultureApplicationStagesModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.agriculture.stages.services.model.impl.AgricultureApplicationStagesImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AgricultureApplicationStages, Long>
		AGRICULTURE_APPLICATIONSTAGE_ID_ACCESSOR =
			new Accessor<AgricultureApplicationStages, Long>() {

				@Override
				public Long get(
					AgricultureApplicationStages agricultureApplicationStages) {

					return agricultureApplicationStages.
						getAgricultureApplicationstageId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AgricultureApplicationStages> getTypeClass() {
					return AgricultureApplicationStages.class;
				}

			};

}