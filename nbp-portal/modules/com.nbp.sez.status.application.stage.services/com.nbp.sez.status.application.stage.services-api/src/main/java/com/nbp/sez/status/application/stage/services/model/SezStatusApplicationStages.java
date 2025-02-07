/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the SezStatusApplicationStages service. Represents a row in the &quot;nbp_sez_status_app_stages&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusApplicationStagesModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.sez.status.application.stage.services.model.impl.SezStatusApplicationStagesImpl"
)
@ProviderType
public interface SezStatusApplicationStages
	extends PersistedModel, SezStatusApplicationStagesModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusApplicationStagesImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SezStatusApplicationStages, Long>
		SEZ_STATUS_APPLICATION_STAGES_ID_ACCESSOR =
			new Accessor<SezStatusApplicationStages, Long>() {

				@Override
				public Long get(
					SezStatusApplicationStages sezStatusApplicationStages) {

					return sezStatusApplicationStages.
						getSezStatusApplicationStagesId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<SezStatusApplicationStages> getTypeClass() {
					return SezStatusApplicationStages.class;
				}

			};

}