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
 * The extended model interface for the SezStatusWFHApplicationStages service. Represents a row in the &quot;nbp_sez_status_wfh_app_stages&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusWFHApplicationStagesModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.sez.status.application.stage.services.model.impl.SezStatusWFHApplicationStagesImpl"
)
@ProviderType
public interface SezStatusWFHApplicationStages
	extends PersistedModel, SezStatusWFHApplicationStagesModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusWFHApplicationStagesImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SezStatusWFHApplicationStages, Long>
		SEZ_WFH_APP_STAGES_ID_ACCESSOR =
			new Accessor<SezStatusWFHApplicationStages, Long>() {

				@Override
				public Long get(
					SezStatusWFHApplicationStages
						sezStatusWFHApplicationStages) {

					return sezStatusWFHApplicationStages.getSezWFHAppStagesId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<SezStatusWFHApplicationStages> getTypeClass() {
					return SezStatusWFHApplicationStages.class;
				}

			};

}