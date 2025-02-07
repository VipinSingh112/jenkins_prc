/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.nbp.sez.status.application.form.service.model.SezDevShareComDirectorShipAdd;
import com.nbp.sez.status.application.form.service.service.SezDevShareComDirectorShipAddLocalServiceUtil;

/**
 * The extended model base implementation for the SezDevShareComDirectorShipAdd service. Represents a row in the &quot;nbp_sez_dev_share_com_dire_add&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SezDevShareComDirectorShipAddImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevShareComDirectorShipAddImpl
 * @see SezDevShareComDirectorShipAdd
 * @generated
 */
public abstract class SezDevShareComDirectorShipAddBaseImpl
	extends SezDevShareComDirectorShipAddModelImpl
	implements SezDevShareComDirectorShipAdd {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sez dev share com director ship add model instance should use the <code>SezDevShareComDirectorShipAdd</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			SezDevShareComDirectorShipAddLocalServiceUtil.
				addSezDevShareComDirectorShipAdd(this);
		}
		else {
			SezDevShareComDirectorShipAddLocalServiceUtil.
				updateSezDevShareComDirectorShipAdd(this);
		}
	}

}