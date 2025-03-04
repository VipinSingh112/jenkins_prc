/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model.impl;

import com.nbp.miic.application.form.services.model.MiicSuspensionOfCet;
import com.nbp.miic.application.form.services.service.MiicSuspensionOfCetLocalServiceUtil;

/**
 * The extended model base implementation for the MiicSuspensionOfCet service. Represents a row in the &quot;nbp_miic_Suspension&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MiicSuspensionOfCetImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicSuspensionOfCetImpl
 * @see MiicSuspensionOfCet
 * @generated
 */
public abstract class MiicSuspensionOfCetBaseImpl
	extends MiicSuspensionOfCetModelImpl implements MiicSuspensionOfCet {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a miic suspension of cet model instance should use the <code>MiicSuspensionOfCet</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			MiicSuspensionOfCetLocalServiceUtil.addMiicSuspensionOfCet(this);
		}
		else {
			MiicSuspensionOfCetLocalServiceUtil.updateMiicSuspensionOfCet(this);
		}
	}

}