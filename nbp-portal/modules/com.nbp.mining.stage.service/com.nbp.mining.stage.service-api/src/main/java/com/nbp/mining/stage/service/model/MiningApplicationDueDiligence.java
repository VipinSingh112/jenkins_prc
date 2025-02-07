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
 * The extended model interface for the MiningApplicationDueDiligence service. Represents a row in the &quot;nbp_mining_due_dili&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationDueDiligenceModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.mining.stage.service.model.impl.MiningApplicationDueDiligenceImpl"
)
@ProviderType
public interface MiningApplicationDueDiligence
	extends MiningApplicationDueDiligenceModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.mining.stage.service.model.impl.MiningApplicationDueDiligenceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<MiningApplicationDueDiligence, Long>
		MINING_DUE_DILI_ID_ACCESSOR =
			new Accessor<MiningApplicationDueDiligence, Long>() {

				@Override
				public Long get(
					MiningApplicationDueDiligence
						miningApplicationDueDiligence) {

					return miningApplicationDueDiligence.getMiningDueDiliId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<MiningApplicationDueDiligence> getTypeClass() {
					return MiningApplicationDueDiligence.class;
				}

			};

}