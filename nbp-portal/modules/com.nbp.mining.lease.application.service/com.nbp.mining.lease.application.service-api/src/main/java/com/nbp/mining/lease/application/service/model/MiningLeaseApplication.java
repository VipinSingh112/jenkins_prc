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
 * The extended model interface for the MiningLeaseApplication service. Represents a row in the &quot;nbp_mining_applications&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MiningLeaseApplicationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.mining.lease.application.service.model.impl.MiningLeaseApplicationImpl"
)
@ProviderType
public interface MiningLeaseApplication
	extends MiningLeaseApplicationModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.mining.lease.application.service.model.impl.MiningLeaseApplicationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<MiningLeaseApplication, Long>
		MINING_LEASE_APPLICATION_ID_ACCESSOR =
			new Accessor<MiningLeaseApplication, Long>() {

				@Override
				public Long get(MiningLeaseApplication miningLeaseApplication) {
					return miningLeaseApplication.getMiningLeaseApplicationId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<MiningLeaseApplication> getTypeClass() {
					return MiningLeaseApplication.class;
				}

			};

}