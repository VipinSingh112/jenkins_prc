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
 * The extended model interface for the MiningRenewalLicence service. Represents a row in the &quot;nbp_mining_renew_licence&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MiningRenewalLicenceModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.mining.lease.application.service.model.impl.MiningRenewalLicenceImpl"
)
@ProviderType
public interface MiningRenewalLicence
	extends MiningRenewalLicenceModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.mining.lease.application.service.model.impl.MiningRenewalLicenceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<MiningRenewalLicence, Long>
		MINING_RENEWAL_LICENCE_ID_ACCESSOR =
			new Accessor<MiningRenewalLicence, Long>() {

				@Override
				public Long get(MiningRenewalLicence miningRenewalLicence) {
					return miningRenewalLicence.getMiningRenewalLicenceId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<MiningRenewalLicence> getTypeClass() {
					return MiningRenewalLicence.class;
				}

			};

}