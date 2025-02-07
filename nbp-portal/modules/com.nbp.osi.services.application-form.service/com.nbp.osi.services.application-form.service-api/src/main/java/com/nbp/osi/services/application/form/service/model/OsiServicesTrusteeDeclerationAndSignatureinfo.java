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
 * The extended model interface for the OsiServicesTrusteeDeclerationAndSignatureinfo service. Represents a row in the &quot;nbp_osi_services_trus_in_decl&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeDeclerationAndSignatureinfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeDeclerationAndSignatureinfoImpl"
)
@ProviderType
public interface OsiServicesTrusteeDeclerationAndSignatureinfo
	extends OsiServicesTrusteeDeclerationAndSignatureinfoModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeDeclerationAndSignatureinfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor
		<OsiServicesTrusteeDeclerationAndSignatureinfo, Long>
			OSI_DECLERATION_ID_ACCESSOR =
				new Accessor
					<OsiServicesTrusteeDeclerationAndSignatureinfo, Long>() {

					@Override
					public Long get(
						OsiServicesTrusteeDeclerationAndSignatureinfo
							osiServicesTrusteeDeclerationAndSignatureinfo) {

						return osiServicesTrusteeDeclerationAndSignatureinfo.
							getOsiDeclerationId();
					}

					@Override
					public Class<Long> getAttributeClass() {
						return Long.class;
					}

					@Override
					public Class<OsiServicesTrusteeDeclerationAndSignatureinfo>
						getTypeClass() {

						return OsiServicesTrusteeDeclerationAndSignatureinfo.
							class;
					}

				};

}