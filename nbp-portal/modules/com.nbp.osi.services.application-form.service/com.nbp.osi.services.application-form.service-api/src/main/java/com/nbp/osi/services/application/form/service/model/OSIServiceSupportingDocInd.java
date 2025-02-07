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
 * The extended model interface for the OSIServiceSupportingDocInd service. Represents a row in the &quot;nbp_osi_services_sup_doc_ind&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OSIServiceSupportingDocIndModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.osi.services.application.form.service.model.impl.OSIServiceSupportingDocIndImpl"
)
@ProviderType
public interface OSIServiceSupportingDocInd
	extends OSIServiceSupportingDocIndModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.osi.services.application.form.service.model.impl.OSIServiceSupportingDocIndImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<OSIServiceSupportingDocInd, Long>
		O_SI_SERVICE_SUPPORTING_DOC_IND_ID_ACCESSOR =
			new Accessor<OSIServiceSupportingDocInd, Long>() {

				@Override
				public Long get(
					OSIServiceSupportingDocInd osiServiceSupportingDocInd) {

					return osiServiceSupportingDocInd.
						getOSIServiceSupportingDocIndId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<OSIServiceSupportingDocInd> getTypeClass() {
					return OSIServiceSupportingDocInd.class;
				}

			};

}