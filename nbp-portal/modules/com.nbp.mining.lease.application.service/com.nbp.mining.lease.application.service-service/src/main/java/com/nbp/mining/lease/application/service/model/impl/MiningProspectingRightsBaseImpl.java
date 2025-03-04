/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.model.impl;

import com.nbp.mining.lease.application.service.model.MiningProspectingRights;
import com.nbp.mining.lease.application.service.service.MiningProspectingRightsLocalServiceUtil;

/**
 * The extended model base implementation for the MiningProspectingRights service. Represents a row in the &quot;nbp_mining_prospect_rights&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MiningProspectingRightsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningProspectingRightsImpl
 * @see MiningProspectingRights
 * @generated
 */
public abstract class MiningProspectingRightsBaseImpl
	extends MiningProspectingRightsModelImpl
	implements MiningProspectingRights {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a mining prospecting rights model instance should use the <code>MiningProspectingRights</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			MiningProspectingRightsLocalServiceUtil.addMiningProspectingRights(
				this);
		}
		else {
			MiningProspectingRightsLocalServiceUtil.
				updateMiningProspectingRights(this);
		}
	}

}