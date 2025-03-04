/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.model.impl;

import com.nbp.fire.brigade.stage.service.model.FireBrigadeCertificate;
import com.nbp.fire.brigade.stage.service.service.FireBrigadeCertificateLocalServiceUtil;

/**
 * The extended model base implementation for the FireBrigadeCertificate service. Represents a row in the &quot;nbp_fire_brigade_certificate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FireBrigadeCertificateImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeCertificateImpl
 * @see FireBrigadeCertificate
 * @generated
 */
public abstract class FireBrigadeCertificateBaseImpl
	extends FireBrigadeCertificateModelImpl implements FireBrigadeCertificate {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a fire brigade certificate model instance should use the <code>FireBrigadeCertificate</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			FireBrigadeCertificateLocalServiceUtil.addFireBrigadeCertificate(
				this);
		}
		else {
			FireBrigadeCertificateLocalServiceUtil.updateFireBrigadeCertificate(
				this);
		}
	}

}