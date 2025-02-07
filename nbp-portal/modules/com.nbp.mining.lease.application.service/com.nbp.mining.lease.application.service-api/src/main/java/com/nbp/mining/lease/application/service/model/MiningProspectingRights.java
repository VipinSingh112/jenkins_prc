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
 * The extended model interface for the MiningProspectingRights service. Represents a row in the &quot;nbp_mining_prospect_rights&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MiningProspectingRightsModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.mining.lease.application.service.model.impl.MiningProspectingRightsImpl"
)
@ProviderType
public interface MiningProspectingRights
	extends MiningProspectingRightsModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.mining.lease.application.service.model.impl.MiningProspectingRightsImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<MiningProspectingRights, Long>
		PROSPECTING_RIGHTS_ID_ACCESSOR =
			new Accessor<MiningProspectingRights, Long>() {

				@Override
				public Long get(
					MiningProspectingRights miningProspectingRights) {

					return miningProspectingRights.getProspectingRightsId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<MiningProspectingRights> getTypeClass() {
					return MiningProspectingRights.class;
				}

			};

}