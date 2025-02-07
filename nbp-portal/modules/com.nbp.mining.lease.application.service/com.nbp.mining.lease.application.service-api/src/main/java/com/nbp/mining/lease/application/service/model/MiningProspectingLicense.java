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
 * The extended model interface for the MiningProspectingLicense service. Represents a row in the &quot;nbp_mining_prospect_license&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MiningProspectingLicenseModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.mining.lease.application.service.model.impl.MiningProspectingLicenseImpl"
)
@ProviderType
public interface MiningProspectingLicense
	extends MiningProspectingLicenseModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.mining.lease.application.service.model.impl.MiningProspectingLicenseImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<MiningProspectingLicense, Long>
		MINING_PROSPECTING_LICENSE_ID_ACCESSOR =
			new Accessor<MiningProspectingLicense, Long>() {

				@Override
				public Long get(
					MiningProspectingLicense miningProspectingLicense) {

					return miningProspectingLicense.
						getMiningProspectingLicenseId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<MiningProspectingLicense> getTypeClass() {
					return MiningProspectingLicense.class;
				}

			};

}