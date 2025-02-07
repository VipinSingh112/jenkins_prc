/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.nbp.sez.status.application.form.service.model.SezDevShareDirectorAdd;
import com.nbp.sez.status.application.form.service.service.SezDevShareDirectorAddLocalServiceUtil;

/**
 * The extended model base implementation for the SezDevShareDirectorAdd service. Represents a row in the &quot;nbp_sez_dev_share_director_add&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SezDevShareDirectorAddImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevShareDirectorAddImpl
 * @see SezDevShareDirectorAdd
 * @generated
 */
public abstract class SezDevShareDirectorAddBaseImpl
	extends SezDevShareDirectorAddModelImpl implements SezDevShareDirectorAdd {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sez dev share director add model instance should use the <code>SezDevShareDirectorAdd</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			SezDevShareDirectorAddLocalServiceUtil.addSezDevShareDirectorAdd(
				this);
		}
		else {
			SezDevShareDirectorAddLocalServiceUtil.updateSezDevShareDirectorAdd(
				this);
		}
	}

}