/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the JADSCCertificateOfServiceAddForm service. Represents a row in the &quot;nbp_jadsc_certif_servic_add&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCertificateOfServiceAddFormModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfServiceAddFormImpl"
)
@ProviderType
public interface JADSCCertificateOfServiceAddForm
	extends JADSCCertificateOfServiceAddFormModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfServiceAddFormImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<JADSCCertificateOfServiceAddForm, Long>
		JADSC_COS_ID_ACCESSOR =
			new Accessor<JADSCCertificateOfServiceAddForm, Long>() {

				@Override
				public Long get(
					JADSCCertificateOfServiceAddForm
						jadscCertificateOfServiceAddForm) {

					return jadscCertificateOfServiceAddForm.getJadscCOSId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<JADSCCertificateOfServiceAddForm> getTypeClass() {
					return JADSCCertificateOfServiceAddForm.class;
				}

			};

}