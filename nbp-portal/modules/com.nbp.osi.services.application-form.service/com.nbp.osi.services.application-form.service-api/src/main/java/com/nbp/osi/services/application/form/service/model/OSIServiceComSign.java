/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the OSIServiceComSign service. Represents a row in the &quot;nbp_osi_services_trus_com_sign&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OSIServiceComSignModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.osi.services.application.form.service.model.impl.OSIServiceComSignImpl"
)
@ProviderType
public interface OSIServiceComSign
	extends OSIServiceComSignModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.osi.services.application.form.service.model.impl.OSIServiceComSignImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<OSIServiceComSign, Long>
		OSI_COM_SIGN_ID_ACCESSOR = new Accessor<OSIServiceComSign, Long>() {

			@Override
			public Long get(OSIServiceComSign osiServiceComSign) {
				return osiServiceComSign.getOsiComSignId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<OSIServiceComSign> getTypeClass() {
				return OSIServiceComSign.class;
			}

		};

}