/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.stages.services.model.impl;

import com.nbp.ncra.stages.services.model.CertificateOfVerification;
import com.nbp.ncra.stages.services.service.CertificateOfVerificationLocalServiceUtil;

/**
 * The extended model base implementation for the CertificateOfVerification service. Represents a row in the &quot;nbp_certificate_of_verifi&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CertificateOfVerificationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CertificateOfVerificationImpl
 * @see CertificateOfVerification
 * @generated
 */
public abstract class CertificateOfVerificationBaseImpl
	extends CertificateOfVerificationModelImpl
	implements CertificateOfVerification {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a certificate of verification model instance should use the <code>CertificateOfVerification</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			CertificateOfVerificationLocalServiceUtil.
				addCertificateOfVerification(this);
		}
		else {
			CertificateOfVerificationLocalServiceUtil.
				updateCertificateOfVerification(this);
		}
	}

}