/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the MiningFormFiveDelineation service. Represents a row in the &quot;nbp_delineation_area&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MiningFormFiveDelineationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.mining.lease.application.service.model.impl.MiningFormFiveDelineationImpl"
)
@ProviderType
public interface MiningFormFiveDelineation
	extends MiningFormFiveDelineationModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.mining.lease.application.service.model.impl.MiningFormFiveDelineationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<MiningFormFiveDelineation, Long>
		MINING_FORM_FIVE_DELINEATION_ID_ACCESSOR =
			new Accessor<MiningFormFiveDelineation, Long>() {

				@Override
				public Long get(
					MiningFormFiveDelineation miningFormFiveDelineation) {

					return miningFormFiveDelineation.
						getMiningFormFiveDelineationId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<MiningFormFiveDelineation> getTypeClass() {
					return MiningFormFiveDelineation.class;
				}

			};

}