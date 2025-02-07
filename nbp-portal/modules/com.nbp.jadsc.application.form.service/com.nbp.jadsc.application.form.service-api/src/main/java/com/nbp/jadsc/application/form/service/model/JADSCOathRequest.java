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
 * The extended model interface for the JADSCOathRequest service. Represents a row in the &quot;nbp_jadsc_oath_request&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCOathRequestModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.jadsc.application.form.service.model.impl.JADSCOathRequestImpl"
)
@ProviderType
public interface JADSCOathRequest
	extends JADSCOathRequestModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.jadsc.application.form.service.model.impl.JADSCOathRequestImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<JADSCOathRequest, Long>
		JADSC_OATH_REQUEST_ID_ACCESSOR =
			new Accessor<JADSCOathRequest, Long>() {

				@Override
				public Long get(JADSCOathRequest jadscOathRequest) {
					return jadscOathRequest.getJadscOathRequestId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<JADSCOathRequest> getTypeClass() {
					return JADSCOathRequest.class;
				}

			};

}