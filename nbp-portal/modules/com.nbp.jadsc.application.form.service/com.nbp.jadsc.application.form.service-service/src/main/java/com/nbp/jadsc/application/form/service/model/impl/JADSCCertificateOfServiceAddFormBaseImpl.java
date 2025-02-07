/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.model.impl;

import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfServiceAddForm;
import com.nbp.jadsc.application.form.service.service.JADSCCertificateOfServiceAddFormLocalServiceUtil;

/**
 * The extended model base implementation for the JADSCCertificateOfServiceAddForm service. Represents a row in the &quot;nbp_jadsc_certif_servic_add&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link JADSCCertificateOfServiceAddFormImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCertificateOfServiceAddFormImpl
 * @see JADSCCertificateOfServiceAddForm
 * @generated
 */
public abstract class JADSCCertificateOfServiceAddFormBaseImpl
	extends JADSCCertificateOfServiceAddFormModelImpl
	implements JADSCCertificateOfServiceAddForm {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a jadsc certificate of service add form model instance should use the <code>JADSCCertificateOfServiceAddForm</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			JADSCCertificateOfServiceAddFormLocalServiceUtil.
				addJADSCCertificateOfServiceAddForm(this);
		}
		else {
			JADSCCertificateOfServiceAddFormLocalServiceUtil.
				updateJADSCCertificateOfServiceAddForm(this);
		}
	}

}