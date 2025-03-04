/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.model.impl;

import com.nbp.mining.stage.service.model.MiningApplicationDeskVeri;
import com.nbp.mining.stage.service.service.MiningApplicationDeskVeriLocalServiceUtil;

/**
 * The extended model base implementation for the MiningApplicationDeskVeri service. Represents a row in the &quot;nbp_mining_desk_verifi&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MiningApplicationDeskVeriImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationDeskVeriImpl
 * @see MiningApplicationDeskVeri
 * @generated
 */
public abstract class MiningApplicationDeskVeriBaseImpl
	extends MiningApplicationDeskVeriModelImpl
	implements MiningApplicationDeskVeri {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a mining application desk veri model instance should use the <code>MiningApplicationDeskVeri</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			MiningApplicationDeskVeriLocalServiceUtil.
				addMiningApplicationDeskVeri(this);
		}
		else {
			MiningApplicationDeskVeriLocalServiceUtil.
				updateMiningApplicationDeskVeri(this);
		}
	}

}