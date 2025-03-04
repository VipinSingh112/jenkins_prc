/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.model.impl;

import com.nbp.jadsc.stage.services.model.JadscAppliPreliminationDete;
import com.nbp.jadsc.stage.services.service.JadscAppliPreliminationDeteLocalServiceUtil;

/**
 * The extended model base implementation for the JadscAppliPreliminationDete service. Represents a row in the &quot;nbp_jadsc_appli_preli_deter&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link JadscAppliPreliminationDeteImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliPreliminationDeteImpl
 * @see JadscAppliPreliminationDete
 * @generated
 */
public abstract class JadscAppliPreliminationDeteBaseImpl
	extends JadscAppliPreliminationDeteModelImpl
	implements JadscAppliPreliminationDete {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a jadsc appli prelimination dete model instance should use the <code>JadscAppliPreliminationDete</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			JadscAppliPreliminationDeteLocalServiceUtil.
				addJadscAppliPreliminationDete(this);
		}
		else {
			JadscAppliPreliminationDeteLocalServiceUtil.
				updateJadscAppliPreliminationDete(this);
		}
	}

}