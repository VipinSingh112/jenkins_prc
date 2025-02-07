/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the MiningApplicationStages service. Represents a row in the &quot;nbp_mining_app_stage&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationStagesModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.mining.stage.service.model.impl.MiningApplicationStagesImpl"
)
@ProviderType
public interface MiningApplicationStages
	extends MiningApplicationStagesModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.mining.stage.service.model.impl.MiningApplicationStagesImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<MiningApplicationStages, Long>
		MINING_STAGES_ID_ACCESSOR =
			new Accessor<MiningApplicationStages, Long>() {

				@Override
				public Long get(
					MiningApplicationStages miningApplicationStages) {

					return miningApplicationStages.getMiningStagesId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<MiningApplicationStages> getTypeClass() {
					return MiningApplicationStages.class;
				}

			};

}