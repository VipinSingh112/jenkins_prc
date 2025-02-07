/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the HsraApplicationStages service. Represents a row in the &quot;nbp_hsra_application_stage&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplicationStagesModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.hsra.stage.services.model.impl.HsraApplicationStagesImpl"
)
@ProviderType
public interface HsraApplicationStages
	extends HsraApplicationStagesModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.hsra.stage.services.model.impl.HsraApplicationStagesImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<HsraApplicationStages, Long>
		HSRA_APPLICATION_STAGES_ID_ACCESSOR =
			new Accessor<HsraApplicationStages, Long>() {

				@Override
				public Long get(HsraApplicationStages hsraApplicationStages) {
					return hsraApplicationStages.getHsraApplicationStagesId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<HsraApplicationStages> getTypeClass() {
					return HsraApplicationStages.class;
				}

			};

}